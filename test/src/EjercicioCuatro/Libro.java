package EjercicioCuatro;

public class Libro {
    private String titulo;
    private String autor;
    private Integer puntaje;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer puntaje) {
        this.titulo = titulo;
        this.autor = autor;
        this.puntaje = puntaje;
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

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }
}
