
package ServicioMatematicas;

import Entidad.Matematicas;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioMatematicas {
    
    Scanner leer = new Scanner(System.in);
    
    public Matematicas crearMatematica(){
        Matematicas M = new Matematicas();
        M.setNum1(Math.random()*10);
        M.setNum2(Math.random()*10);
        System.out.println("El numero 1 es: " + M.getNum1());
        System.out.println("El numero 2 es: " + M.getNum2());
        return M;
    }
    
    public void devolverMayor(Matematicas M){
        Double mayor =  Math.max(M.getNum1(), M.getNum2());
        System.out.println(mayor);
    }
    
    public void calcPotencia(Matematicas M){
        Double mayor =  Math.max(M.getNum1(), M.getNum2());
        Double menor =  Math.min(M.getNum1(), M.getNum2());
        long roundMayor =  Math.round(mayor);
        long roundMenor = Math.round(menor);
        Double potencia = Math.pow(roundMayor, roundMenor);
        System.out.println("El mayor redondeado es " + roundMayor);
        System.out.println("El menor redondeado es " + roundMenor);
        System.out.println(roundMayor + " a la potencia de " + roundMenor + " es " + potencia);
    }
    
    public void calcRaiz(Matematicas M){
        Double menor = Math.min(M.getNum1(), M.getNum2());
        Double absoluto = Math.abs(menor);
        Double raiz = Math.sqrt(absoluto);
        System.out.println("El numero menor absoluto es " + absoluto);
        System.out.println("La raiz cuadrada del numero menor es " + raiz);
    }
    
    
    

}
