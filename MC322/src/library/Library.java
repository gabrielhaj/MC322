package library;

import actors.Employee;
import actors.Member;
import resources.Book;

public class Library {
	private String name;
	private Employee[] employees;
	private Member[] members;
	private Book[] books;
	

	public Library(String name, Employee[] employees, Member[] members, Book[] books) {
		this.name = name;
		this.employees = employees;
		this.members = members;
		this.books = books;
	}


	public String getName() {
		return name;
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
	
	
	
	
	
}
