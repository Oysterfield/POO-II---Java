/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenc_empresas_04_06;

import java.util.Scanner;

/**
 *
 * @author cancian
 */
public class Cliente extends Colaborador{
    
    public Produto getProdutos() {
        //instancia.getLista();
    }
    
    public void fazerPedido() {
        Scanner scan = new Scanner(System.in);
        System.out.println(Produto.getLista());
        System.out.println("Escolha o produto que desejas comprar e a quantidade:");
        ItemDePedido item = new ItemDePedido(scan.next());
        
    }
    

    
    private Historico historicoDeCompras;
}
