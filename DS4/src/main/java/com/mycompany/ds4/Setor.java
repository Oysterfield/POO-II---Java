/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Win10
 */
public class Setor {
    private String nome;
    private final HashSet<Setor> subsetores = new HashSet<>();
    private final HashSet<Funcionario> funcionarios = new HashSet<>();
    private Funcionario responsavel;
    
    public int numFuncionarios() {
        return funcionarios.size();
        }
    
    // Não pode existir ciclos
    public void addSubsetor(Setor_if setor, Empresa_if empresa) {
        Iterator i = empresa.getSetores().iterator();
        boolean podeAdd = true;
        while (i.hasNext()) {
            Setor_if proximo = i.next();
            if (proximo.equals(setor)) {
                System.out.println("Este setor já existe.");
                podeAdd = false;
                break;
            }
        }
        if (podeAdd) {
            getSubsetores.add(setor);
        }
    }
    //não pode ser de outro setor
    @Override
    public void addFuncionario(Funcionario_if funcionario, Empresa_if empresa, Setor_if setor) {
        Iterator i = empresa.getSetores().iterator();
        boolean podeAdd = true;
        while(i.hasNext()) {
            Setor_if proximo = i.next();
            if (proximo.getFuncionarios().contains(funcionario)) {
                System.out.println("Este funcionário já está em outro setor.");
                podeAdd = false;
                break;
            }
        }
        if (podeAdd) {
            getSubsetores().setor.add(Funcionario);
        }
    }
    
    //public Funcionario_if getResponsavel() {}
}

