
package objetos;

import java.util.ArrayList;
import java.util.Date;


public class Curso {
    private Date fecha;
    private String catedra;
    Aula aula = new Aula();
    Profesor profesor = new Profesor();
    
    private ArrayList<Alumno> alumnos;

    public int sizeAlumno() {
        return alumnos.size();
    }

    public boolean addAlumno(Alumno e) {
        return alumnos.add(e);
    }

    public boolean removeAlumno(Object o) {
        return alumnos.remove(o);
    }

    public void clearAlumno() {
        alumnos.clear();
    }
    
    

    public Curso() {
    }

    public Curso(Date fecha, String catedra) {
        this.fecha = fecha;
        this.catedra = catedra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    @Override
    public String toString() {
        return "Fecha:" + fecha + "\ncatedra:" + catedra;
    }
    
    
    
            
            
    
}
