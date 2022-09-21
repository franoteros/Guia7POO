
package Entidad;

/**
 *
 * @author Franoteros
 */
public class Arreglos {
    int arreglo1[];
    int arreglo2[];

    public Arreglos() {
    }

    public Arreglos(int[] arreglo1, int[] arreglo2) {
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
    }

    public int[] getArreglo1() {
        return arreglo1;
    }

    public void setArreglo1(int[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public int[] getArreglo2() {
        return arreglo2;
    }

    public void setArreglo2(int[] arreglo2) {
        this.arreglo2 = arreglo2;
    }

    @Override
    public String toString() {
        return "Arreglos{" + "arreglo1=" + arreglo1 + ", arreglo2=" + arreglo2 + '}';
    }

    
}
