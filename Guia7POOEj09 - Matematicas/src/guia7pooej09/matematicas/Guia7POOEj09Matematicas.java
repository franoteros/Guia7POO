
package guia7pooej09.matematicas;

 //* @author Franoteros
import Entidad.Matematicas;
import ServicioMatematicas.ServicioMatematicas;
import java.util.Scanner;


public class Guia7POOEj09Matematicas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioMatematicas sm = new ServicioMatematicas();
        Matematicas M1 = sm.crearMatematica();
        System.out.println("NUMERO MAYOR");
        sm.devolverMayor(M1);
        System.out.println("POTENCIA");
        sm.calcPotencia(M1);
        System.out.println("RAIZ CUADRADA");
        sm.calcRaiz(M1);
 
    }

}
