/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenc_empresas_04_06;

import java.util.ArrayList;

/**
 *
 * @author cancian
 */
enum Vinculo {
    CLT,
    ESTAGIARIO;
}

public class Funcionario extends Colaborador{
    private Cargo cargo;
    private double salario;
    private Vinculo vinculo;
    private ArrayList<HistoricoCargosSalarios> historico = new ArrayList<HistoricoCargosSalarios>();
    
}
