package main.java.services;

import java.util.Scanner;

public class CadastroTransporte extends Transporte{
    public static void cadastrarTransportes() {
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
