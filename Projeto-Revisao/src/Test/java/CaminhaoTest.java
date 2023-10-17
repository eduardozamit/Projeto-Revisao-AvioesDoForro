import main.java.model.Caminhao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaminhaoTest {
    @Test
    public void testSelecionadorCaminhao(){
        //teste para o caminhão pequeno.
        Caminhao miniCaminhao = Caminhao.selecionarCaminhao("pequeno");
        assertEquals("Pequeno", miniCaminhao.getTipo());
        assertEquals(5.83, miniCaminhao.getPrecoPorKm());
        assertEquals(1,miniCaminhao.getCapacidadeMaxima());

        //teste para o caminhão médio.
        Caminhao carreta = Caminhao.selecionarCaminhao("medio");
        assertEquals("Medio", carreta.getTipo());
        assertEquals(13.42, carreta.getPrecoPorKm());
        assertEquals(4, carreta.getCapacidadeMaxima());

        //teste para o caminhão grande.
        Caminhao OptimusPrime = Caminhao.selecionarCaminhao("grande");
        assertEquals("Grande",OptimusPrime.getTipo());
        assertEquals(29.21, OptimusPrime.getPrecoPorKm());
        assertEquals(10, OptimusPrime.getCapacidadeMaxima());
    }


}
