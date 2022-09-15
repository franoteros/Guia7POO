
package ServicioCuenta;

import EntidadCuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioCuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double retirar, ingresar, extRapid;
    
    public Cuenta crearCuenta(){
        Cuenta C = new Cuenta();
        System.out.println("Ingrese nombre y apellido");
        C.setNomyAp(leer.nextLine());
        System.out.println("Ingrese su DNI");
        C.setDni(leer.nextInt());
        System.out.println("Ingrese su numero de cuenta");
        C.setNumCuenta(leer.nextInt());
        System.out.println("Ingresar saldo actual");
        C.setSaldo(leer.nextDouble());
        return C;
    }
    
    public void ingresar(Cuenta C){
        System.out.println("Ingresar monto en cuenta");
        ingresar = leer.nextDouble();
        C.setSaldo(ingresar + C.getSaldo());
        System.out.println("Su saldo es de " + C.getSaldo());
    }
    
    public void retirar (Cuenta C){
        System.out.println("Ingrese monto a retirar");
        retirar = leer.nextDouble();
        if(retirar > C.getSaldo()){
            C.setSaldo(0.0);
        }else{
        C.setSaldo(C.getSaldo() - retirar);
        }
        System.out.println("Su saldo es de " + C.getSaldo());
    }
    
    public void extraccionRapida(Cuenta C){
        System.out.println("Extraccion Rapida: Ingrese monto a retirar");
        extRapid = leer.nextDouble();
        if(extRapid > C.getSaldo() * 0.20 && extRapid < C.getSaldo()){
            extRapid = C.getSaldo() * 0.20;
            C.setSaldo(C.getSaldo() - extRapid);
        }else if (extRapid > C.getSaldo()){
            System.out.println("El monto a retirar es mayor al saldo");
        }else{
            C.setSaldo(C.getSaldo() - extRapid);
        }
        System.out.println("Su saldo es de " + C.getSaldo());
    }
    
    public void consultarSaldo(Cuenta C){
        System.out.println("Su saldo actual es de " + C.getSaldo());
    }
    
    public void consultarDatos (Cuenta C){
        System.out.println(C.getNomyAp());
        System.out.println(C.getDni());
        System.out.println(C.getNumCuenta());
    }
    
    
    
}
