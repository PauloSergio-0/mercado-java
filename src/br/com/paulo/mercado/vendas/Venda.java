package br.com.paulo.mercado.vendas;

public class Venda {
    private int id;
    private int idProduto;
    private int qtdVendida;
    private double valorVenda;


    public Venda(int id,int idProduto, int qtdVendida, double valorVenda){
        this.id = id;
        this.idProduto = idProduto ;
        this.qtdVendida = qtdVendida ;
        this.valorVenda = valorVenda ;
    }

    public int getId() {
        return id;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public int getIdProduto() {
        return idProduto;
    }

    @Override
    public String toString() {
        return "Id: " + this.id
                +"\nId Produto: " +this.idProduto
                +"\nQuantia vendida: " + this.qtdVendida
                +"\nValor da venda: " + this.valorVenda+ "\n";
    }
}