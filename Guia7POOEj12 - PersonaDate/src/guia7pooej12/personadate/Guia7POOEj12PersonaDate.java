
package guia7pooej12.personadate;

 //* @author Franoteros
import Entidad.Persona;
import ServicioPersona.ServicioPersona;
import java.util.Scanner;


public class Guia7POOEj12PersonaDate {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPersona sp = new ServicioPersona();
        Persona P1 = sp.crearPersona();
        sp.calcEdad(P1);
        sp.menorQue(P1);
        sp.mostrarPersona(P1);
        
    }

}
