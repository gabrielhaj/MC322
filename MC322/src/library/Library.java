package library;

import actors.LibraryEmployee;
import actors.Member;
import resources.Book;

public class Library {
	// Relações de agregação
	private LibraryEmployee[] employees;
	private Member[] members;
	private Book[] books;
	

	public Library(String name, LibraryEmployee[] employees, Member[] members, Book[] books) {
		this.employees = employees;
		this.members = members;
		this.books = books;
	}




	public LibraryEmployee[] getEmployees() {
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
