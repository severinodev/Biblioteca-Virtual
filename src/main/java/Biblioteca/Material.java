package Biblioteca;

public abstract class Material {
    protected String titulo;
    protected String autor;
    protected String id;
    protected String anioPublicacion;

    public Material(String titulo, String autor, String id, String anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getId() { return id; }
    public String getAnioPublicacion() { return anioPublicacion; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setId(String id) { this.id = id; }
    public void setAnioPublicacion(String anio) { this.anioPublicacion = anio; }

    public abstract String getDetalles();
}