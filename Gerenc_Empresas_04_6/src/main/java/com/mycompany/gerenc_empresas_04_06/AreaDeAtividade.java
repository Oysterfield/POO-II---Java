package com.mycompany.gerenc_empresas_04_06;
import java.io.Serializable;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author cancian
 */
public enum AreaDeAtividade  implements Serializable{
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
