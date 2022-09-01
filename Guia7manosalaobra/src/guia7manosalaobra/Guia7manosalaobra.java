
package guia7manosalaobra;

import Entidad.Persona;
public class Guia7manosalaobra {

    public static void main(String[] args) {
        // aca le asigno un valor a cada objeto a traves del constructor
        Persona persona01 = new Persona("Fran", "Otero", 37);
        Persona persona02 = new Persona("Pau", "Bernatene", 31);
        Persona persona03 = new Persona("Tina", "Simonetti", 68);
        Persona persona04 = new Persona();
        
        // aca le asigno un valor a un objeto a traves de SET
        persona04.setNombre("Diego");
        persona04.setApellido("Otero");
        persona04.setEdad(73); 
        
        // aca traigo valores de atributos de algun objeto a traves del GET
        System.out.println(persona01.getNombre() + " " + persona01.getApellido() + " " + persona01.getEdad());
        // aca traigo el toString del objeto que quiera
        System.out.println(persona01);
        System.out.println(persona02);
        
        
    }                                                                
}
