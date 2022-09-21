
package guia7pooejextra02.puntos;

 //* @author Franoteros
import Entidad.Puntos;
import Servicio.ServicioPuntos;


public class Guia7POOEjextra02Puntos {

    public static void main(String[] args) {
        double distanciaPuntos, resultado;
        ServicioPuntos sp = new ServicioPuntos();
        Puntos p1 = sp.crearPuntos();
        sp.distPuntos(p1);
        
    }

    
}
