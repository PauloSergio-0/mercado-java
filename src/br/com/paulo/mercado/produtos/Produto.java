package br.com.paulo.mercado.produtos;

public class Produto {

    private String nomeProduto;
    private String tipoProduto;
    private int quantidadeProduto;
    private float precoProduto;


    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public Produto(String nomeProduto, String tipoProduto, int quantidadeProduto, float precoProduto){
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nomeProduto +
                "\nTipo: " + this.tipoProduto +
                "\nQuantidade: " + this.quantidadeProduto +
                "\nPreço: " + this.precoProduto;
    }
}
