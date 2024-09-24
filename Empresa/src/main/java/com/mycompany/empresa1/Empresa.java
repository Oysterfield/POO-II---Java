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
public class Empresa {

    private AreaAtuacao area;
    private String nome;
    private Setor organograma;
    private String cnpj;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    /**
     * @return the area
     */
    public AreaAtuacao getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(AreaAtuacao area) {
        this.area = area;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the organograma
     */
    public Setor getOrganograma() {
        return organograma;
    }

    /**
     * @param organograma the organograma to set
     */
    public void setOrganograma(Setor organograma) {
        this.organograma = organograma;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
