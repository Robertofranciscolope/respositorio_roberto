package francisco.roberto.uno.tddtesteunitario;


import static java.lang.Math.PI;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.Math;

import francisco.roberto.uno.tddtesteunitario.forma.Circunferencia;


public class CincunferenciaTest {
    private static Circunferencia circunferencia = new Circunferencia();
    public static final int POSICAO_ZERO              = 0;
    public static final int EXPOENTE_2                = 2;


    @Test
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidas(){
        double raio;
        boolean validar;

        //Circunferencia circunferencia = new Circunferencia(1);
        circunferencia.setMedidas(0, 3);

        //posicao 0 pq a circunferencia precisa de apenas 1 informação para calcular a area
        raio = circunferencia.getMedida(0);

        validar = raio > 0;
        assertTrue(validar);

    }

    /*@Test
    public void deveriaTerUmLimiteDeTamanhoOVetorDeInformacoesDoCalculoDaArea(){
        boolean tamanhoValido = circunferencia.setMedidas(0, 1);
    }*/

    @Test
    public void deveriaCalcularAreaDaCircunferencia(){
        //O calculo da area de uma circunferencia é dada pela formula: A = PI * raio ao quadrado
        int PRECISAO_4_CASAS_DECIMAIS = 4;

        //calculos feitos no papel e canta
        double area_raio3             = 28.2743;
        double area_raio5             = 78.5398;

        //Setando Raio armazenado na estrutura de dados da classe Pai
        circunferencia.setMedidas(0, 5);

        //fazendo o calculo do raio
        double area = PI * Math.pow(circunferencia.getMedida(POSICAO_ZERO), EXPOENTE_2);


        /*assertEquals("A area de uma circunferencia de raio 3 é 28,2743", area_raio3, area,
                PRECISAO_4_CASAS_DECIMAIS);*/

        //verificando se o calculo do raio do computador é igual o nosso da caneta
        assertEquals("A area de uma circunferencia de raio 5 é 78.5398", area_raio5, area,
                PRECISAO_4_CASAS_DECIMAIS);
    }





}
