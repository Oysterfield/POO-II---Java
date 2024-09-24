/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c1maven;

import java.util.ArrayList;

/**
 *
 * @author Win10
 */
public class C1Maven {
    private final ArrayList<C2> c2s;
    private double somaC1;

    public C1Maven() {
        this.c2s = new ArrayList<>();
    }

    public ArrayList<C2> getC2s() {
        return c2s;
    }
    public double getSoma() {
        return somaC1;
    }
    public void addSoma(double soma) {
        this.somaC1 += soma;
    }
}
    
   

