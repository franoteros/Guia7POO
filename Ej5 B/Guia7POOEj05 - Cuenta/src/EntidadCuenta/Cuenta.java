
package EntidadCuenta;

/**
 *
 * @author Franoteros
 */
public class Cuenta {
    int numCuenta, Dni;
    Double saldo, interes;
    String NomyAp;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, int Dni, Double saldo, Double interes, String NomyAp) {
        this.numCuenta = numCuenta;
        this.Dni = Dni;
        this.saldo = saldo;
        this.interes = interes;
        this.NomyAp = NomyAp;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public String getNomyAp() {
        return NomyAp;
    }

    public void setNomyAp(String NomyAp) {
        this.NomyAp = NomyAp;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", Dni=" + Dni + ", saldo=" + saldo + ", interes=" + interes + ", NomyAp=" + NomyAp + '}';
    }
    
    

}
