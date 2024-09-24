/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoempresas;

/**
 *
 * @author Win10
 */
abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    protected String email;

    public Pessoa(String nome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    
}
