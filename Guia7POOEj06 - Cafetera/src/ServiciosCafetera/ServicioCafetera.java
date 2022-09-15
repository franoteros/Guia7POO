
package ServiciosCafetera;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioCafetera {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
        Cafetera C = new Cafetera();
        System.out.println("Capacidad maxima");
        C.setCapMax(leer.nextDouble());
        System.out.println("Cantidad actual");
        C.setCantActual(leer.nextDouble());
        return C;
    }
    
    public void llenarCafetera(Cafetera C){
        Double llenado;
        if(C.getCantActual() < C.getCapMax()){
            llenado = C.getCapMax() - C.getCantActual();
            C.setCantActual(C.getCapMax());
            System.out.println("Se agregaron " + llenado + " litros de agua a la cafetera");
        }
    }
    
    public void servirTaza(Cafetera C){
        Double taza = 0.250;
        System.out.println("La taza tiene " + taza + " litros de capaciad");
        if(C.getCantActual() < taza){
            taza = C.getCantActual();
            C.setCantActual(0.0);
        }else{
            C.setCantActual(C.getCantActual() - taza);
        }
        System.out.println("La taza se llenó con " + taza + " litros de café y la cafetera quedó con " 
                + C.getCantActual() + " litros de café");
    }
    
    public void vaciarCafetera(Cafetera C){
        C.setCantActual(0.0);
        System.out.println("La cafetera se vació");
    }
    
    public void agregarCafe(Cafetera C){
        Double cafe;
        System.out.println("Agregar cafe");
        cafe = leer.nextDouble();
        C.setCantActual(C.getCantActual() + cafe);
        System.out.println("La cafetera ahora tiene " + C.getCantActual() + " litros de cafe");
    }
    

}
