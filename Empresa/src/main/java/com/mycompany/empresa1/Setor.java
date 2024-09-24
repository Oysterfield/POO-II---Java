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
public class Setor {
    
    private String nome;
    private final ArrayList<Setor> subsetores = new ArrayList<Setor>();
    
    public void addSubsetor(Setor subsetor) {
        subsetores.add(subsetor);
    }
    
    public void removeSubsetor(Setor subsetor) {
        subsetores.remove(subsetor);
    }
}
