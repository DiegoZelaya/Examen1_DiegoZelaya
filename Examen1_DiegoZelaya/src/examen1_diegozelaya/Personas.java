
package examen1_diegozelaya;

public class Personas {
    private String nombre;
    private int edad;
    private String sexo;
    private String arma;

    public Personas() {
    }

    public Personas(String nombre, int edad, String sexo, String arma) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
