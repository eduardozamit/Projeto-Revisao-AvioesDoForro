package main.java;

import main.java.services.CadastroTransporte;
import main.java.services.ConsultarTrajetos;
import main.java.services.ListaItens;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroTransporte ct = new CadastroTransporte();
        ListaItens li = new ListaItens();
        int opcao = -1;

        while (opcao != 0) {
                System.out.println("""
                         ----------- Selecione uma opção: ------------\s
                         Opção: 1 - Consultar Trechos e Modalidades\s
                         Opção: 2 - Cadastrar transporte\s
                         Opção: 3 - Consultar dados estatísticos\s
                         Opção: 4 - Consultar quantidade de caminhões\s
                         Opção: 5 - Cadastrar carga\s
                         Opção: 0 - Finalizar programa\s
                         ---------------------------------------------\
                        """);
                opcao = sc.nextInt();
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
                        //gerarRelatorio();
                        break;
                    case 4:
                        System.out.println("-------- Você Selecionou a opção 4 --------");
                        System.out.println("Qual o peso da carga total?");
                        int peso = sc.nextInt();
                        ct.ListarCaminhoes(peso);
                    case 5:
                        System.out.println("-------- Você Selecionou a opção 5 --------");
                        li.menuListas();
                    case 0:
                        System.out.println("Vazando do programa...");
                        break;
                    default:
                        System.out.println("Opção invalida amigão, tente novamente!");
                }
        }
        sc.close();
    }
}