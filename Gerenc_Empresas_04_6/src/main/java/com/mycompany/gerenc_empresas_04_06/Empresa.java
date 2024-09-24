package com.mycompany.gerenc_empresas_04_06;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author cancian
 */
public class Empresa implements Serializable {

	public Empresa(String nome, String cnpj, AreaDeAtividade areaDeAtividade, Endereco endereco) throws Exception {
		if (nome.equals("") || cnpj.equals("") || endereco==null ) {
			throw new Exception();
		}
		this.nome = nome;
		this.cnpj = cnpj;
                this.areaDeAtividade = areaDeAtividade;
                this.endereco = endereco;
	}
	
        public static Empresa leia(File arquivo) throws IOException {
            ObjectInputStream input = new ObjectInputStream(Files.newInputStream(arquivo.toPath()));
            Empresa novaEmpresa = null;
            try {
                novaEmpresa = (Empresa) input.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
            }
            return novaEmpresa;
        }
        
        public void salve(File arquivo) throws IOException {
          ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(arquivo.toPath())); //
          output.writeObject(this);
          output.close();
        }
        
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the areaDeAtividade
	 */
	public AreaDeAtividade getAreaDeAtividade() {
		return areaDeAtividade;
	}

	/**
	 * @param areaDeAtividade the areaDeAtividade to set
	 */
	public void setAreaDeAtividade(AreaDeAtividade areaDeAtividade) {
		this.areaDeAtividade = areaDeAtividade;
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
	
	private Endereco endereco;
	private AreaDeAtividade areaDeAtividade;
	private String cnpj; // deveria ser Classe CNPJ
	private String nome;
}
