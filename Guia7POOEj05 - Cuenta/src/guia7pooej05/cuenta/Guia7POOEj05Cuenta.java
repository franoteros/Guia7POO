
package guia7pooej05.cuenta;

 //* @author Franoteros
import EntidadCuenta.Cuenta;
import ServicioCuenta.ServicioCuenta;


public class Guia7POOEj05Cuenta {

    public static void main(String[] args) {
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta C1 = sc.crearCuenta();
        sc.ingresar(C1);
        sc.retirar(C1);
        sc.extraccionRapida(C1);
        sc.consultarSaldo(C1);
        sc.consultarDatos(C1);
    }

}
