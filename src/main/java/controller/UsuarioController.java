/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.dto.UsuarioDTO;
import model.service.UsuarioService;

/**
 *
 * @author gustavo
 */
public class UsuarioController {
    
    private final UsuarioService service = new UsuarioService();
    
    public void cadastrarUsuario(UsuarioDTO dto){
        service.cadastrarUsuario(dto);
    }
    
    public boolean logar(UsuarioDTO dto){
        return service.logar(dto);
    }
    
}
