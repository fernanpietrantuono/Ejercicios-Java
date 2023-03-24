package Entidades;

public class Ejercicio1Libro {
    public long ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    public Ejercicio1Libro() {
    }

    public Ejercicio1Libro(long ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Ejercicio1Libro{" + "ISBN= " + ISBN + ", titulo= " + titulo + ", autor= " + autor + ", paginas= " + paginas + '}';
    }
    
}
