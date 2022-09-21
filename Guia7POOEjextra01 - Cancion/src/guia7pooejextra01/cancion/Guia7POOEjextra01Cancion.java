
package guia7pooejextra01.cancion;

 //* @author Franoteros
import Entidad.Cancion;
import Servicio.ServicioCancion;


public class Guia7POOEjextra01Cancion {

    public static void main(String[] args) {
        
        ServicioCancion sc = new ServicioCancion();
        Cancion C1 = sc.crearCancion();
        sc.mostrarCancion(C1);
    }

}
