package br.com.paulo.mercado.menu;

import java.util.Locale;
import java.util.Scanner;

import br.com.paulo.mercado.estoque.Estoque;
import br.com.paulo.mercado.produtos.Produto;
import br.com.paulo.mercado.service.ProdutoService;


public class Menu {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static final Estoque estoque = new Estoque();
    private static final ProdutoService produtoService= new ProdutoService();


    public void mercadoSistema() {
        int opcao = 0;
        estoque.mockProduto(mockProdutos("Feijão", "Grãos", 12, 12.50));
        estoque.mockProduto(mockProdutos("Arroz", "Grãos", 13, 8.50));
        estoque.mockProduto(mockProdutos("Suco", "Bebida", 8, 10.75));
        estoque.mockProduto(mockProdutos("Iphone", "Eletronico", 5, 899.99));

        while (true) {
            System.out.println("""
                
                MENU:\s
                1. Cadastrar Produto
                2. listar Produto
                3. Vender Produto
                4. Atualizar Produto
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

<<<<<<< HEAD
            } else if( opcao == 3){
                venderProduto();
            } else if ( opcao == 4) {
                System.out.println("Digite o ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                if(estoque.verificarID(id)) {
                    produtoService.atualizarProduto(id);
                } else {
                    System.out.println("Produto não encontrado");
                }

=======
            } else if (opcao == 3) {
                estoque.listarProdutos();
>>>>>>> 1e4fc9756dd1c056a7d635aa61e0e4fad2bcf9c0
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


<<<<<<< HEAD
        return new Produto(estoque.gerarId(),nomeProduto,tipoProduto,qtdProduto,precoProduto);
=======
        return new Produto(estoque.total_produtos() ,nomeProduto,tipoProduto,qtdProduto,precoProduto);
>>>>>>> 1e4fc9756dd1c056a7d635aa61e0e4fad2bcf9c0
    }

    public Produto mockProdutos(String nomeProduto, String tipoProduto,int qtdProduto, double precoProduto){

        return new Produto(estoque.gerarId(),nomeProduto,tipoProduto,qtdProduto,precoProduto);
    }

    public void venderProduto(){

        System.out.println("Escolha o id: ");
        int idVenda = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha o quantidade da venda: ");
        int qtdVenda = scanner.nextInt();
        scanner.nextLine();

        estoque.venderProduto(idVenda, qtdVenda);
    }


}