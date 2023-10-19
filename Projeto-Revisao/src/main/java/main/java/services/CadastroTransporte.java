package main.java.services;

public class CadastroTransporte extends Transporte {

    //O programa deverá permitir ao usuário adicionar uma lista de itens a transportar (e seus pesos). *CONCLUIDO
    //O programa deverá calcular a distância total a ser percorrida e identificar o modelo de caminhão. *NÃO REALIZADO(não soube fazer)
    //...mais adequado para este transporte e mostra os custos (por trecho e totais). *CONCLUIDO

    //Aqui o método lista a quantidade necessaria de caminhões utilizando o peso como parâmetro
    public void ListarCaminhoes(int peso){
        int quantidadeGrande = peso / 10;
        int resto = peso % 10;
        int quantidadeMedia = resto / 4;
        int resto2 = resto % 4;
        int quantidadePequena = resto2;
        System.out.print("Você vai precisar de: " + quantidadeGrande + " de caminhões grandes, " + quantidadeMedia + " de caminhões médios e " + quantidadePequena + " de caminhões pequenos.");
    }
}
