package main.java.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<Cidade> obterListaDeCidadesDoCSV(String nomeArquivo) {
        List<Cidade> cidades = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String line;
            if ((line = br.readLine()) != null) {
                String[] cidadesArray = line.split(";");
                for (String nomeCidade : cidadesArray) {
                    cidades.add(new Cidade(nomeCidade));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cidades;
    }
}
