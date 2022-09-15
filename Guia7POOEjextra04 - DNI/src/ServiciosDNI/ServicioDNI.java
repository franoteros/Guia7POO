
package ServiciosDNI;

import EntidadesDni.DNI;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioDNI {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        String[] vectorNif = new String[23];
        int numNif;
        int i;
        
    public DNI crearNif(){
        DNI Nif1 = new DNI();
        System.out.println("Ingrese su numero de DNI sin puntos ni guiones");
        Nif1.setDni(leer.nextInt());
        numNif = Nif1.getDni()%23;

        vectorNif[0] = "T";
        vectorNif[1] = "R";
        vectorNif[2] = "W";
        vectorNif[3] = "A";
        vectorNif[4] = "G";
        vectorNif[5] = "M";
        vectorNif[6] = "Y";
        vectorNif[7] = "F";
        vectorNif[8] = "P";
        vectorNif[9] = "D";
        vectorNif[10] = "X";
        vectorNif[11] = "B";
        vectorNif[12] = "N";
        vectorNif[13] = "J";
        vectorNif[14] = "Z";
        vectorNif[15] = "S";
        vectorNif[16] = "Q";
        vectorNif[17] = "V";
        vectorNif[18] = "H";
        vectorNif[19] = "L";
        vectorNif[20] = "C";
        vectorNif[21] = "K";
        vectorNif[22] = "E";
        return Nif1;
    }
    
    public void mostrarNif(DNI Nif1){
        for(i=0; i<23; i++){
            if(i == numNif){
                System.out.println("Su NIF es " + Nif1.getDni() + "-" + vectorNif[i]);
            }
        }
    }
            
            
        
    

}
