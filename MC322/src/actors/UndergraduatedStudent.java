package actors;

import java.util.Date;

import flows.Loan;

public class UndergraduatedStudent extends Member{
	private int MAX_LOANS = 3;
	private int LOAN_LIMIT_IN_DAYS = 15;
	private double FINE_PER_DAY = 1;
	
	public UndergraduatedStudent(String name, int id, String address, String phoneNumber, Date registrationDate) {
		super(name, id, address, phoneNumber, registrationDate);
	}
	
}
