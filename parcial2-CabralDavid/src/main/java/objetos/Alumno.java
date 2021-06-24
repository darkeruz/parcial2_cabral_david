
package objetos;


public class Alumno extends Persona {
    private String matricula;

    public Alumno() {
    }

    public Alumno(String matricula) {
        this.matricula = matricula;
    }

    public Alumno(String matricula, String documento, String apellido, String nombre) {
        super(documento, apellido, nombre);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "matricula: " + matricula;
    }
    
    


    
    
}
