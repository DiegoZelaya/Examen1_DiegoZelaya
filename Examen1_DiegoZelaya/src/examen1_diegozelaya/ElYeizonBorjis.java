
package examen1_diegozelaya;

public class ElYeizonBorjis extends Personas {
    private int desaparecer;

    public ElYeizonBorjis() {
        super();
    }

    public ElYeizonBorjis(int desaparecer, String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        this.desaparecer = desaparecer;
    }

    public int getDesaparecer() {
        return desaparecer;
    }

    public void setDesaparecer(int desaparecer) {
        this.desaparecer = desaparecer;
    }

    @Override
    public String toString() {
        return "ElYeizonBorjis{" + "desaparecer=" + desaparecer + '}';
    }
}
