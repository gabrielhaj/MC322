package actors;

import flows.Loan;
import resources.Multimedia;

//Parent class from manager that is administrator parent
public class LibraryEmployee {
	// Atributos da classe
	private String name;
	private int id;
	private String phoneNumber;
	
	public LibraryEmployee(String name, int id, String phoneNumber) {
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void registerLoan(Multimedia multimedia, Member member) {
		if(multimedia.isAvailable()) {
			Loan loan = new Loan(multimedia, member);	
		} else {
			/** @TODO error */
		}
	}
	
	public void registerRenovation(Loan loan){
		loan.renovate();
	}
	
	public void registerDevolution(Loan loan) {
		loan.returnBook();
	}
}
