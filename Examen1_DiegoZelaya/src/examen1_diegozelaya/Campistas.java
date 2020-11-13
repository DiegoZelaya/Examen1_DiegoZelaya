
package examen1_diegozelaya;

public class Campistas extends Personas {
    private boolean supervisor;
    private boolean campista;
    private boolean estado;

    public Campistas() {
        super();
    }

    public Campistas(boolean supervisor, boolean campista, boolean estado, String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        this.supervisor = supervisor;
        this.campista = campista;
        this.estado = estado;
    }

    public boolean isSupervisor() {
        return supervisor;
    }

    public void setSupervisor(boolean supervisor) {
        this.supervisor = supervisor;
    }

    public boolean isCampista() {
        return campista;
    }

    public void setCampista(boolean campista) {
        this.campista = campista;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Campistas{" + "supervisor=" + supervisor + ", campista=" + campista + ", estado=" + estado + '}';
    }
}
