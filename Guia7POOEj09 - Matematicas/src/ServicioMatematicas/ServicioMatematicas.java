
package ServicioMatematicas;

import Entidad.Matematicas;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioMatematicas {
    
    Scanner leer = new Scanner(System.in);
    
    public Matematicas crearMatematica(){
        Matematicas M = new Matematicas();
        M.setNum1(Math.random()*10);
        M.setNum2(Math.random()*10);
        return M;
    }
    
    

}
