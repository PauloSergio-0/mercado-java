package br.com.paulo.mercado.produtos;

public class Produto {
    private int id;
    private String nomeProduto;
    private String tipoProduto;
    private int quantidadeProduto;
    private double precoProduto;
    private int status;


    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void diminuirQtd(int qtdVenda){
        if(this.quantidadeProduto>qtdVenda) {
            this.quantidadeProduto -= qtdVenda;

            System.out.println("Foram vendidos "+ qtdVenda + "");
        } else {
            System.out.println("Não há itens no estoque o suficiente");
        }
    }

    public Produto(int id,String nomeProduto, String tipoProduto, int quantidadeProduto, double precoProduto){
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
        this.status = 0;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nomeProduto +
                "\nTipo: " + this.tipoProduto +
                "\nQuantidade: " + this.quantidadeProduto +
                "\nPreço: " + this.precoProduto;
    }
}
