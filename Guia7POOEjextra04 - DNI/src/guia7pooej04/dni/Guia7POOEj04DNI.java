
package guia7pooej04.dni;

 //* @author Franoteros
import EntidadesDni.DNI;
import ServiciosDNI.ServicioDNI;


public class Guia7POOEj04DNI {

    public static void main(String[] args) {
        ServicioDNI dnis = new ServicioDNI();
        DNI Nif1 = dnis.crearNif();
        dnis.mostrarNif(Nif1);
    }

}
