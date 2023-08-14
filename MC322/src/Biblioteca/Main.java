package Biblioteca;
public class Main {
	public static void main(String [] args) {
		Aluno aluno1 = new Aluno("Gabriel", 171859);
		Livro livro1 = new Livro("Calculo 1", "Stewart", 111222, "Educativo");
		Professor professor1 = new Professor("Carlos", 123456);
		
		String nomeAluno = aluno1.getNome();
		String nomeProfessor = professor1.getNome();
		int registroLivro = livro1.getRegistro();
		
		aluno1.pegarLivro();
		professor1.pegarLivro();
		
		System.out.printIn("O nome do aluno é: "+ nomeAluno);
		System.out.printIn("O nome do professor é: "+ nomeProfessor);
	}
}
