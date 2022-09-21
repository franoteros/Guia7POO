
package guia7pooej10.arreglos;

 //* @author Franoteros
import java.util.Arrays;


public class Guia7POOEj10Arreglos {

    public static void main(String[] args) {
        double arreglo1[], arreglo2[];
        arreglo1 = new double[50];
        arreglo2 = new double[20];
        int i;
        double random;
        long round;
        double ordenado;
        
        for(i=0; i<50; i++){
            random = Math.random()*100;
            round = Math.round(random);
            arreglo1[i] = round;
            System.out.print("[" + arreglo1[i] + "]");
        }
        System.out.println("");
        
        Arrays.sort(arreglo1);
        
        for(i=0; i<50;i++){
            System.out.print("[" + arreglo1[i] + "]");
        }
        System.out.println("");

        for(i=0; i<20;i++){
            ordenado = arreglo1[i];
            Arrays.fill(arreglo2,0,10,ordenado);
            Arrays.fill(arreglo2,10,20,0.5);
            System.out.print("[" + arreglo2[i] + "]");
        }
        System.out.println("");
        
        
        
        
        
        
        
        
    }

}
