package francisco.roberto.uno.tddtesteunitario;

import org.junit.Before;
import org.junit.Test;

import java.io.PipedOutputStream;

import francisco.roberto.uno.tddtesteunitario.forma.Triangulo;

public class TrianguloTest {

    private francisco.roberto.uno.tddtesteunitario.forma.Triangulo Triangulo;
    private static final POSICAO_ZERO_TRIANGULO_LADO1 =;
    public TrianguloTest(){

    }

    @Before
    public void instanciarobjeto{
        Triangulo = new Triangulo();{

        }
    }
    @Test
    public void deveriaTerUmaValorDoSomaDasAreasDoTriagulo(){
        double areaDoTrianguloCalculadaNoPapel = 17.4123;//l1=5, l2=7, l3=9,
        double DIFERENCAA_ACEITAVEL            = 0.0001;

        triangulo.setMedidas(POSICAO_ZERO_TRIANGULO_LADO1)
    }

}
