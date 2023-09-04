package actors;

import java.util.Date;

import flows.Loan;

public class UniversityEmployee extends Member{
	private int MAX_LOANS = 4;
	private int LOAN_LIMIT_IN_DAYS = 20;
	private double FINE_PER_DAY = .75;

	public UniversityEmployee(String name, int id, String address, String phoneNumber, Date registrationDate) {
		super(name, id, address, phoneNumber, registrationDate);
	}

}
