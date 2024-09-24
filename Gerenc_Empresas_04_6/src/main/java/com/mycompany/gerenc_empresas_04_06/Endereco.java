package com.mycompany.gerenc_empresas_04_06;
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cancian
 */
public class Endereco  implements Serializable{

    public Endereco(String rua) throws Exception {
        if (rua.equals("")) {
            throw new Exception();
        }
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "Rua "+ getRua();
    }
    private String rua;

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

}
