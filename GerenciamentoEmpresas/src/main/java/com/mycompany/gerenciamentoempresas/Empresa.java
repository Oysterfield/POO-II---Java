/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoempresas;

/**
 *
 * @author Win10
 */
public class Empresa {
    
    private String nome;
    private String cnpj;
    private String endereco;
    private areaAtividade area;
    private Setor organograma;
    private Produto[] produtos;
    private ItemPedidoProduto[] pedidosDeCompra;

    public Empresa(String nome, String cnpj, String endereco, areaAtividade area, Setor organograma, Produto[] produtos, ItemPedidoProduto[] pedidosDeCompra) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.area = area;
        this.organograma = organograma;
        this.produtos = produtos;
        this.pedidosDeCompra = pedidosDeCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public areaAtividade getArea() {
        return area;
    }

    public void setArea(areaAtividade area) {
        this.area = area;
    }

    public Setor getOrganograma() {
        return organograma;
    }

    public void setOrganograma(Setor organograma) {
        this.organograma = organograma;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public ItemPedidoProduto[] getPedidosDeCompra() {
        return pedidosDeCompra;
    }

    public void setPedidosDeCompra(ItemPedidoProduto[] pedidosDeCompra) {
        this.pedidosDeCompra = pedidosDeCompra;
    }
    
    
}
