/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.dto.FuncionarioDTO;

/**
 *
 * @author gustavo
 */
public class FuncionarioDAO {
    
        PreparedStatement stm;

    
    public void cadastrarFuncionario(FuncionarioDTO dto){
        
        
        String sql = "INSERT INTO funcionarios (nome, data_de_admissao, salario,"
                + "status) VALUES (?, ?, ?, ?)";
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.setString(1, dto.getNome());
            stm.setDate(2, dto.getDataDeAdmissao());
            stm.setDouble(3, dto.getSalario());
            stm.setBoolean(4, dto.getStatus());
           
            
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Salvo");
        } catch (Exception e) {          
            JOptionPane.showMessageDialog(null, "Erro " + e);           
        }
    }
    
}
