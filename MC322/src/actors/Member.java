package actors;

import flows.Loan;
import resources.Book;
import java.util.Date;

public class Member {
	// Atributos da classe
	private String name;
	private int id;
	private Loan[] loans;
	
	//Construtor da classe
	public Member(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void borrowBook(Book book) {
		Loan loan = new Loan(book, new Date());
	}
	
}
