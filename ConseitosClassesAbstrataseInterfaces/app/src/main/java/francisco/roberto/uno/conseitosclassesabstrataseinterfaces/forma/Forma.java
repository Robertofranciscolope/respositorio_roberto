package francisco.roberto.uno.conseitosclassesabstrataseinterfaces.forma;

/*Java - Guia do Programador - 3ª Edição https://github.com/pjandl/jgp3*/

public abstract class Forma {
    private double medida[]; // array de medidas

    // Construtor parametrizado
    public Forma(int numMedidas) {
        medida = new double[numMedidas]; // aloca array de medidas
    }

    // Métodos
    public double getMedida(int i) { // obtém uma medida
        if (i < 0 || i >= medida.length) {
            throw new RuntimeException("Número inválido de medida.");
        }
        return medida[i];
    }

    public int getNumMedidas() { // retorna no. de medidas
        return medida.length;
    }

    protected void setMedida(int i, double m) { // ajusta uma medida
        if (i < 0 || i >= medida.length) {
            throw new RuntimeException("Número inválido de medida.");
        }
        if (m < 0) {
            throw new RuntimeException("Medida #" + i + "inválida.");
        }
        medida[i] = m;
    }

    @Override
    public String toString() { // representação textual
        StringBuffer sb = new StringBuffer(getClass().getName());
        sb.append("[medidas:");
        for (int i = 0; i < medida.length - 1; i++) {
            sb.append(medida[i]);
            sb.append(",");
        }
        sb.append(medida[medida.length - 1]);
        sb.append("]");
        return sb.toString();
    }

    // método abstrato que determinara área
    public abstract double area();
}
