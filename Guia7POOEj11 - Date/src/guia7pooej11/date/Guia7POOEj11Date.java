
package guia7pooej11.date;

 //* @author Franoteros
import java.util.Date;
import java.util.Scanner;

public class Guia7POOEj11Date {

    public static void main(String[] args) {
        int dia, mes, anio;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dia");
        dia = leer.nextInt();
        System.out.println("Ingrese mes");
        mes = leer.nextInt();
        System.out.println("Ingrese año");
        anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        Date fechaActual = new Date();
        
        System.out.println(fecha);
        System.out.println(fechaActual);
        
        int diaActual = fechaActual.getDate();
        int mesActual = fechaActual.getMonth()+1;
        int anioActual = fechaActual.getYear()+1900;
       
        int diferencia = anioActual-anio;
       
        System.out.println("El año actual es " + anioActual);
        System.out.println("El mes actual es " + mesActual);
        System.out.println("El dia actual es " + diaActual);
        System.out.println("La diferencia de años es de " + diferencia);
    }

    
}
