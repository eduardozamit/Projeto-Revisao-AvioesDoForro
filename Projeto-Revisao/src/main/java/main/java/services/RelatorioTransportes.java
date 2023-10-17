package main.java.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import main.java.model.Caminhao;
import main.java.model.Cidade;
import main.java.model.Produto;

public class RelatorioTransportes extends Transporte {
    public static void GeraRelatorio() {

        List<CadastroTransporte>  = new ArrayList<>();

        // Cálculos e geração do relatório
        double custoTotal = 0;
        Map<String, Double> custoPorTipoProduto = new HashMap<>();
        Map<String, Double> custoPorModalidade = new HashMap<>();
        int totalVeiculos = 0;
        int totalItens = 0;

        for (Transporte CadastroTransporte : cadastroTransporte) {
            custoTotal += cadastroTransporte.getCusto();
            totalVeiculos += cadastroTransporte.getNumeroVeiculos();
            totalItens += cadastroTransporte.getItensTransportados();

            custoPorTipoProduto.put(cadastroTransporte.getTipoProduto(), custoPorTipoProduto.getOrDefault(cadastroTransporte.getTipoProduto(), 0.0) + cadastroTransporte.getCusto());

            custoPorModalidade.put(cadastroTransporte.getModalidade(), custoPorModalidade.getOrDefault(cadastroTransporte.getModalidade(), 0.0) + cadastroTransporte.getCusto());
        }

        // Custo médio por trecho
        double custoMedioPorTrecho = custoTotal / totalVeiculos;

        // Custo médio por km
        double custoMedioPorKm = custoTotal / cadastroTransporte.stream().mapToDouble(Transporte::getDistancia).sum();

        // Exibir o relatório
        System.out.println("...:: Relatório de Transportes ::...");
        System.out.println("Custo Total: " + custoTotal);
        System.out.println("Custo Médio por Trecho: " + custoMedioPorTrecho);
        System.out.println("Custo Médio por Km: " + custoMedioPorKm);

        System.out.println("\nCusto por Tipo de Produto:");
        for (Map.Entry<String, Double> entry : custoPorTipoProduto.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nCusto por Modalidade de Transporte:");
        for (Map.Entry<String, Double> entry : custoPorModalidade.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nNúmero Total de Veículos Deslocados: " + totalVeiculos);
        System.out.println("Total de Itens Transportados: " + totalItens);
    }
}