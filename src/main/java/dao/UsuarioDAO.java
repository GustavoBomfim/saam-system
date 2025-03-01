/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
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
            JOptionPane.showMessageDialog(null, "Erro " + e);

        }
    }
    
}
