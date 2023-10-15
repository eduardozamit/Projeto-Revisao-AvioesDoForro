package main.java.services;

import main.java.model.Caminhao;
import main.java.model.Cidade;
import main.java.model.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Transporte {

   //Retorna a distância entre duas cidades
   private static int calcularDistancia(String cidadeOrigem, String cidadeDestino) {
      try (BufferedReader br = new BufferedReader(new FileReader("DistanciasCidadesCSV.csv"))) {
         String line;
         String[] cidades = br.readLine().split(";");
         int indexCidadeOrigem = -1;
         int indexCidadeDestino = -1;

         //Neste trecho, é percorrida a matriz de cidades para encontrar os índices das cidades de origem e destino especificadas.
         for (int i = 0; i < cidades.length; i++) {
            if (cidades[i].equals(cidadeOrigem)) {
               indexCidadeOrigem = i;
            }
            if (cidades[i].equals(cidadeDestino)) {
               indexCidadeDestino = i;
            }
         }

         //Se os índices das cidades de origem e destino forem encontrados, o programa percorre o arquivo até a linha correspondente à cidade de origem e retorna a distância correspondente.
         if (indexCidadeOrigem != -1 && indexCidadeDestino != -1) {
            for (int i = 0; (line = br.readLine()) != null; i++) {
               if (i == indexCidadeOrigem) {
                  String[] valores = line.split(";");
                  return Integer.parseInt(valores[indexCidadeDestino]);
               }
            }
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
      return -1; // Retorna -1 se não encontrar a distância
   }
}