
package ServicioPersona;

import EntidadPersona.Persona;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    Double IMC;
    
    int imc;
    int contMayor = 0;
    int contMenor = 0;
    
    public Persona crearPersona(){
        Persona Per = new Persona();
        boolean check = false;
        System.out.println("Ingrese su nombre completo");
        Per.setNomyAp(leer.nextLine());
        System.out.println("Ingrese su edad");
        Per.setEdad(leer.nextInt());
        leer.skip("\n");
        
        do{
            System.out.println("Ingrese el sexo: H, M u O");
            Per.setSexo(leer.nextLine());
            if("h".equalsIgnoreCase(Per.getSexo()) || "m".equalsIgnoreCase(Per.getSexo()) || "o".equalsIgnoreCase(Per.getSexo())){
            check = true;
            }else{
                check = false;
            }
        }while(check == false);
        
        System.out.println("Ingrese su peso en kilos");
        Per.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura en metros");
        Per.setAltura(leer.nextDouble());
        leer.skip("\n");
        return Per;
    }
    
    public int calcularIMC (Persona Per){
        IMC = Per.getPeso() / (Math.pow(Per.getAltura(), 2));
        System.out.println("El indice de masa muscular de " + Per.getNomyAp() + " es " + IMC);
        if(IMC < 20){
            imc = -1;
            System.out.println("Su IMC esta por debajo de lo normal");
        }
        if(IMC >= 20 && IMC <= 25){
            imc = 0;
            System.out.println("Su IMC esta dentro de lo normal");
        }
        if(IMC > 25){
            imc = 1;
            System.out.println("Su IMC esta por encima de lo normal");
        }
        return imc;
    }
    
    public boolean mayorEdad(Persona Per){
        boolean mayor = false;
        if(Per.getEdad() > 60){
            mayor = true;
        }
        return mayor;
    }



    
    
    
}
