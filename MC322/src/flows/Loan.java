package flows;

import resources.Book;
import java.util.Date;

public class Loan {
	private Book book;
	private Date dueDate;
	private Date returnedAt;
	
	public Loan(Book book, Date dueDate) {
		this.book = book;
		this.dueDate = dueDate;
		returnedAt = null;
	}

	// getter/setter
	public Book getBook() {
		return book;
	}

	public Date getDueDate() {
		return dueDate;
	}
	
	// methods
	public boolean isReturned() {
		return returnedAt == null ? false : true;
	}
	
	public void returnBook() {
		this.returnedAt = new Date();
	}
	
	public void renovate(Date newDate) {
		dueDate = newDate;
	}
}
