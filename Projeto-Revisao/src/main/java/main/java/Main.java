package main.java;

import main.java.services.*

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
                System.out.println("""
                         ----------- Selecione uma opção: ------------\s
                         Opção: 1 - Consultar Trechos e Modalidades\s
                         Opção: 2 - Cadastrar transporte\s
                         Opção: 3 - Consultar dados estatísticos\s
                         Opção: 0 - Finalizar programa\s
                         ---------------------------------------------\
                        """);
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("-------- Você Selecionou a opção 1 --------");
                        ConsultarTrajetos.consultarTrechosModalidades();
                        break;
                    case 2:
                        System.out.println("-------- Você Selecionou a opção 2 --------");
                        //cadastrarTransportes();
                        break;
                    case 3:
                        System.out.println("-------- Você Selecionou a opção 3 --------");
                        GeraRelatorio.listarDados();
                        break;
                    case 0:
                        System.out.println("Vazando do programa...");
                        break;
                    default:
                        System.out.println("Opção invalida amigão, tente novamente!");
                }
        }
        scanner.close();
    }
}