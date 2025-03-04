/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
    
    
     public List<FuncionarioDTO> buscarFuncionarios(){
        String sql = "SELECT * FROM funcionarios";
        
        List<FuncionarioDTO> funcionarios = new ArrayList<>();
        
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.execute();
            
            ResultSet resultado = stm.executeQuery();
            
            while(resultado.next()){
                FuncionarioDTO funcionario = new FuncionarioDTO(
                        resultado.getLong("id"),
                        resultado.getString("nome"),
                        resultado.getDate("data_de_admissao"),
                        resultado.getDouble("salario"),
                        resultado.getBoolean("status")
                );
                funcionarios.add(funcionario);
            }
            stm.close();
            
        } catch (Exception e) {          
            JOptionPane.showMessageDialog(null, "Erro " + e);           
        }
        return funcionarios;
    }

    public void excluirFuncionario(Long id) {
        String sql = "DELETE FROM funcionarios WHERE id=?";
        
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.setLong(1, id);
           
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Funcionário excluído");

        } catch (Exception e) {          
            JOptionPane.showMessageDialog(null, "Erro " + e);           
        }
    }

    public List<FuncionarioDTO> buscarFuncionarioPorNome(String nome) {
        
        String sql = "SELECT * FROM funcionarios WHERE UPPER(nome) LIKE UPPER(?)";
        
        List<FuncionarioDTO> funcionarios = new ArrayList<>();

        
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            stm.setString(1,"%" + nome + "%");
            stm.execute();
            
            ResultSet resultado = stm.executeQuery();
            
            while(resultado.next()){
                FuncionarioDTO funcionario = new FuncionarioDTO(
                        resultado.getLong("id"),
                        resultado.getString("nome"),
                        resultado.getDate("data_de_admissao"),
                        resultado.getDouble("salario"),
                        resultado.getBoolean("status")
                );
                funcionarios.add(funcionario);
            }
            

        } catch (Exception e) {          
            JOptionPane.showMessageDialog(null, "Erro " + e);           
        }
        return funcionarios;
    }

    public void atualizarFuncionario(FuncionarioDTO funcionario) {
        String sql = "UPDATE funcionarios SET nome=?, salario=?  WHERE id=?";
        
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.setString(1, funcionario.getNome());
            stm.setDouble(2, funcionario.getSalario());
            stm.setLong(3, funcionario.getId());
           
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Funcionário " + funcionario.getNome() + " foi atualizado");
        } catch (Exception e) {          
            JOptionPane.showMessageDialog(null, "Erro " + e);           
        }
    }
    
    public void desativarFuncionario(Long id) {
        String sql = "UPDATE funcionarios SET status=false  WHERE id=?";
        
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.setLong(1, id);
           
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Funcionário foi desativado");
        } catch (Exception e) {          
            JOptionPane.showMessageDialog(null, "Erro " + e);           
        }
    }
    
}
