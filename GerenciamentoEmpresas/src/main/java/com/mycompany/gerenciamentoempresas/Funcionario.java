/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoempresas;

/**
 *
 * @author Win10
 */
public class Funcionario extends Pessoa {
    
    private final Date dataAdmissao;
    private String cargo;
    private float salario;
    private String vinculo; //ou enum
    private final String[] historico;
    
    public Funcionario(String nome, String cpf, String endereco, String telefone, String email, Date dataAdmissao, String cargo, float salario, String vinculo, String[] historico) {
        super(nome, cpf, endereco, telefone, email);
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.salario = salario;
        this.vinculo = vinculo;
        this.historico = historico;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return endereco;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Date getdataAdmissao() {
        return endereco;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public float getSalario() {
        return Salario;
    }
    
    public void setSalario(flaot salario) {
        this.salario = salario;
    }
    
    public String getVinculo() {
        return vinculo;
    }
    
    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }
    
    public void getHistorico() {
        return historico;
    }
}
