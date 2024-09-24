/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenc_empresas_04_06;

/**
 *
 * @author cancian
 */
public class ItemDePedido {

    public ItemDePedido(int quantidade) {
        this.quantidade = quantidade;
        // herdar preco do produto
        // setar total aqui
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
	
    public double getTotal() {
        return total;
    }
    
    public void setTotal() {
        total = preco*quantidade;
    }
 
    private int quantidade;
    private double preco;
    private double total;
}
