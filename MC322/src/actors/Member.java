package actors;

import flows.Loan;
import resources.Book;
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
	
	//Construtor da classe
	
	public Member(String name, int id, String address, String phoneNumber, Date registrationDate, Loan[] loans) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.registrationDate = registrationDate;
		this.loans = loans;
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



	public void loanBook(Book book) {
		Loan newLoan = new Loan(book, 5); // 5 days
		//todo append loan to loans
        Loan newLoans[] = new Loan[this.loans.length + 1];
        int i;
        for(i = 0; i < this.loans.length; i++) {
            newLoans[i] = this.loans[i];
        }
        newLoans[i] = newLoan;
        this.loans = newLoans;
	}
	
}
