package francisco.roberto.uno.conseitosclassesabstrataseinterfaces;

import org.junit.Test;

import static org.junit.Assert.*;

import francisco.roberto.uno.conseitosclassesabstrataseinterfaces.forma.Triangulo;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void areaTrianguliTest(){
        Triangulo triangulo = new Triangulo(5,6,7);
        boolean x = triangulo.area() > 0;
        assertTrue(x);
    }



}