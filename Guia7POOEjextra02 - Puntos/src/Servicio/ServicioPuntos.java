
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioPuntos {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos P = new Puntos();
        System.out.println("Ingrese coordenada x del punto A");
        P.setXa(leer.nextInt());
        System.out.println("Ingrese coordenada y del punto A");
        P.setYa(leer.nextInt());
        System.out.println("Ingrese coordenada x del punto B");
        P.setXb(leer.nextInt());
        System.out.println("Ingrese coordenada y del punto B");
        P.setYb(leer.nextInt());
        return P;
    }
    
    public void distPuntos(Puntos P){
        double potenciax, potenciay, distancia;
        if(P.getXa()>P.getXa()){
            potenciax = Math.pow((P.getXa()-P.getXa()), 2);
        }else{
            potenciax = Math.pow((P.getXb()-P.getXa()), 2);
        }
        if(P.getYa()>P.getYa()){
            potenciay = Math.pow((P.getYa()-P.getYa()), 2);
        }else{
            potenciay = Math.pow((P.getYb()-P.getYa()), 2);
        }
        distancia = Math.sqrt(potenciax+potenciay);
        System.out.println("La distancia entre los puntos A y B es de " + distancia);
    }

    

}
