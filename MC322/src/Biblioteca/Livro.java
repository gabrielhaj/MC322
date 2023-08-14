package Biblioteca;
public class Livro {
	// Atributos da classe
	private String titulo;
	private String autor;
	private int registro;
	private String genero;
	
	// Construtor da classe
	public Livro(String titulo, String autor,
			int registro, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.registro = registro;
		this.genero = genero;
	}
	
	//Getters and Setters
	
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
	
	public int getRegistro() {
		return registro;
	}
	
	public void setRegistro(int registro) {
		 this.registro = registro;
	}
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		 this.genero = genero;
	}
}

