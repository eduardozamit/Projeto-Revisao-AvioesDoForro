package main.java.model;

public class Caminhao {
    private String tipo;
    private double precoPorKm;
    private double capacidadeMaxima;

    public Caminhao(String tipo, double precoPorKm, double capacidadeMaxima) {
        this.tipo = tipo;
        this.precoPorKm = precoPorKm;
        this.capacidadeMaxima = capacidadeMaxima;
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
        switch (tipo.toLowerCase()) {
            case "pequeno":
                return new Caminhao("Pequeno", 5.83, 1);
            case "médio":
                return new Caminhao("Médio", 13.42, 4);
            case "grande":
                return new Caminhao("Grande", 29.21, 10);
            default:
                throw new IllegalArgumentException("Tipo de caminhão inválido: " + tipo);
        }
    }
}
