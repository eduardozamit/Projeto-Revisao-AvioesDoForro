package main.java.model;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class Caminhao {
    Object[][] informacoes = {
            {"Classificação", "Preço por Km (R$/km)", "Capacidade Máxima", "Vale a Pena"},
            {"Grande",        29.21,                  10,                   8},
            {"Médio",         13.42,                  4,                    2},
            {"Pequeno",       5.83,                   1,                    0}

    };

    Object[][] lista={
            {"Tipo","Preco por Km"},
    };

    public void escolherCaminhao(int carga){
        int index = 1;
        while(carga>0){
            int contadorLista = 1;
            while(carga>(int)informacoes[index][3]){
                carga = carga-(int)informacoes[index][2];
                lista[contadorLista][0]= (String)informacoes[index][0];
                lista[contadorLista][1]= (double)informacoes[index][1];
                contadorLista++;
            }
            index++;
        }
        System.out.println(Arrays.deepToString(lista));
    }

}
