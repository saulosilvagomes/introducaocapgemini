package controller;

import model.Produto;

public class Pedido {
    private String id;
    private String idCliente;
    private Produto produtos;
    private double ValorTotal = 0;
    private int quantidade = 0;

    public Pedido(String id, String idCliente, Produto produtos, double valorTotal, int quantidade){
        this.id = id;
        this.idCliente = idCliente;
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.ValorTotal = ValorTotal;
    }

    public void adicionarProduto(Produto p){
        quantidade++;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
       this.ValorTotal = produtos.getValorUnitario() * quantidade;
        return ValorTotal;
    }



    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }else{
            System.out.println("Quantidade tem que ser maior que zero.");
        }

    }


}
