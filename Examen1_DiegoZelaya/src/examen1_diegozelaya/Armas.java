
package examen1_diegozelaya;

public class Armas {
    private String tipo;
    private int dano;

    public Armas() {
    }

    public Armas(String tipo, int dano) {
        this.tipo = tipo;
        this.dano = dano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
