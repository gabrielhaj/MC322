package library;

import actors.Employee;
import actors.Member;
import resources.Book;

public class Library {
	// Relações de agregação
	private Employee[] employees;
	private Member[] members;
	private Book[] books;
	

	public Library(String name, Employee[] employees, Member[] members, Book[] books) {
		this.employees = employees;
		this.members = members;
		this.books = books;
	}




	public Employee[] getEmployees() {
		return employees;
	}


	public Member[] getMembers() {
		return members;
	}


	public Book[] getBooks() {
		return books;
	}
	
	//todo
	public void addEmployee() {
		return;
	}
	
	
	
	
}
