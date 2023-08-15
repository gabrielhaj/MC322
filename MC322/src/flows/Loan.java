package flows;

import actors.Employee;
import actors.Member;
import resources.Book;
import java.util.Date;

public class Loan {
	private Book book;
	private Member member;
	private Employee employee;
	private Date dueDate;
	private Date returnedAt;
	
	public Loan(Book book, Member member, Employee employee, Date dueDate) {
		this.book = book;
		this.member = member;
		this.employee = employee;
		this.dueDate = dueDate;
		returnedAt = null;
	}

	// getter/setter
	public Book getBook() {
		return book;
	}

	public Member getMember() {
		return member;
	}
	
	public Employee getEmployee() {
		return employee;
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
}
