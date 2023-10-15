package main.java.services;

import main.java.model.Caminhao;
import main.java.model.Cidade;
import main.java.model.Produto;

import java.util.List;
import java.util.Scanner;

public class Transporte {
    static Scanner scanner = new Scanner(System.in);

    public static void consultarTrechosModalidades() {
        System.out.print("Digite a cidade de origem: ");
        String cidadeOrigem = scanner.nextLine();
        System.out.print("Digite a cidade de Destino: ");
        String cidadeDestino = scanner.nextLine();
        System.out.print("Digite o caminhão desejado: ");
        String caminhaoEscolhido = scanner.nextLine();
        //calcularDistancia(String cidadeOrigem, String cidadeDestino);
        //calcularCustoTotal(double distancia, Caminhao caminhaoEscolhido)

        System.out.println("A distância é de: " + "Km, e o custo será de R$: " );
    }




    //Métodos para serem usados em métodos
    public double calcularDistancia(Cidade origem, Cidade destino) {
        //Criar lógica para calcular a distância entre duas cidades
        return 0.0; //Substituir pelo retorno da distância entre as cidades
    }

    public Caminhao selecionarCaminhao(List<Produto> produtos) {
        //Criar lógica para selecionar o caminhão mais adequado com base nos produtos a serem transportados
        return null; //Substituir pelo retorno do caminhão mais adequado para transportar a lista de produtos
    }

    public double calcularCustoTotal(double distancia, Caminhao caminhao) {
        //Criar lógica para calcular o custo total com base na distância e caminhão
        return 0.0; //Substituir pelo retorno do custo total
    }
}