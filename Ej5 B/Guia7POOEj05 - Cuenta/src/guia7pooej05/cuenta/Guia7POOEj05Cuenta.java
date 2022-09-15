
package guia7pooej05.cuenta;

 //* @author Franoteros
import EntidadCuenta.Cuenta;
import ServicioCuenta.ServicioCuenta;
import java.util.Scanner;

public class Guia7POOEj05Cuenta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta C1 = sc.crearCuenta();
        do{
            System.out.println("Ingrese una opcion del menu");
            System.out.println("1-Ingresar dinero");
            System.out.println("2-Retirar dinero");
            System.out.println("3-Extraccion rapida");
            System.out.println("4-Consultar saldo");
            System.out.println("5-consultar datos");
            System.out.println("6-Salir");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    sc.ingresar(C1);
                    break;
                case 2:
                    sc.retirar(C1);
                    break;
                case 3:
                    sc.extraccionRapida(C1);
                    break;
                case 4:
                    sc.consultarSaldo(C1);
                    break;
                case 5:
                    sc.consultarDatos(C1);
                    break;
            }
        }while (opc != 6);
        
        System.out.println("Gracias por usar el cajero");
        
        
            
    }

}
