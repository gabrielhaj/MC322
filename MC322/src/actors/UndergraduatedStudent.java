package actors;

import java.util.Date;

import flows.Loan;

public class UndergraduatedStudent extends Member{

	public UndergraduatedStudent(String name, int id, String address, String phoneNumber, Date registrationDate,
			Loan[] loans) {
		super(name, id, address, phoneNumber, registrationDate, loans);
	}
	
}
