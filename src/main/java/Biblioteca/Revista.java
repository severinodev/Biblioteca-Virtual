package Biblioteca;

public class Revista extends Material {
    private String categoria;
    private String numeroEdicion;

    public Revista(String titulo, String autor, String id, String anioPublicacion, String categoria, String numeroEdicion) {
        super(titulo, autor, id, anioPublicacion);
        this.categoria = categoria;
        this.numeroEdicion = numeroEdicion;
    }

    public String getCategoria() { return categoria; }
    public String getNumeroEdicion() { return numeroEdicion; }

    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setNumeroEdicion(String numeroEdicion) { this.numeroEdicion = numeroEdicion; }

@Override
public String getDetalles() {
    return "Título: " + titulo + ", Autor: " + autor + ", ID: " + id + 
           ", Año: " + anioPublicacion + ", Categoría: " + categoria + 
           ", Edición: " + numeroEdicion;
}
}
