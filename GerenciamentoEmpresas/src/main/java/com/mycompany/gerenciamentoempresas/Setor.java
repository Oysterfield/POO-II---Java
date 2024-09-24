/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoempresas;

/**
 *
 * @author Win10
 */
public class Setor {
    
    private Setor[] setores;
    private String nome;
    private String responsavel;
    private Funcionario[] funcionarios;

    public Setor(Setor[] setores, String nome, String responsavel, Funcionario[] funcionarios) {
        this.setores = setores;
        this.nome = nome;
        this.responsavel = responsavel;
        this.funcionarios = funcionarios;
    }

    public Setor[] getSetores() {
        return setores;
    }

    public void setSetores(Setor[] setores) {
        this.setores = setores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
}
