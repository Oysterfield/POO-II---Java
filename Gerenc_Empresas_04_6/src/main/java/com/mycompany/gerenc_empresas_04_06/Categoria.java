/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.gerenc_empresas_04_06;

import java.io.Serializable;

/**
 *
 * @author Win10
 */
public enum Categoria implements Serializable{
    MOBILIA("Mobília"),
    ELETRODOMESTICO("Eletrodoméstico"),
    ELETROELETRONICO("Eletroeletrônico");
    Categoria(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    private final String nome;
}