package actors;

import flows.Loan;
import resources.Multimedia;
import java.util.Date;

//Abstract class. Its childs are professor,students,universityemployees...
abstract public class Member {
	// Atributos da classe
	private String name;
	private int id;
	private String address;
	private String phoneNumber;
	private Date registrationDate;
	private Loan[] loans;
	private int MAX_LOANS;
	private int LOAN_LIMIT_IN_DAYS;
	private double FINE_PER_DAY;
	
	//Construtor da classe
	public Member(String name, int id, String address, String phoneNumber, Date registrationDate) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.registrationDate = registrationDate;
	}



	public String getName() {
		return name;
	}



	public int getId() {
		return id;
	}



	public String getAddress() {
		return address;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public Date getRegistrationDate() {
		return registrationDate;
	}



	public Loan[] getLoans() {
		return loans;
	}

	

	public int getMAX_LOANS() {
		return MAX_LOANS;
	}



	public int getLOAN_LIMIT_IN_DAYS() {
		return LOAN_LIMIT_IN_DAYS;
	}



	public double getFINE_PER_DAY() {
		return FINE_PER_DAY;
	}



	public void pushLoan(Loan loan) {
		if(loan.getMember() != this) {
			/** @TODO error */
		} else {			
			Loan newLoans[] = new Loan[this.loans.length + 1];
			int i;
			for(i = 0; i < this.loans.length; i++) {
				newLoans[i] = this.loans[i];
			}
			newLoans[i] = loan;
			this.loans = newLoans;
		}
	}
	
}
