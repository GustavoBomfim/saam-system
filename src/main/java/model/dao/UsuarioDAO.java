/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.dto.UsuarioDTO;

/**
 *
 * @author gustavo
 */
public class UsuarioDAO {
    
    PreparedStatement stm;
    
    public void cadastrarUsuario(UsuarioDTO dto){
        
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.setString(1, dto.getNome());
            stm.setString(2, dto.getEmail());
            stm.setString(3, dto.getSenha());
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Salvo");
        } catch (Exception e) {
            if (e.getMessage().contains("unique_email")) {
                String mensagem = "O e-mail " + dto.getEmail() +" já foi cadastrado.";
                JOptionPane.showMessageDialog(null, mensagem);
                //throw new RuntimeException("E-mail já cadastrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro " + e);
            }

        }
    }
    
    public boolean logar(UsuarioDTO dto){
        String sql = "SELECT * FROM usuarios where email=? and senha=?";
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.setString(1, dto.getEmail());
            stm.setString(2, dto.getSenha());
            
            ResultSet resultado = stm.executeQuery();
            //stm.close();    
            return resultado.next();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro " + e);
            return false;
        }
    }
    
    
    public boolean atualizarSenhaFiltrandoPorEmail(String novaSenhaCriptografada, String email){
        String sql = "UPDATE usuarios SET senha=? WHERE email=?";
        
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.setString(1, novaSenhaCriptografada);
            stm.setString(2, email);
            
            int linhasAfetadas = stm.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Senha redefinida com sucesso!");
                return true;
            } 
            JOptionPane.showMessageDialog(null, "E-mail não encontrado.");
            return false;
            

        } catch (Exception e) {          
            JOptionPane.showMessageDialog(null, "Erro " + e);    
            return false;
        }
    }
    
}
