/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.dto.FuncionarioDTO;
import model.service.FuncionarioService;

/**
 *
 * @author gustavo
 */
public class FuncionarioController {
    
    private final FuncionarioService service = new FuncionarioService();
    
    public void cadastrarFuncionario(FuncionarioDTO dto){
        service.cadastrarFuncionario(dto);
    }
    
    public List<FuncionarioDTO> buscarFuncionarios(){
        List<FuncionarioDTO> funcionarios = service.buscarFuncionarios();
        for(FuncionarioDTO funcionario : funcionarios){
            System.out.println(funcionario);
        }
        return service.buscarFuncionarios();
    }
    
}
