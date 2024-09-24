/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpletron;
import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Simpletron {

    final int READ = 10;
    final int WRITE = 11;
    final int LOAD = 20;
    final int STORE = 21; 
    final int ADD = 30;
    final int SUBTRACT = 31; 
    final int DIVIDE = 32; 
    final int MULTIPLY = 33; 
    final int BRANCH = 40;
    final int BRANCHNEG = 41; 
    final int BRANCHZERO = 42;
    final int HALT = 43; 
    
    private Integer accumulator; //acumulador
    private Integer instructionCounter; //posição na memória que contém a instrução
    private Integer operationCode; //operação
    private Integer operand; //posição da memória que a instrução opera
    private Integer instructionRegister;
    private final int[] memory = new int[100];

    public Simpletron() {
        this.accumulator = 0;
        this.instructionCounter = 0;
        this.operationCode = 0;
        this.operand = 0;
        this.instructionRegister = 0;
    }

    public Integer getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(Integer accumulator) {
        this.accumulator = accumulator;
    }

    public Integer getInstructionCounter() {
        return instructionCounter;
    }

    public void setInstructionCounter(Integer instructionCounter) {
        this.instructionCounter = instructionCounter;
    }

    public Integer getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(Integer operationCode) {
        this.operationCode = operationCode;
    }

    public Integer getOperand() {
        return operand;
    }

    public void setOperand(Integer operand) {
        this.operand = operand;
    }

    public Integer getInstructionRegister() {
        return instructionRegister;
    }

    public void setInstructionRegister(Integer instructionRegister) {
        this.instructionRegister = instructionRegister;
    }
    
    public void addAccumulator(Integer accumulator) {
        this.accumulator = accumulator;
    }
    
    public void executar() {
        boolean flag = true; //critério de parada do while da linha 88
        System.out.println("Hello World!");
        System.out.println("*** Welcome to Simpletron! ***");
        while (flag) {
            instructionCounter++;
            System.out.printf("%1d%", "instructionCounter ?\n");
            Scanner sc1 = new Scanner(System.in);
            if (sc1.nextInt() == -99999)
                flag = false;
                System.out.println("*** Program loading completed ***\n*** Program execution begins  ***");
        }    
        
        //operationCode = instructionRegister / 100;
        //operand = instructionRegister % 100;
            
        switch (operationCode) {
            case READ:
                System.out.println("Enter an integer");
                memory[operand] = sc1.nextInt();
                break;
                
            case WRITE:
                System.out.println(x);
                break;
                
            case LOAD:
                Simpletron.setAccumulator(memory[operand]);
                break;
                
            case STORE:
                
                break;
                
            case ADD:
                Simpletron.addAccumulator(memory[operand]);
                break;
                
            case SUBTRACT:
                
                break;
                
            case DIVIDE:
                
                break;
                
            case MULTIPLY:
                
                break;
                
            case BRANCH:
                
                break;
                
            case BRANCHNEG:
                
                break;
                
            case BRANCHZERO:
                
                break;
                
            case HALT:
                System.out.println("*** Simpletron execution terminated ***");
                break;
        }
    }
}
