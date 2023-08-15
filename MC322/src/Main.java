import actors.Member;
import actors.Employee;
import resources.Book;
import flows.Loan;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Book book = new Book(
		    "Guia do Mochilheiro das Galáxias",
		    "Douglas Adams",
		    1,
		    "Scifi"
		);
		Member member = new Member(
			"Arthur Cantarela",
			135017
		);
		Employee employee = new Employee(
			"Gabriel Haj",
			171859
		);
		
		Loan loan = new Loan(
		    book,
		    member,
		    employee,
		    new Date()
		);
		
		System.out.println("Que livro foi emprestado? " + loan.getBook().getTitle());
		System.out.println("Quem pegou emprestado? " + loan.getMember().getName());
		System.out.println("Que funcionário emprestou? " + loan.getEmployee().getName());
		
		System.out.println("Foi devolvido? " + (loan.isReturned() ? "Sim" : "Não"));
		
		System.out.println("Devolvendo...");
		loan.returnBook();
		
		System.out.println("Foi devolvido? " + (loan.isReturned() ? "Sim" : "Não"));
	}
}
