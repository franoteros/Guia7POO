
package Entidad;

/**
 *
 * @author Franoteros
 */
public class Cadena {
    String cadena;
    int longitud;

    public Cadena() {
    }

    public Cadena(String cadena, int longitud) {
        this.cadena = cadena;
        this.longitud = longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "cadena=" + cadena + ", longitud=" + longitud + '}';
    }
    
    

}
