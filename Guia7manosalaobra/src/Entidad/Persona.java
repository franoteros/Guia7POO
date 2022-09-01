package Entidad;

public class Persona {

    // aca declaro los tipos para cada atributo.
    private String nombre;
    private String apellido;
    private int edad;

    // este es un constructor.
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    // este es un constructor vacio.
    public Persona() {
    }

    // aca hago un SETTER (para cambiar un dato de un atributo o asignar uno nuevo, al
    // estar todos los atributos en PRIVATE).
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // tambien se pueden hacer SETTERS con condicionales, por ejemplo
    // para setear un APELLIDO (en este caso) si es que el largo del nombre es
    // mayor a 0 (cero).
    public void setApellido(String apellido) {
        if (apellido.length() > 0) {
            this.apellido = apellido;
        }
    }
    
    // aca genero los GETTERS.
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }

    // éste es un toString: sirve para mostrar todos los atributos del objeto.
    // genera un string con el nombre del tipo de atributo y el valor del atributo; asi, para cada uno de ellos.
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    
    
    

}
