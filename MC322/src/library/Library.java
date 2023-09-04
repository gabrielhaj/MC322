package library;

import actors.LibraryEmployee;
import actors.Member;
import resources.Multimedia;

public class Library {
	// Relações de agregação
	private LibraryEmployee[] employees;
	private Member[] members;
	private Multimedia[] books;
	

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


	public Multimedia[] getBooks() {
		return books;
	}
	
	//todo
	public void addEmployee() {
		return;
	}
	
	
	
	
}
