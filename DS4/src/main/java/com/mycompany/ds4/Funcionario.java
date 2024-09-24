/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds4;

import java.util.Iterator;

/**
 *
 * @author Win10
 */
public class Funcionario {
    public String nome;
    
    @Override
    public Boolean ehReponsavelPeloSetor(Setor_if setor) {
        return setor.getResponsavel().equals(this);
    }
    
    public Setor_if getSetorDeTrabalho(Empresa_if empresa) {
        Iterator i = empresa.getSetores().iterator();
        while(i.hasNext()) {
            Setor_if proximo = i.next();
            if (proximo.contains(this)) {
                return proximo;
            }
        }
    }
    
    public Funcionario_if getResponsavel(Empresa_if empresa) {
        return getSetorDeTrabalho().getResponsavel();
    }
}
