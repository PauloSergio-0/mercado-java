package br.com.paulo.mercado.menu;

import java.util.Locale;
import java.util.Scanner;

import br.com.paulo.mercado.produtos.Produto;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


    public void mercadoSistema() {
        int opcao = 0;

        while (true) {
            opcoes();

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0){
                System.out.println("Saindo.....");
                break;
            }


        }


    }

    private void opcoes() {
        System.out.println("""
                
                MENU:\s
                1. Cadastrar Produto
                2. Vender produto
                0. Sair
                \s
                
                
                """);
    }

    private Produto cadrastoProduto(){
        return new Produto();
    }

}