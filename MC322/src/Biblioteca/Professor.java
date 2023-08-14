package Biblioteca;

public class Professor {
	// Atributos da classe
	private String nome;
	private int registro;
	
	//Construtor da classe
	
	public Professor(String nome, int registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	//Métodos da classe
	
	public void pegarLivro() {
		
	}
	
	//Getters and Setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getRegistro() {
		return registro;
	}
	
	public void setRegistro(int registro) {
		this.registro = registro;
	}
}
