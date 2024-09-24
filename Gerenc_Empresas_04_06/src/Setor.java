/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author cancian
 */
public class Setor {

	/**
	 * @return the subsetor
	 */
	public ArrayList<Setor> getSubsetor() {
		return subsetor;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the responsaveis
	 */
	public ArrayList<Funcionario> getResponsaveis() {
		return responsaveis;
	}
	private final ArrayList<Setor> subsetor = new ArrayList<>();
	private String descricao;
	private final ArrayList<Funcionario> responsaveis = new ArrayList<>();
}
