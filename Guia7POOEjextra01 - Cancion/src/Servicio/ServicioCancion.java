
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioCancion {
    Scanner leer = new Scanner(System.in);
    
    public Cancion crearCancion(){
        Cancion C = new Cancion();
        System.out.println("Titulo");
        C.setTitulo(leer.nextLine());
        System.out.println("Autor");
        C.setAutor(leer.nextLine());
        return C;
    }
    
    public void mostrarCancion(Cancion C){
        System.out.println(C.getAutor() + " - " + C.getTitulo());
    }

}
