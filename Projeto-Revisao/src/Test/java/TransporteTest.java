import main.java.services.ConsultarTrajetos;
import main.java.services.Transporte;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class TransporteTest {
    @Test
    void testcalcularDistancia() {
        //Não consegui também realizar esse teste unitario.
    }


    @Test
    public void testListarCidades() {
    // Redireciona a saída do console para um ByteArrayOutputStream
        ByteArrayOutputStream opS = new ByteArrayOutputStream();

        System.setOut(new PrintStream(opS, true, StandardCharsets.UTF_8));

        Transporte.listarCidades();
        System.setOut(System.out);

        String OutPut = opS.toString().trim();

        String OutputEsperado = "Cidade1\nCidade2";

        assertEquals(OutputEsperado, OutPut);
    }


    @Test
    public void testcidadeExiste() {
        ConsultarTrajetos ct = new ConsultarTrajetos();

        assertTrue(ConsultarTrajetos.cidadeExiste("SÃO PAULO"));

        assertFalse(ConsultarTrajetos.cidadeExiste("PINDAMONHENGABA"));

        assertTrue(ConsultarTrajetos.cidadeExiste("ARacAJu"));
    }

}