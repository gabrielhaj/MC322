package actors;

import java.util.Date;

import flows.Loan;

public class GraduatedStudent extends Member {
	private int MAX_LOANS = 5;
	private int LOAN_LIMIT_IN_DAYS = 20;
	private double FINE_PER_DAY = 1;

	public GraduatedStudent(String name, int id, String address, String phoneNumber, Date registrationDate) {
		super(name, id, address, phoneNumber, registrationDate);
	}

}
