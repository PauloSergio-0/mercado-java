package br.com.paulo.mercado.menu;

import java.util.Locale;
import java.util.Scanner;

import br.com.paulo.mercado.estoque.Estoque;
import br.com.paulo.mercado.produtos.Produto;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static final Estoque estoque = new Estoque();

    public void mercadoSistema() {
        int opcao = 0;

        while (true) {
            System.out.println("""
                
                MENU:\s
                1. Cadastrar Produto
                2. listar Produto
                3. Vender Produto
                0. Sair
                \s
                
                
                """);

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0){
                System.out.println("Saindo.....");
                break;

            } else if (opcao == 1) {
                estoque.adcionarProduto(cadrastoProduto());

            } else if (opcao == 2) {
                estoque.listarProdutos();

            }


        }


    }


    private Produto cadrastoProduto(){
        System.out.println("Nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Tipo do produto: ");
        String tipoProduto = scanner.nextLine();

        System.out.println("Quantidade do produto");
        int qtdProduto = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Preço do produto");
        double precoProduto= scanner.nextDouble();
        scanner.nextLine();


        return new Produto(nomeProduto,tipoProduto,qtdProduto,precoProduto);
    }

}