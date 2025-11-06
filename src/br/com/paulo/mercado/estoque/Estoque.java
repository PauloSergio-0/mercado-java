package br.com.paulo.mercado.estoque;

import br.com.paulo.mercado.produtos.Produto;

import java.util.ArrayList;

public class Estoque {
    private final ArrayList<Produto> produtos = new ArrayList<>();


    private void listarProdutos(){
        produtos.forEach( p -> System.out.println(p.toString()));
    }

    private void adcionarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Foi adcionado "+produto.getQuantidadeProduto()+" de " +produto.getNomeProduto()+" ao estoque.");
    }

}
