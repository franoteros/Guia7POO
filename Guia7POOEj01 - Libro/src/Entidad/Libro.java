
package Entidad;

/**
 *
 * @author Franoteros
 */
public class Libro {
    private String ISBN;
    private String Autor;
    private String Titulo;
    private int NumPag;

    public Libro() {
    }

    public Libro(String ISBN, String Autor, String Titulo, int NumPag) {
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.NumPag = NumPag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getNumPag() {
        return NumPag;
    }

    public void setNumPag(int numPag) {
        this.NumPag = numPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Autor=" + Autor + ", Titulo=" + Titulo + ", numPag=" + NumPag + '}';
    }
    
  

    
}
