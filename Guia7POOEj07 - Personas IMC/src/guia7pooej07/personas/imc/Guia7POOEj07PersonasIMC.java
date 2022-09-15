
package guia7pooej07.personas.imc;

 //* @author Franoteros
import EntidadPersona.Persona;
import ServicioPersona.ServicioPersona;
import java.util.Scanner;


public class Guia7POOEj07PersonasIMC {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int imc1, imc2, imc3, imc4;
        Double i, j, k;
        boolean mayor1;
        boolean mayor2;
        boolean mayor3;
        boolean mayor4;
        
        double promImc, promImcMenor, promImcIgual, promImcMayor, promMayor, promMenor, pr;
        i = 0.0;
        j = 0.0;
        k = 0.0;
        promImc = 4.0;
        
        ServicioPersona sp = new ServicioPersona();
        System.out.println("Datos persona 1");
        Persona p1 = sp.crearPersona();
        System.out.println("Datos persona 2");
        Persona p2 = sp.crearPersona();
        System.out.println("Datos persona 3");
        Persona p3 = sp.crearPersona();
        System.out.println("Datos persona 4");
        Persona p4 = sp.crearPersona();
        
        //----------------------------------------
        
        imc1 = sp.calcularIMC(p1);
        imc2 = sp.calcularIMC(p2);
        imc3 = sp.calcularIMC(p3);
        imc4 = sp.calcularIMC(p4);
        
        if(imc1 == -1){
            i++;
        }if(imc2 == -1){
            i++;
        }if(imc3 == -1){
            i++;
        }if(imc4 == -1){
            i++;
        }if(imc1 == 0){
            j++;
        }if(imc2 == 0){
            j++;
        }if(imc3 == 0){
            j++;
        }if(imc4 == 0){
            j++;
        }if(imc1 == 1){
            k++;
        }if(imc2 == 1){
            k++;
        }if(imc3 == 1){
            k++;
        }if(imc4 == 1){
            k++;
        }
        promImcMenor = (i / promImc) * 100;
        promImcMayor = (k / promImc) * 100;
        promImcIgual = (j / promImc) * 100;
        System.out.println("El " + promImcMenor + "% tiene el IMC bajo");
        System.out.println("El " + promImcMayor + "% tiene el IMC alto");
        System.out.println("El " + promImcIgual + "% tiene el IMC optimo");
        
        //---------------------------------------
        
        mayor1 = sp.mayorEdad(p1);
        mayor2 = sp.mayorEdad(p2);
        mayor3 = sp.mayorEdad(p3);
        mayor4 = sp.mayorEdad(p4);
        
        if(mayor1){
            i++;
        }
        if(mayor2){
            i++;
        }
        if(mayor3){
            i++;
        }
        if(mayor4){
            i++;
        }
        
        promMayor = (i / 4) * 100;
        pr = 4 - i;
        promMenor = (pr / 4) * 100;
        System.out.println(i);
        System.out.println(pr);
        System.out.println("El promedio de mayores de edad es " + promMayor + "%");
        System.out.println("El promedio de menores de edad es " + promMenor + "%");
    }

    
    
    
}
