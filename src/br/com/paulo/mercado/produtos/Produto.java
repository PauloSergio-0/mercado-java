package br.com.paulo.mercado.produtos;

public class Produto {
    private int id;
    private String nomeProduto;
    private String tipoProduto;
    private int quantidadeProduto;
    private double precoProduto;
<<<<<<< HEAD
    private boolean status = true;

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getId() {
        return id;
    }
=======
    private int status;
>>>>>>> 1e4fc9756dd1c056a7d635aa61e0e4fad2bcf9c0


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

<<<<<<< HEAD
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void diminuirQtd(int qtdVenda){

            this.quantidadeProduto -= qtdVenda;

            if (this.quantidadeProduto == 0){
                this.status = false;
            }
    }

    public Produto( int id,String nomeProduto, String tipoProduto, int quantidadeProduto, double precoProduto){
=======
    public void diminuirQtd(int qtdVenda){
        if(this.quantidadeProduto>qtdVenda) {
            this.quantidadeProduto -= qtdVenda;

            System.out.println("Foram vendidos "+ qtdVenda + "");
        } else {
            System.out.println("Não há itens no estoque o suficiente");
        }
    }

    public Produto(int id,String nomeProduto, String tipoProduto, int quantidadeProduto, double precoProduto){
>>>>>>> 1e4fc9756dd1c056a7d635aa61e0e4fad2bcf9c0
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
        this.status = 0;
    }

    @Override
    public String toString() {
        return "id: " + this.id +
                "\nNome: " + this.nomeProduto +
                "\nTipo: " + this.tipoProduto +
                "\nQuantidade: " + this.quantidadeProduto +
                "\nPreço: " + this.precoProduto;
    }
}
