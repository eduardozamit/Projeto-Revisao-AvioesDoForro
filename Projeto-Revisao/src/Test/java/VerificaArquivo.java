import java.io.File;

public class VerificaArquivo {
    public static void main(String[] args) {
        File file = new File("DistanciasCidadesCSV.csv");
        System.out.println("O arquivo existe? " + file.exists());
    }
}