package actors;

import java.util.Date;

public class Professor extends Member {
	private int MAX_LOANS = 7;
	private int LOAN_LIMIT_IN_DAYS = 30;
	private double FINE_PER_DAY = .5;
	
	public Professor(String name, int id, String address, String phoneNumber, Date registrationDate) {
		super(name, id, address, phoneNumber, registrationDate);
	}
}
