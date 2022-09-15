
package EntidadPersona;

/**
 *
 * @author Franoteros
 */
public class Persona {
    String NomyAp;
    int edad;
    String sexo;
    Double peso;
    Double altura;

    public Persona() {
    }

    public Persona(String NomyAp, int edad, String sexo, Double peso, Double altura) {
        this.NomyAp = NomyAp;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNomyAp() {
        return NomyAp;
    }

    public void setNomyAp(String NomyAp) {
        this.NomyAp = NomyAp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "NomyAp=" + NomyAp + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    

}
