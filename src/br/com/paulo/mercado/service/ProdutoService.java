package br.com.paulo.mercado.service;

import br.com.paulo.mercado.estoque.Estoque;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoService extends Estoque {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void atualizarProduto( int id ){
        while (true){
            int opcao = menuAlteracao();

            if (opcao == 0) {
                System.out.println("Sem alterações");
                break;

            } else if (opcao == 1){
                atualizarNome(id);

            } else if (opcao == 2) {
                atualizarTipo(id);

            } else if (opcao == 3) {
                atualizarQtd(id);

            } else if (opcao == 4) {
                atualizarPreco(id);

            } else if (opcao == 5) {
                atualizarStatus(id);

            }
        }


    }

    private int menuAlteracao(){

        System.out.println(""" 
                Qual item deseja alterar: \s
                1. Nome
                2. Tipo
                3. Quantidade
                4. Preço
                5. Status
                0. Sair
                \s""");

        while (true) {
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao > 5 || opcao < 0){
                System.out.println("Opção invalida");
            } else {
                return opcao;
            }
        }
    }


    private void atualizarNome(int id){
        System.out.println("Novo nome: ");
        String nvNome = scanner.nextLine();

        produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .ifPresent(produto -> {
                    produto.setNomeProduto(nvNome);});
    }

    private void atualizarTipo(int id){
        System.out.println("Novo tipo: ");
        String nvTipo = scanner.nextLine();

        produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .ifPresent(p  -> {
                    p.setTipoProduto(nvTipo);});
    }

    private void atualizarQtd(int id){
        System.out.println("Nova quantidade: ");
        int nvQtd = scanner.nextInt();
        scanner.nextLine();

        produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .ifPresent(p -> {
                    p.setQuantidadeProduto(nvQtd);
                });
    }

    private void atualizarPreco(int id){
        System.out.println("Novo preço: ");
        double nvPreco = scanner.nextDouble();
        scanner.nextLine();

        produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .ifPresent(p -> {
                    p.setPrecoProduto(nvPreco);
                });
    }

    private void atualizarStatus(int id){
        Boolean nvStatus = null;

        while (nvStatus == null) {
            System.out.println("""
                     Status do produto:\s
                     1. Ativo
                     2. Desativo
                    
                    \s""");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if ( opcao < 1 || opcao > 2){
                System.out.println("Opção não encontrada");

            } else if (opcao == 1){
                 nvStatus = true;

            } else {
                nvStatus = false;

            }
        }

        boolean statulFinal = nvStatus;

        produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .ifPresent(p -> {
                    p.setStatus(statulFinal);
                });
    }


}
