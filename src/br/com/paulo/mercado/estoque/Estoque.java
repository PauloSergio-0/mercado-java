package br.com.paulo.mercado.estoque;

import br.com.paulo.mercado.produtos.Produto;
import br.com.paulo.mercado.vendas.Venda;

import java.util.ArrayList;
import java.util.Optional;

public class Estoque {
    protected static ArrayList<Produto> produtos = new ArrayList<>();
    protected static  ArrayList<Venda> vendas = new ArrayList<>();

    public static int gerarId (Class<?> typeClass){

        if (typeClass == Produto.class) {
            if (produtos.isEmpty()) {
                return 1;
            }

            return produtos.get(produtos.size() - 1).getId() + 1;

        } else if (typeClass == Venda.class) {
            if(vendas.isEmpty()){
                return 1;
            }

            return vendas.get(vendas.size() - 1).getId() + 1;
        } else {
            return -1;
        }
    }

    public void listarProdutos(){
        produtos.forEach( p -> System.out.println(p.toString()));
    }

    public void listarVendas(){
        vendas.forEach(v -> System.out.println(v.toString()));
    }

    public void mockProduto(Produto produto){
        produtos.add(produto);

    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);

        System.out.println("Foi adcionado " + produto.getQuantidadeProduto() + " de " + produto.getNomeProduto() + " ao estoque.");
    }
    public void adicionarVenda(Venda venda){
        vendas.add(venda);

        System.out.println("Foi vendido " +venda.getQtdVendida() + " unidades do produto com id " +venda.getId() +" por "+ venda.getValorVenda() + " reais");
    }

    public void venderProduto(int id, int qtdVenda){
        boolean encontrado = true;

        for(Produto produto :produtos){
            if(produto.getId() == id){
                if(!produto.isStatus()){
                    System.out.println("O produto está sem estoque");;
                }

                if(produto.getQuantidadeProduto() > qtdVenda){
                    produto.diminuirQtd(qtdVenda);

                    Venda venda = new Venda(gerarId(Venda.class), produto.getId(), qtdVenda, produto.getPrecoProduto() * qtdVenda);
                    adicionarVenda(venda);

                } else {
                    System.out.println("A quantidade da venda do item "+produto.getNomeProduto()+ "é superior ao o estoque que é de "+produto.getQuantidadeProduto());
                }
            }
        }

        if(!encontrado){
            System.out.println("Pruduto não encontrado");
        }
    }

    public boolean verificarID(int id){
        Optional<Produto> verificador = produtos.stream().
                filter(p  -> p.getId() == id ).
                findFirst();

        return verificador.isPresent();
    }

}