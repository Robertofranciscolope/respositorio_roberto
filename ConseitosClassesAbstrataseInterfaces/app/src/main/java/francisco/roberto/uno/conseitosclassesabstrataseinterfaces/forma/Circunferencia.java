package francisco.roberto.uno.conseitosclassesabstrataseinterfaces.forma;

/*Java - Guia do Programador - 3ª Edição https://github.com/pjandl/jgp3*/

public class Circunferencia extends Forma{

    public Circunferencia(double raio) {
        super(1); // uso obrigatório do construtor da superclasse
        setRaio(raio); // ajuste da medida do raio
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getMedida(0), 2);
    }

    // novo método para ajuste do raio
    public void setRaio(double raio) {
        setMedida(0, raio);
    }

    // comparador estático
    public static int comparador(Circunferencia a, Circunferencia b) {
        return (int) (a.area() - b.area());
    }

    // comparador não-estático
    public int comparadorCircunferencia(Circunferencia b) {
        return (int) (this.area() - b.area());
    }
}
