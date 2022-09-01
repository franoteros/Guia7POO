
package guia7pooej02.circunferencia;
  
import Entidad.Circunferencia;
import Servicio.CircServicio;

     public class Guia7POOEj02Circunferencia {

    public static void main(String[] args) {
        CircServicio cs = new CircServicio();
        Circunferencia C1 = cs.CrearCirc();
        cs.Area(C1);
        cs.Perimetro(C1);
    }

}
