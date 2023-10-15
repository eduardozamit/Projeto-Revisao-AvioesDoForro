package main.java;

import main.java.services.Transporte;

import java.util.Scanner;

import static main.java.services.Transporte.consultarTrechosModalidades;

public class Menu {
    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 4) {
            System.out.println("""
                 ----------- Selecione uma opção: ------------\s
                 Opção: 1 - Consultar Trechos e Modalidades\s
                 Opção: 2 - Cadastrar transporte\s
                 Opção: 3 - Consultar dados estatísticos\s
                 Opção: 4 - Finalizar programa\s
                 ---------------------------------------------\
                """);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("opcao 1");
                    consultarTrechosModalidades();
                    break;
                case 2:
                    System.out.println("opcao 2");
                    break;
                case 3:
                    System.out.println("opcao 3");
                    break;
                case 4:
                    System.out.println("vazando");
                    break;
                default:
                    System.out.println("opcao invalida");
            }
        }
        scanner.close();
    }
}