package main.java.services;

import java.io.*;
public class LeitorCSV {
    public static int lerDistancia(String cidadeOrigem, String cidadeDestino) {

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

    // Método para listar todas as cidades em pares de linhas
    public static void listarCidades() {
        try (BufferedReader br = new BufferedReader(new FileReader("DistanciasCidadesCSV.csv"))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] cidades = line.split(";");
                for (String cidade : cidades) {
                    System.out.println(cidade);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
