
package guia7pooej03.operaciones;

 //* @author Franoteros
import Entidades.Operacion;
import OperacionServicio.OperacionServicio;


public class Guia7POOEj03Operaciones {

    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Operacion Op1 = os.crearOperacion();
        os.sumar(Op1);
        os.restar(Op1);
        os.multiplicar(Op1);
        os.dividir(Op1);
    }

}
