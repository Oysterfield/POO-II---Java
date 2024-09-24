/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufsc.ctc.ine.ine5404.gerenciamento_empresas.model;

/**
 *
 * @author cancian
 */
public enum AreaDeAtividade {
    FINANCEIRA("Financeira"),
    SERVICOS("Serviços"),
    INDUSTRIA("Indústria"),
    COMERCIO("Comércio"),
    SAUDE("Saúde"),
    VAREJO("Varejo");
    AreaDeAtividade(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    private final String nome;
}
