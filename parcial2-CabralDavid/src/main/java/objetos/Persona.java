
package objetos;


public class Persona {
    private String documento;
    private String apellido;
    private String nombre;

    public Persona() {
    }

    public Persona(String documento, String apellido, String nombre) {
        this.documento = documento;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Documento: "+ documento + "\nApellido: "+ apellido + "\nNombre: "+ nombre;
    }
    
    
    
    
}
