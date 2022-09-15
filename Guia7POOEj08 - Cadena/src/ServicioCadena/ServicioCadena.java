
package ServicioCadena;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioCadena {
    Scanner leer = new Scanner(System.in);
    
    
    public Cadena crearCadena(){
        Cadena C = new Cadena();
        System.out.println("Ingrese frase");
        C.setCadena(leer.nextLine());
        C.setLongitud(C.getCadena().length());
        System.out.println("La longitud es de " + C.getLongitud() + " caracteres");
        return C;
    }
    
    public void mostrarVocales(Cadena C){
        int i, j;
        j = 0;
        String vocal;
        for(i=0; i < C.getLongitud(); i++){
            vocal = C.getCadena().substring(i, i+1);
            if(vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")){
                j++;
                System.out.println("Vocal numero " + j + " = " + vocal);
            }
        }
        System.out.println(j + " vocales hay en la frase");
    }
    
    public void invertirFrase(Cadena C){
        int i, j;
        j = 0;
        String invertida;
        for(i=C.getLongitud()-1; i >= 0; i--){
            invertida = C.getCadena().substring(i, i+1);
            System.out.print(invertida);
        }
        System.out.println("");
    }
    
    public void vecesRepetido(Cadena C){
        String caracter;
        int i;
        int j = 0;
        System.out.println("Ingrese un caracter");
        caracter = leer.nextLine();
        for(i=0; i<C.getLongitud(); i++){
            if(caracter.equalsIgnoreCase(C.getCadena().substring(i, i+1))){
                j++;
            }
        }
        System.out.println("El caracter " + caracter + " se encuentra " + j + " veces.");
    }
    
    public void compararLongitud(Cadena C){
        int compara;
        String frase2;
        System.out.println("Ingrese frase 2");
        frase2 = leer.nextLine();
        if(frase2.length() < C.getLongitud()){
        compara = C.getLongitud() - frase2.length();
        }else{
        compara = frase2.length() - C.getLongitud();
        }
        System.out.println("La diferencia entre frases es de " + compara + " caracteres");
    }
    
    public void unirFrases(Cadena C){
        String unidas;
        System.out.println("Ingrese frase a unir");
        String frase2 = leer.nextLine();
        unidas = C.getCadena().concat(" " + frase2);
        System.out.println("Las dos frases resultan: ");
        System.out.println(unidas);
    }
    
    public void cambiarLetraA(Cadena C){
        int i;
        String cambia;
        System.out.println("Las letras A seran reemplazadas por el caracter ´$´ ");
        for(i=0; i < C.getLongitud(); i++){
            cambia = C.getCadena().substring(i, i+1);
            if(cambia.equalsIgnoreCase("a")){
                cambia = "$";
            }
            System.out.print(cambia);
        }
        System.out.println("");
    }
    
    public boolean contiene(Cadena C){
        boolean check = false;
        int i;
        System.out.println("Ingrese caracter a buscar en la frase");
        String busca = leer.nextLine();
        for(i=0; i < C.getLongitud(); i++){
            String caracter = C.getCadena().substring(i, i+1);
            if(caracter.equalsIgnoreCase(busca)){
                check = true;
                break;
            }
        }
        return check;
    }
    

}
