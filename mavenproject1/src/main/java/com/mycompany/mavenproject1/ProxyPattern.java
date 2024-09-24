/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 <p>
 @author developer
 */
public class ProxyPattern {
    public static void main(String[] args) {
	final Image IMAGE1 = new ProxyImage("HiRes_10MB_Photo1");
	final Image IMAGE2 = new ProxyImage("HiRes_10MB_Photo2");

	IMAGE1.displayImage(); // loading necessary
	IMAGE1.displayImage(); // loading unnecessary
	IMAGE2.displayImage(); // loading necessary
	IMAGE2.displayImage(); // loading unnecessary
	IMAGE1.displayImage(); // loading unnecessary
    }

}
