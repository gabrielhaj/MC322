package library;

import actors.LibraryEmployee;
import actors.Member;
import resources.Multimedia;

public class Library {
	// Relações de agregação
	private LibraryEmployee[] employees;
	private Member[] members;
	private Multimedia[] multimedias;
	
	public Library() {
		this.employees = new LibraryEmployee[0];
		this.members = new Member[0];
		this.multimedias = new Multimedia[0];
	}


	public LibraryEmployee[] getEmployees() {
		return employees;
	}


	public Member[] getMembers() {
		return members;
	}


	public Multimedia[] getMultimedias() {
		return multimedias;
	}
	
	public void addEmployee(LibraryEmployee employee) {
		int n = this.employees.length;
		LibraryEmployee[] newEmployees = new LibraryEmployee[n + 1];
		int i;
		for(i = 0; i < n; i++) {
			newEmployees[i] = this.employees[i];
		}
		newEmployees[i] = employee;
		this.employees = newEmployees;
	}
	
	public void addMember(Member member) {
		int n = this.members.length;
		Member[] newMembers = new Member[n + 1];
		int i;
		for(i = 0; i < n; i++) {
			newMembers[i] = this.members[i];
		}
		newMembers[i] = member;
		this.members = newMembers;
	}
	
	public void addMultimedia(Multimedia multimedia) {
		int n = this.multimedias.length;
		Multimedia[] newMultimedias = new Multimedia[n + 1];
		int i;
		for(i = 0; i < n; i++) {
			newMultimedias[i] = this.multimedias[i];
		}
		newMultimedias[i] = multimedia;
		this.multimedias = newMultimedias;
	}	
}
