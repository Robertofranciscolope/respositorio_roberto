package francisco.roberto.uno.tddtesteunitario;

import org.junit.Test;

import francisco.roberto.uno.tddtesteunitario.forma.Retangulo;

public class RetanguloTest {

    private static Retangulo retangulo = retangulo();
    public static final int POSECAO_ZERO   = 0;
    public static final int EXPOENTE_3     = 3;

    @Test
    public void calcularAreDoRetangulo(){
        double are_BaseXAltura = 10;
        int PRECISO_4_CASA_DECIMAIS = 4;

        retangulo.setMedida(0,3);
        retangulo.setMedida(1,3);
    }
}
