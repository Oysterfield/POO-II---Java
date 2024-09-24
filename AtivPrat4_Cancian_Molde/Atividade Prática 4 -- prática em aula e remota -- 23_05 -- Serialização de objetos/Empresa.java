/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufsc.ctc.ine.ine5404.gerenciamento_empresas.model;

/**
 *
 * @author cancian
 */
public class Empresa {

	public Empresa(String nome, String cnpj, AreaDeAtividade areaDeAtividade) throws Exception {
		if (nome.equals("") || cnpj.equals("") ) {
			throw new Exception();
		}
		this.nome = nome;
		this.cnpj = cnpj;
                this.areaDeAtividade = areaDeAtividade;
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
