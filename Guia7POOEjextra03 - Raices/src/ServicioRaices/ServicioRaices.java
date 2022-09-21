
package ServicioRaices;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioRaices {
    Scanner leer = new Scanner(System.in);
    double positivo, negativo;
    
    public Raices crearRaices(){
        Raices R = new Raices();
        System.out.println("Ingrese valor de a");
        R.setA(leer.nextInt());
        System.out.println("Ingrese valor de b");
        R.setB(leer.nextInt());
        System.out.println("Ingrese valor de c");
        R.setC(leer.nextInt());
        return R;
    }
    
    public double getDiscrim(Raices R){
            double discrim = (Math.pow(R.getB(), 2))-(4*R.getA()*R.getC());
            return discrim;
    }
    
    public boolean tieneRaices(Raices R){
        boolean check = false;
        positivo = (-(R.getB()) + (Math.sqrt(getDiscrim(R))))/2*R.getA();
        negativo = (-(R.getB()) - (Math.sqrt(getDiscrim(R))))/2*R.getA();
        if(positivo > 0 && negativo > 0){
        check = true;
        }
        return check;
    }
    
    public boolean tieneRaiz(Raices R){
        boolean check = false;
        positivo = (-(R.getB()) + (Math.sqrt(getDiscrim(R))))/2*R.getA();
        negativo = (-(R.getB()) - (Math.sqrt(getDiscrim(R))))/2*R.getA();
        if(positivo == 0 && negativo == 0){
        check = true;
        }
        return check;
    }
    
    public void obtenerRaices(Raices R){
        if(tieneRaices(R) == true){
            System.out.println("Los resultados son [" + positivo + "]" + "[" + negativo + "]");
        }else{
            System.out.println(tieneRaices(R));
        }
    }
    
    public void obtenerRaiz(Raices R){
        if(tieneRaiz(R) == true){
            System.out.println("El resultado es [" + positivo);
        }else{
            System.out.println(tieneRaices(R));
        }
    }
    
    public void calcular(Raices R){
        tieneRaices(R);
        tieneRaiz(R);
        obtenerRaices(R);
        obtenerRaiz(R);
        }

    
    
    
}
