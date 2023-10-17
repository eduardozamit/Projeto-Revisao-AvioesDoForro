package main.java.services;

import java.util.Scanner;

public class RelatorioTransportes extends Transporte {
    public static void gerarRelatorio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                        |--------------------------------------------|\s
                        |      Em construção, volte em breve!        |\s
                        |--------------------------------------------|\s
                            (Tecle espaço para voltar ao menu...)
                        """);
        scanner.nextLine();
        scanner.nextLine();
    }
}