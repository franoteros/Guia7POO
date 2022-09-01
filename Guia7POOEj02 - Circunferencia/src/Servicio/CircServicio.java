
package Servicio;
import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class CircServicio {
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia CrearCirc(){
        Circunferencia C1 = new Circunferencia(10);
        return C1;
    }
    
    public void Area(Circunferencia C1){
        Double Area = Math.PI*(C1.getRadio()*C1.getRadio());
        System.out.println("El área es " + Area);
    }
    
    public void Perimetro(Circunferencia C1){
        Double Perimetro = 2 * Math.PI * C1.getRadio();
        System.out.println("El perimetro es " + Perimetro);
    }
    
    
    
    

}
