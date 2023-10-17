package main.java.services;
import java.util.ArrayList;
import java.util.Scanner;
public class GeraRealatorio{
    Scanner scanner = new Scanner(System.in);
    // atributos que a classe ira receber
    ArrayList<String> relatorio = new ArrayList<String>();
    private int id;

    {
        id = 0;
    }

    public void GeraRelatorio(int id, ArrayList<String> relatorio){
        //construtor
        this.relatorio = relatorio;
        this.id = id;
    }
    public void addDados(int id, ArrayList<Integer> relatorio) {
        if (id>(int)relatorio.length){
            relatorio.set(id, 1);
            id++;
        }
        else{
            System.out.println("A lista esta cheia esta cheio, deseja exluir os arquivos de dados? Digite; 1:Sim, 2:Nao");
            int excluir = scanner.nextInt();

            if (excluir==1){
                relatorio.clear();
                System.out.println("Excluido com Sucesso");
            }
        }
    }
    public void listarDados(){
        int i = 0;
        while (i < (int)relatorio.length) {
            System.out.println(relatorio[i]);
            i++;
        }
    }
}
