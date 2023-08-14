package Biblioteca;

public class Aluno {
	// Atributos da classe
	private String nome;
	private int registro;
	
	// Construtor da classe
	
	public Aluno(String nome, int registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	//Metodos da classe
	
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
