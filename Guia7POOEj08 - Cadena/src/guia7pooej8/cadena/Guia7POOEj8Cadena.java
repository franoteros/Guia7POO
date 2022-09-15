
package guia7pooej8.cadena;

 //* @author Franoteros
import Entidad.Cadena;
import ServicioCadena.ServicioCadena;


public class Guia7POOEj8Cadena {

    public static void main(String[] args) {
        ServicioCadena sc = new ServicioCadena();
        Cadena C1 = sc.crearCadena();
        System.out.println("VOCALES");
        sc.mostrarVocales(C1);
        System.out.println("FRASE INVERTIDA");
        sc.invertirFrase(C1);
        System.out.println("CARACTER REPETIDO");
        sc.vecesRepetido(C1);
        System.out.println("COMPARAR LONGITUD");
        sc.compararLongitud(C1);
        System.out.println("UNIR FRASES");
        sc.unirFrases(C1);
        System.out.println("REEMPLAZA LETRA A");
        sc.cambiarLetraA(C1);
        System.out.println("COMPRUEBA SI LA FRASE TIENE UN CARACTER");
        System.out.println(sc.contiene(C1));
        
        
    }

}
