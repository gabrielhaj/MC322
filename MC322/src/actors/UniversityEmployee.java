package actors;

import java.util.Date;

import flows.Loan;

public class UniversityEmployee extends Member{

	public UniversityEmployee(String name, int id, String address, String phoneNumber, Date registrationDate,
			Loan[] loans) {
		super(name, id, address, phoneNumber, registrationDate, loans);
	}

}
