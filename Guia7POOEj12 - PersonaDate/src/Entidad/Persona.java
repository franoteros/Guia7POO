
package Entidad;

/**
 *
 * @author Franoteros
 */
public class Persona {
    int dia, mes, anio;
    String nombre;

    public Persona() {
    }

    public Persona(int dia, int mes, int anio, String nombre) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "dia=" + dia + ", mes=" + mes + ", año=" + anio + ", nombre=" + nombre + '}';
    }
    
    

}
