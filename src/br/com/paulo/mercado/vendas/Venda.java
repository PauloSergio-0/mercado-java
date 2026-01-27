package br.com.paulo.mercado.vendas;

public class Venda {
    private int id;
    private int idProduto;
    private int qtdVenda;
    private double valorVenda;

    public Venda(int id,int idProduto, int qtdVenda, double valorVenda) {
        this.id = id;
        this.idProduto = idProduto;
        this.qtdVenda = qtdVenda;
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return 
                "id: " + id +
                ", idProduto: " + idProduto +
                ", qtdVenda: " + qtdVenda +
                ", valorVenda: " + valorVenda ;
    }
}
