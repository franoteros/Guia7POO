
package guia7pooej01.libro;
import LibroServicio.LibroServicio;
import Entidad.Libro;
 //* @author Franoteros
public class Guia7POOEj01Libro {

    public static void main(String[] args) {
        LibroServicio ls = new LibroServicio();
        Libro L1 = ls.crearLibro1();
        ls.mostrarLibro1(L1);
        Libro L2 = ls.crearLibro2();
        ls.mostrarLibro2(L2);
    }

}
