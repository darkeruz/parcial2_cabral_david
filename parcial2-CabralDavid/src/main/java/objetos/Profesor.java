
package objetos;


public class Profesor extends Persona {
    private String legajo;

    public Profesor() {
    }

    public Profesor(String legajo) {
        this.legajo = legajo;
    }

    public Profesor(String legajo, String documento, String apellido, String nombre) {
        super(documento, apellido, nombre);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Legajo:" + legajo;
    }
    
    
}
