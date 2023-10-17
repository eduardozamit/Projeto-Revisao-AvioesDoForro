package main.java.model;

import java.text.Collator;
import java.util.Locale;

public class Caminhao {
    private String tipo;
    private double precoPorKm;
    private double capacidadeMaxima;

    private int ateOndeVale;

    public Caminhao(String tipo, double precoPorKm, double capacidadeMaxima, int ateOndeVale) {
        this.tipo = tipo;
        this.precoPorKm = precoPorKm;
        this.capacidadeMaxima = capacidadeMaxima;
        this.ateOndeVale = ateOndeVale;
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoPorKm() {
        return precoPorKm;
    }

    public void setPrecoPorKm(double precoPorKm) {
        this.precoPorKm = precoPorKm;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    //Método que deixa o usuário escolher um ônibus
    public static Caminhao selecionarCaminhao(String tipo) {
        Collator collator = Collator.getInstance(new Locale("pt", "BR"));
        collator.setStrength(Collator.PRIMARY);

        if (collator.equals(tipo, "pequeno")) {
            return new Caminhao("Pequeno", 5.83, 1, 0);
        } else if (collator.equals(tipo, "médio")) {
            return new Caminhao("Médio", 13.42, 4, 2);
        } else if (collator.equals(tipo, "grande")) {
            return new Caminhao("Grande", 29.21, 10, 8);
        } else throw new IllegalArgumentException("Tipo de caminhão inválido: " + tipo);
    }
}
