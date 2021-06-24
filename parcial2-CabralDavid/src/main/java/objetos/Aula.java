
package objetos;


public class Aula {
    private int numero;
    private int modulo;

    public Aula() {
    }

    public Aula(int numero, int modulo) {
        this.numero = numero;
        this.modulo = modulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "Numero=" + numero + "\nModulo:" + modulo;
    }
    
    
    
}
