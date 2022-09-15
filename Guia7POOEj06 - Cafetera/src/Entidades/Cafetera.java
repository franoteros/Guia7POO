
package Entidades;

/**
 *
 * @author Franoteros
 */
public class Cafetera {
    Double capMax;
    Double cantActual;

    public Cafetera() {
    }

    public Cafetera(Double capMax, Double cantActual) {
        this.capMax = capMax;
        this.cantActual = cantActual;
    }

    public Double getCapMax() {
        return capMax;
    }

    public void setCapMax(Double capMax) {
        this.capMax = capMax;
    }

    public Double getCantActual() {
        return cantActual;
    }

    public void setCantActual(Double cantActual) {
        this.cantActual = cantActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capMax=" + capMax + ", cantActual=" + cantActual + '}';
    }
    
    

}
