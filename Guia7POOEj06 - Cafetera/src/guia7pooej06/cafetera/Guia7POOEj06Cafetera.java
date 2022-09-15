
package guia7pooej06.cafetera;

 //* @author Franoteros
import Entidades.Cafetera;
import ServiciosCafetera.ServicioCafetera;
import java.util.Scanner;

public class Guia7POOEj06Cafetera {

    public static void main(String[] args) {
        int opc = 0;
        Scanner leer = new Scanner(System.in);
        ServicioCafetera CafS = new ServicioCafetera();
        Cafetera C1 = CafS.crearCafetera();
        do{
            System.out.println("Elija una opcion");
            System.out.println("1-Llenar cafetera");
            System.out.println("2-Servir taza");
            System.out.println("3-Vaciar cafetera");
            System.out.println("4-Agregar cafe");
            System.out.println("5-Salir");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    CafS.llenarCafetera(C1);
                    break;
                case 2:
                    CafS.servirTaza(C1);
                    break;
                case 3:
                    CafS.vaciarCafetera(C1);
                    break;
                case 4:
                    CafS.agregarCafe(C1);
                    break;
            }
        }while (opc < 5);
        
        System.out.println("Gracias por usar Nespresso");
        
    }

}
