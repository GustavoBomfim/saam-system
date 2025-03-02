/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

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
    
}
