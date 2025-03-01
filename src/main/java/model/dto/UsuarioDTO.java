/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dto;

/**
 *
 * @author gustavo
 */
public class UsuarioDTO {
    
    private String nome;
    private String email;
    private String senha;
    
   public UsuarioDTO (String nome,String email,String senha){
       this.nome = nome;
       this.email = email;
       this.senha = senha;
   }
   
   public UsuarioDTO(){
   }
   
   public String getNome(){
       return this.nome;
   }
   public String getEmail(){
       return this.email;
   }
   public String getSenha(){
       return this.senha;
   }
   public void setSenha(String senha){
       this.senha = senha;
   }
   
   
    
}
