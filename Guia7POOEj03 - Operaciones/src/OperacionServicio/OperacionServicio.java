
package OperacionServicio;
import java.util.Scanner;
import Entidades.Operacion;

/**
 *
 * @author Franoteros
 */
public class OperacionServicio {
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        Operacion Op1 = new Operacion();
        System.out.println("Ingrese el primer numero");
        Op1.setNum1(leer.nextDouble());
        System.out.println("Ingrese el segundo numero");
        Op1.setNum2(leer.nextDouble());
        return Op1;
    }
    
    public void sumar(Operacion Op1){
        Double suma = Op1.getNum1() + Op1.getNum2();
        System.out.println("La suma de los dos numeros es: " + suma);
    }
    
     public void restar(Operacion Op1){
        Double resta;
        if (Op1.getNum1() > Op1.getNum2()){
        resta = Op1.getNum1() - Op1.getNum2();
        }else{
        resta = Op1.getNum2() - Op1.getNum1();
        }
        System.out.println("La resta de los dos numeros es: " + resta);
    }
    
     public void multiplicar(Operacion Op1){
         
         if(Op1.getNum1() == 0 || Op1.getNum2() == 0){
             System.out.println("La operacion es errónea. No debe dar cero");
         }else{
             Double Multip = Op1.getNum1() * Op1.getNum2();
             System.out.println("La multiplicacion de ambos numeros es: " + Multip);
         }
    }
     
     public void dividir(Operacion Op1){
         if(Op1.getNum1() == 0 || Op1.getNum2() == 0){
             System.out.println("La operacion es errónea. No debe dar cero");
         }else{
             Double Divid = Op1.getNum1() / Op1.getNum2();
             System.out.println("La multiplicacion de ambos numeros es: " + Divid);
         }
     }
     
}
