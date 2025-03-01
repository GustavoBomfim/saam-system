/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.service;

import dao.UsuarioDAO;
import model.dto.UsuarioDTO;
import model.util.Criptografar;

/**
 *
 * @author gustavo
 */

public class UsuarioService {
    
    UsuarioDAO dao = new UsuarioDAO();
    
    public void cadastrarUsuario(UsuarioDTO dto){
        String senhaCriptografada = Criptografar.criptografarSenha(dto.getSenha());
        dto.setSenha(senhaCriptografada);
        dao.cadastrarUsuario(dto);
    }
    
}
