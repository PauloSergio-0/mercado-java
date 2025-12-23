package br.com.paulo.mercado.estoque;

import br.com.paulo.mercado.produtos.Produto;

import java.util.ArrayList;
import java.util.Optional;

public class Estoque {
    protected static ArrayList<Produto> produtos = new ArrayList<>();
    int proximoId = 1;

    public int gerarId (){
        return proximoId++;
    }

    public void listarProdutos(){
        produtos.forEach( p -> System.out.println(p.toString()));
    }


    public void mockProduto(Produto produto){
        produtos.add(produto);

    }

    public void adcionarProduto(Produto produto){
        produtos.add(produto);

        System.out.println("Foi adcionado " + produto.getQuantidadeProduto() + " de " + produto.getNomeProduto() + " ao estoque.");
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
