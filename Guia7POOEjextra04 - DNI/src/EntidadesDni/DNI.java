
package EntidadesDni;

/**
 *
 * @author Franoteros
 */
public class DNI {
    private int Dni;
    private String Digito;

    public DNI() {
    }

    public DNI(int Dni, String Digito) {
        this.Dni = Dni;
        this.Digito = Digito;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getDigito() {
        return Digito;
    }

    public void setDigito(String Digito) {
        this.Digito = Digito;
    }

    
}


