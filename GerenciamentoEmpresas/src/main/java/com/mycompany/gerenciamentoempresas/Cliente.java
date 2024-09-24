/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoempresas;

/**
 *
 * @author Win10
 */
public class Cliente extends Pessoa {
    
    public Produtos[] getProdutos() { 
        return empresa1.getProdutos();
    }
    
    public boolean fazerPedido() {
        System.out.println(empresa1.getProdutos());
        Scanner sc1 = new Scanner(System.in);
        ...
        
    }
    
    public String acompanharPedidos() {
        empresa1.getItemPedidoProduto().getAcompanhamentoProduto
    }
}
