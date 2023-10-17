package main.java.services;

import main.java.model.Caminhao;
import java.util.Scanner;

public class ConsultarTrajetos extends Transporte {

    public static void consultarTrechosModalidades(){
        Scanner scanner = new Scanner(System.in);
        //Lista todas as cidades disponíveis.
        System.out.println("Listando cidades abaixo...");
        listarCidades();

        //Calcula a distancia entre as cidades que o usuário digitou.
        System.out.print("Digite o nome da cidade de origem: ");
        String cidadeDeOrigem = scanner.nextLine().toUpperCase();
        while (!cidadeExiste(cidadeDeOrigem)) {
            System.out.println("A cidade digitada não existe. Por favor, digite uma cidade válida.");
            cidadeDeOrigem = scanner.nextLine().toUpperCase();
        }
        System.out.print("Digite o nome da cidade de Destino: ");
        String cidadeDeDestino = scanner.nextLine().toUpperCase();
        while (!cidadeExiste(cidadeDeDestino)) {
            System.out.println("A cidade digitada não existe. Por favor, digite uma cidade válida.");
            cidadeDeDestino = scanner.nextLine().toUpperCase();
        }
        double distancia = calcularDistancia(cidadeDeOrigem, cidadeDeDestino);

        //Seleciona o tipo de caminhão.
        String tipoDeCaminhao;
        do {
            System.out.print("Digite o tipo de caminhão (pequeno, médio ou grande): ");
            tipoDeCaminhao = scanner.nextLine().toLowerCase();
            if (!tipoDeCaminhao.equalsIgnoreCase("pequeno") && !tipoDeCaminhao.equalsIgnoreCase("médio") && !tipoDeCaminhao.equalsIgnoreCase("grande")) {
                System.out.println("Opção de caminhão inválida. Por favor, digite uma opção válida.");
            }
        }while (!tipoDeCaminhao.equalsIgnoreCase("pequeno") && !tipoDeCaminhao.equalsIgnoreCase("médio") && !tipoDeCaminhao.equalsIgnoreCase("grande"));
        Caminhao caminhao = Caminhao.selecionarCaminhao(tipoDeCaminhao.toLowerCase());


        //Exibe o resultado para o usuário
        System.out.println("---------------------- Consulta de trajeto: -----------------------");
        System.out.println("A distância percorrida entre " + cidadeDeOrigem + " e " + cidadeDeDestino + " foi de: " + distancia + " Km");
        System.out.println("E o custo total utilizando o caminhão " + caminhao.getTipo() + " foi de: R$ " + (distancia * caminhao.getPrecoPorKm()));
        System.out.println("-------------------------------------------------------------------");

        //Pergunta se o usuário deseja fazer uma nova consulta
        System.out.println("Deseja fazer uma nova consulta? (S/N)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            //Reinicia o processo de consulta
            consultarTrechosModalidades();
        } else {
            //Retorna para o menu principal
            System.out.println("Retornando para o menu principal...");
        }
    }
}