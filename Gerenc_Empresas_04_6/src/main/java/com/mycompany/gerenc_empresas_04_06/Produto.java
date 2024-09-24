/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenc_empresas_04_06;

import java.util.ArrayList;

/**
 *
 * @author cancian
 */
public class Produto {

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        this.nome = nome;
    }

    public static Categoria getCategoria() {
        return categoria;
    }

    public static void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public static String getDescricao() {
        return descricao;
    }

    public static void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static double getPreco() {
        return preco;
    }

    public static void setPreco(double preco) {
        this.preco = preco;
    }

    public static int getEstoque() {
        return estoque;
    }

    public static void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public static ArrayList<Produto> getLista() {
        return listaProdutos;
    }
    
    
    
    private static String nome;
    private static Categoria categoria;
    private static String descricao;
    private static double preco;
    private static int estoque;
    private static final ArrayList<Produto> listaProdutos = new ArrayList<>();
    //private String codigoID;
}
