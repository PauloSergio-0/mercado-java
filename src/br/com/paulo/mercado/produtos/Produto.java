package br.com.paulo.mercado.produtos;

public class Produto {
    private int id;
    private String nomeProduto;
    private String tipoProduto;
    private int quantidadeProduto;
    private double precoProduto;


    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void diminuirQtd(){
        if(this.quantidadeProduto>1) {
            this.quantidadeProduto--;

            System.out.println("");
        } else {
            System.out.println("Não há item no estoque");
        }
    }

    public Produto(String nomeProduto, String tipoProduto, int quantidadeProduto, double precoProduto){
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
