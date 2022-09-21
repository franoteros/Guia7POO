
package Entidad;

/**
 *
 * @author Franoteros
 */
public class Puntos {
    int xa, ya, xb, yb;

    public Puntos() {
    }

    public Puntos(int xa, int ya, int xb, int yb) {
        this.xa = xa;
        this.ya = ya;
        this.xb = xb;
        this.yb = yb;
    }

    public int getXa() {
        return xa;
    }

    public void setXa(int xa) {
        this.xa = xa;
    }

    public int getYa() {
        return ya;
    }

    public void setYa(int ya) {
        this.ya = ya;
    }

    public int getXb() {
        return xb;
    }

    public void setXb(int xb) {
        this.xb = xb;
    }

    public int getYb() {
        return yb;
    }

    public void setYb(int yb) {
        this.yb = yb;
    }

    @Override
    public String toString() {
        return "Puntos{" + "xa=" + xa + ", ya=" + ya + ", xb=" + xb + ", yb=" + yb + '}';
    }

    
    
    

}
