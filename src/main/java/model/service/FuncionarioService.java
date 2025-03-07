/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.service;

import model.dao.FuncionarioDAO;
import java.util.List;
import model.dto.FuncionarioDTO;

/**
 *
 * @author gustavo
 */
public class FuncionarioService {
    private final FuncionarioDAO dao = new FuncionarioDAO();
    
    public void cadastrarFuncionario(FuncionarioDTO dto){
        dao.cadastrarFuncionario(dto);
    }
    
    public List<FuncionarioDTO> buscarFuncionarios(){
        return dao.buscarFuncionarios();
    }

    public void excluirFuncionario(Long id) {
        dao.excluirFuncionario(id);
    }

    public List<FuncionarioDTO> buscarFuncionarioPorNome(String nome) {
        return dao.buscarFuncionarioPorNome(nome);
    }

    public void atualizarFuncionario(FuncionarioDTO funcionario) {
        dao.atualizarFuncionario(funcionario);
    }
    public void desativarFuncionario(Long id) {
        dao.desativarFuncionario(id);
    }
}
