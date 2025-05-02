package TP5;

public class Peliculas {
	
	private String titulo;
    private Categorias categoria;
    private int id;

    public Peliculas(int id, String titulo, Categorias categoria) {
    	this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



	public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    public int getId()
    {
    	return id;
    }
    @Override
	public String toString() {
		return "Peliculas [titulo=" + titulo + ", categoria=" + categoria + ", id=" + id + "]";
	}
}
