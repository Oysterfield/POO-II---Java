/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa1;

/**
 *
 * @author Win10
 */
public class Programa2 {
    
    private int x;
    private int y;

    public Programa2(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    
    public static void main(String[] args, int x, int y) {
        
        x = 10;
        y = 10;
        
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$");
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
            }
            else {
                System.out.println("#####");
                System.out.println("$");
            }
    }
}
