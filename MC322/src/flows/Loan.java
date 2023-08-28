package flows;

import resources.Book;
import java.util.Date;

public class Loan {
	private Book book;
	private Renovation[] renovations;
	private Date startedAt;
	private Date returnedAt;
	private int deadlineInDays;
	
	
	public Loan(Book book, int deadlineInDays) {
		this.book = book;
		this.deadlineInDays = deadlineInDays;
		this.startedAt = new Date();
		this.returnedAt = null;
	}

	// methods
	public boolean isReturned() {
		return returnedAt == null ? false : true;
	}
	
	public void returnBook() {
		this.returnedAt = new Date();
	}
	
	public void renovate(Date newDate) {
		//todo
	}
}
