
package ServicioPersona;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioPersona {
    
    Scanner leer = new Scanner(System.in);
    Date fechaActual = new Date();
    int edad;
    
    public Persona crearPersona(){
        Persona Per = new Persona();
        System.out.println("Ingrese nombre");
        Per.setNombre(leer.nextLine());
        System.out.println("Ingrese dia de nacimiento");
        Per.setDia(leer.nextInt());
        System.out.println("Ingrese mes de nacimiento");
        Per.setMes(leer.nextInt());
        System.out.println("Ingrese año de nacimiento");
        Per.setAnio(leer.nextInt());
        Date fechaNac = new Date(Per.getAnio(), Per.getMes(), Per.getDia());
        return Per;
    }
    
    public void calcEdad(Persona Per){
        
        int anioActual = fechaActual.getYear()+1900;
        int mesActual = fechaActual.getMonth()+1;
        int diaActual = fechaActual.getDay();
        
        edad = anioActual - Per.getAnio();
        
        if(edad != 0){
            if(mesActual<=Per.getMes()){
                edad--;
            }
        }
        System.out.println("La edad es de " + edad + " años");
    }
    
    public void menorQue(Persona Per){
        System.out.println("Ingrese una edad");
        int nuevaEdad = leer.nextInt();
        boolean check = false;
        if(edad<nuevaEdad){
            check = true;
        }
        System.out.println(check); 
    }
    
    public void mostrarPersona(Persona Per){
        System.out.println(Per.toString());
    }
    
    

}
