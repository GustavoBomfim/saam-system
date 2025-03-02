/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dto;

import java.sql.Date;


/**
 *
 * @author gustavo
 */
public class FuncionarioDTO {

    private String nome;
    private Date dataDeAdmissao;
    private Double salario;
    private boolean status;
    
    
    public FuncionarioDTO(String nome, Date dataDeAdmissao, Double salario, boolean status){
        this.nome = nome;
        this.dataDeAdmissao = dataDeAdmissao;
        this.salario = salario;
        this.status = status;
    }
    
    public String getNome(){
        return this.nome;
    }

    public Date getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public Double getSalario() {
        return salario;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    @Override
    public String toString() {
        return "FuncionarioDTO{" +
               "nome='" + nome + '\'' +
               ", dataDeAdmissao=" + dataDeAdmissao +
               ", salario=" + salario +
               ", status=" + (status ? "Ativo" : "Inativo") +
               '}';
    }
}
