package Biblioteca;

public class Libro extends Material {
    private String categoria;
    private int numeroPaginas;

    public Libro(String titulo, String autor, String id, String anioPublicacion, String categoria, int numeroPaginas) {
        super(titulo, autor, id, anioPublicacion);
        this.categoria = categoria;
        this.numeroPaginas = numeroPaginas;
    }

    public String getCategoria() { return categoria; }
    public int getNumeroPaginas() { return numeroPaginas; }

    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

@Override
public String getDetalles() {
    return "Título: " + titulo + ", Autor: " + autor + ", ID: " + id + 
           ", Año: " + anioPublicacion + ", Categoría: " + categoria + 
           ", Páginas: " + numeroPaginas;
}

}