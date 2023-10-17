package main.java.model;

public class Produto {
    private String nome;
    private double peso;

    public Produto(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    // Métodos getters e setters para acessar e modificar os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
