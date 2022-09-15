
package guia7pooej04.rectangulo;

 //* @author Franoteros
import Entidades.Rectangulo;
import Servicio.RectanguloServicio;


public class Guia7POOEj04Rectangulo {

    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo rect = rs.crearRect();
        rs.calcPerim(rect);
        rs.calcSup(rect);
        rs.dibujaRect(rect);
    }

}
