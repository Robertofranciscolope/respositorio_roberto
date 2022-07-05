package francisco.roberto.uno.tddtesteunitario.forma;

public class Retangulo extends Forma{
    private static final int TAMANHO_ARRAY_INFO_CALCULO_AREA_RETANGULO = 2;

    /*public Retangulo(int numMedidas) {
        super(numMedidas);
    }*/

    public Retangulo(){
        super(TAMANHO_ARRAY_INFO_CALCULO_AREA_RETANGULO);
    }

    @Override
    public double area() {
        return setMedidas(0,) * getMedidas(1);
    }
}
