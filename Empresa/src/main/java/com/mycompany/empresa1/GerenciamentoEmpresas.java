/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.empresa1;

/**
 *
 * @author 09428030945
 */
public class GerenciamentoEmpresas {
    public static void main(String[] args) {
        Empresa e1 = new Empresa();
        e1.setOrganograma();
        
        Setor s1 = e1.getOrganograma();
        //ArrayList<Setor> subsetores = new ArrayList<Setor>();
        //subsetores.add(new Setor("Subdiretoria"));
        //subsetores.add(new Setor("Vendas"));
        //s1.setSubsetores(subsetores);
    }
}
