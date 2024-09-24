/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle1;

/**
 *
 * @author Win10
 */
public class Rectangle1 {
    
    private float width;
    private float length;

    public Rectangle1() {
        this.width = 1;
        this.length = 1;
    }
    
    public float perimetro(float width, float length) {
        return width*2 + length*2;
    }
    
    public float area() {
        return this.width*this.length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width < 20.0 & width > 0.0) {
            this.width = width;
        }
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length < 20.0 & length > 0.0) {
            this.length = length;
        }
    }
    
    public static void main(String[] args) {
        
    }
}