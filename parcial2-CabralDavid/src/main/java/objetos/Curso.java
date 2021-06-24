
package objetos;

import java.util.Date;


public class Curso {
    private Date fecha;
    private String catedra;

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
