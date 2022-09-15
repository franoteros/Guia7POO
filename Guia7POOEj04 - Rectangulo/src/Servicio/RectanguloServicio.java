
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class RectanguloServicio {
    Scanner leer = new Scanner(System.in);
    int base;
    int altura;
    int superficie;
    int perimetro;
    int i, j;
    
    public Rectangulo crearRect(){
        Rectangulo rect1 = new Rectangulo();
        System.out.println("Ingrese altura");
        rect1.setAltura(leer.nextInt());
        System.out.println("Ingrese base");
        rect1.setBase(leer.nextInt());
        return rect1;
    }
    
    public void calcSup(Rectangulo rect1){
        superficie = rect1.getAltura() * rect1.getBase();
        System.out.println("La superficie del rectangulo es " + superficie);
    }
    
    public void calcPerim(Rectangulo rect1){
        perimetro = (rect1.getAltura() * 2) + (rect1.getBase() * 2);
        System.out.println("El perimetro del rectangulo es " + perimetro);
    }
    
    public void dibujaRect(Rectangulo rect1){
        for(i=0; i<rect1.getAltura(); i++){
            for(j=0; j<rect1.getBase(); j++){
                if((i==0 || i==(rect1.getAltura()-1)) && (j>=0 || j<=(rect1.getBase()-1)) || ((i>=0 || i<=(rect1.getAltura()-1)) && (j==0 || j==(rect1.getBase()-1)))    ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
    
}
