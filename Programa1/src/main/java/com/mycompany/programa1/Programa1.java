/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package java.time;
import java.time.LocalDate;

/**
 *
 * @author 09428030945
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    
    private String nome;
    private String sobrenome;
    private String sexo;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private float altura;
    private float peso;

    public Programa1(String nome, String sobrenome, String sexo, byte diaNascimento, byte mesNascimento, short anoNascimento, float altura, float peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public int idade(int anoNascimento, int LocalDate) {
        return LocalDate - anoNascimento;
    }
    
    public int freqCardMax(int idade) {
        return 220 - idade;
    }
    
    public float[] freqCardAlvo(int freqCardMax) {
        float[] lista = new float[2];
        lista[0] = freqCardMax / 2;
        lista[1] = (freqCardMax / 100)*85;
        return lista;
    }
    
    public float IndMassaCorp(float peso, float altura) {
        return (float) (peso / Math.pow(altura,2));
    }

    public static void main(String[] args) {
        Programa1 Obj = new Programa1();
        System.out.println(Obj.getNome());
        System.out.println(Obj.getSobrenome());
        System.out.println(Obj.getSexo());
        System.out.println(Obj.getAnoNascimento());
        System.out.println(Obj.getDiaNascimento());
        System.out.println(Obj.getMesNascimento());
        System.out.println(Obj.getAltura());
        System.out.println(Obj.getPeso());
        System.out.println(Obj.idade(Obj.getAnoNascimento(), 0));
        System.out.println(Obj.IndMassaCorp(Obj.getPeso(), Obj.getAltura()));
        System.out.println(Obj.freqCardMax(Obj.idade(Obj.getAnoNascimento(), 0)));
        System.out.println(Obj.freqCardAlvo(Obj.freqCardMax(Obj.idade(Obj.getAnoNascimento(), 0))));
        System.out.println("BMI Values");
    }
}
