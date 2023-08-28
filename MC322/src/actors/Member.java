package actors;

import flows.Loan;
import resources.Book;
import java.util.Date;

public class Member {
	// Atributos da classe
	private String name;
	private Loan[] loans;
	
	//Construtor da classe
	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void loanBook(Book book) {
		Loan loan = new Loan(book, 5); // 5 days
		//todo append loan to loans
	}
	
}
