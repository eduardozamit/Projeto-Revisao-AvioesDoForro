import main.java.model.Cidade;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CidadeTest {

    @Test
    public void obterListaDeCidadesDoCSVtest() throws IOException {
        //Criar um arquivo temporário com algumas cidades.
        String conteudoArquivo = "cdd1;cdd2;cdd3";
        Path tempFile = Files.createTempFile("cidades", ".csv");
        Files.write(tempFile, conteudoArquivo.getBytes());

        //Chamar o método e ver se a lista de cidades está certa.
        List<Cidade> cidades = Cidade.obterListaDeCidadesDoCSV(tempFile.toString());

        //Verificar se a lista tem as respectivas cidades
        assertEquals(3, cidades.size());
        assertEquals("cdd1", cidades.get(0).getNome());
        assertEquals("cdd2", cidades.get(1).getNome());
        assertEquals("cdd3", cidades.get(2).getNome());
    }
}
