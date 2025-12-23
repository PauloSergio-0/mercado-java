package br.com.paulo.mercado.produtos;

public class Produto {
    private int id;
    private String nomeProduto;
    private String tipoProduto;
    private int quantidadeProduto;
    private double precoProduto;
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


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

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
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
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
