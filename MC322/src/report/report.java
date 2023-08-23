package report;
import library.Library;

public class report {
	//Relação de associação
	private Library library;


	public report(Library library) {
		this.library = library;
	}
	
	public void printReport() {
		System.out.println("Quantidade de funcionários: " + this.library.getEmployees().length);
		System.out.println("Quantidade de livros: " + this.library.getBooks().length);
		System.out.println("Quantidade de membros: " + this.library.getMembers().length);
	}
 }

