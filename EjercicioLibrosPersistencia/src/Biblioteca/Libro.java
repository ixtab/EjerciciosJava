package Biblioteca;

import java.io.Serializable;

public class Libro implements Serializable
{
	private static final long serialVersionUID = -2244607759911604415L;
	private String isbn;
	private String titulo;
	private String autor;
	
	public Libro(String isbn, String titulo, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
	
}
