import br.inatel.cdg.app.impl.Observavel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteObservavel{

    Observavel aplicativo;

    @Before
    public void setup(){
        aplicativo = new Observavel();
    }

    @Test
    public void testNumeroDePalavrasNaFrase(){
        String frase = "Pedir ajuda não é sinal de fraqueza";
        int qtdPalavrasEsperadas = 7;
        aplicativo.contadorDePalavras(frase);

        assertEquals(qtdPalavrasEsperadas, aplicativo.getQtdDePalavras());
    }

    @Test
    public void testNumeroDePalavrasPares(){
        String frase = "Sempre é importante buscar a excelência, mas não podemos deixar de agir por conta dela.";
        int qtdPalavrasEsperadas = 6;
        aplicativo.paresDeCaracteres(frase);

        assertEquals(qtdPalavrasEsperadas, aplicativo.getParesDeCaracteres());
    }

    @Test
    public void testePalavraEmMaiusculo(){
        String frase = "Não sou vidente, mas eu me vejo no seu futuro -- Paulo Luczensky";
        int palavrasEsperadas = 3;

        aplicativo.palavrasComecadasEmMaiusculo(frase);
        assertEquals(palavrasEsperadas, aplicativo.getQtdPrimeiraLetraMaiuscula());
    }

    @Test
    public void testePalavraEmMaiusculoUsandoFraseEmMaiusculo(){
        String frase = "PEDIR AJUDA NÃO É SINAL DE FRAQUEZA.";
        int palavrasEsperadas = 7;

        aplicativo.palavrasComecadasEmMaiusculo(frase);
        assertEquals(palavrasEsperadas, aplicativo.getQtdPrimeiraLetraMaiuscula());
    }
}