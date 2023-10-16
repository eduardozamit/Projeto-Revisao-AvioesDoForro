package main.java.services;
import java.util.ArrayList;

public class GeraRealatorio{
    // atributos que a classe ira receber
    ArrayList<String> relatorio = new ArrayList<String>();
    private int id=0;

    public GeraRelatorio(int id, String[] relatorio){
        //construtor
        this.relatorio = relatorio;
        this.id = id;
    }
    public void addDados(String[] relatorio) {
        if (id>relatorio.length){
            relatorio[id] = //array com: tipo de veiculo, custo total, custo medio por km, etc
                    id++;
        }
        else{
            System.out.println("A lista esta cheia esta cheio, deseja exluir os arquivos de dados? Digite; S(Sim), N(Nao)")
            String excluir = scanner.nextLine();

            if (excluir=="S"){
                relatorio.clear();
                System.out.println("Excluido com Sucesso");
            }
        }
    }
    public listarDados(){
        int i = 0;
        while (i < relatorio.length) {
            System.out.println(relatorio[i]);
            i++;
        }
    }
}
