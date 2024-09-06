/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativprat4_cancian;

import java.io.Serializable;

/**
 *
 * @author cancian
 */
public class Endereco implements Serializable {

    public Endereco(String rua, String numero, String cep) throws Exception {
        if (rua.equals("") || (numero.equals("")) || cep.equals("")){
            this.rua = rua;
            this.numero = numero;
            this.cep = cep;
        }
    }

    @Override
    public String toString() {
        return "Rua "+ rua;
    }
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
    private String rua;
    private String numero;
    private String cep;
}
