/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.service;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import model.dto.UsuarioDTO;
import model.util.Criptografar;
import model.util.ValidadorEmail;

/**
 *
 * @author gustavo
 */

public class UsuarioService {
    
    UsuarioDAO dao = new UsuarioDAO();
    
    public void cadastrarUsuario(UsuarioDTO dto){
        if(validarCampos(dto, "cadastro") && ValidadorEmail.validarEmail(dto.getEmail())){
            String senhaCriptografada = Criptografar.criptografarSenha(dto.getSenha());
            dto.setSenha(senhaCriptografada);
            dao.cadastrarUsuario(dto);
        }
    }
    
    private boolean validarCampos (UsuarioDTO dto, String nomeFormulario){
        if(nomeFormulario.equals("cadastro") && (dto.getNome().isBlank() || 
                dto.getSenha().isBlank() || dto.getEmail().isBlank())){
            JOptionPane.showMessageDialog(null, "Todos os campos de cadastro devem estar preenchidos e não podem conter apenas espaços");
            return false;
        } else if(nomeFormulario.equals("login") && (dto.getSenha().isBlank() || 
                dto.getEmail().isBlank())){
            JOptionPane.showMessageDialog(null, "Todos os campos de login devem estar preenchidos e não podem conter apenas espaços");
            return false;
        }
        return true;
    }
    
    public boolean logar(UsuarioDTO dto){
        
        if(validarCampos(dto, "login")){
            String senhaCriptografada = Criptografar.criptografarSenha(dto.getSenha());
            dto.setSenha(senhaCriptografada);
            if(dao.logar(dto) == true){
                return true;
            }
            JOptionPane.showMessageDialog(null, "Email ou senha inválidos");
            return false;
        }
        return false;
    }
    
}
