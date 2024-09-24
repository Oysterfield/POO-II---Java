/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenc_empresas_04_06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author cancian
 */
public class PedidoDeCompra {
    
    public void setTotal() {
        Iterator<ItemDePedido> it = itens.iterator();
        while(it.hasNext())
            total += it.next().getTotal();
    }
    
    public void setEstado() {
        //solicitado
        //em andamento
        //enviado
        //cancelado
    }
    
    private final ArrayList<ItemDePedido> itens = new ArrayList<ItemDePedido>();
    private double total;
    private String estado; //ou enum
}
