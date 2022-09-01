
package LibroServicio;
import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class LibroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro1 (){
        Libro L1 = new Libro();
        System.out.println("Ingrese el ISBN");
        L1.setISBN(leer.next());
        System.out.println("Ingrese el autor");
        L1.setAutor(leer.next());
        System.out.println("Ingrese el titulo");
        L1.setTitulo(leer.next());
        System.out.println("Ingrese el numero de paginas");
        L1.setNumPag(leer.nextInt());
        return L1;
    }
    
    public void mostrarLibro1 (Libro L1){
        System.out.println("El ISBN es " + L1.getISBN());
        System.out.println("El nombre del autor es " + L1.getAutor());
        System.out.println("El titulo del libro es " + L1.getTitulo());
        System.out.println("El libro contiene " + L1.getNumPag() + " paginas");
    }
        
    public Libro crearLibro2 (){
        Libro L2 = new Libro();
        System.out.println("Ingrese el ISBN");
        L2.setISBN(leer.next());
        System.out.println("Ingrese el autor");
        L2.setAutor(leer.next());
        System.out.println("Ingrese el titulo");
        L2.setTitulo(leer.next());
        System.out.println("Ingrese el numero de paginas");
        L2.setNumPag(leer.nextInt());
        return L2;
    }
    
    public void mostrarLibro2 (Libro L2){
        System.out.println("El ISBN es " + L2.getISBN());
        System.out.println("El nombre del autor es " + L2.getAutor());
        System.out.println("El titulo del libro es " + L2.getTitulo());
        System.out.println("El libro contiene " + L2.getNumPag() + " paginas");
    }
    
    
}