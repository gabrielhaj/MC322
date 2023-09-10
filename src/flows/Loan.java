package flows;

import resources.Multimedia;
import java.util.Date;

import actors.Member;

public class Loan {
	private Multimedia multimedia;
	private Date startedAt;
	private Date returnedAt;
	private int deadlineInDays;
	private Member member;
	
	
	public Loan(Multimedia multimedia, Member member) {
		this.multimedia = multimedia;
		this.deadlineInDays = member.getLOAN_LIMIT_IN_DAYS();
		this.member = member;
		member.pushLoan(this);
		this.startedAt = new Date();
		this.returnedAt = null;
	}

	// methods
	public Member getMember() {
		return member;
	}
	
	public boolean isReturned() {
		return returnedAt == null ? false : true;
	}
	
	public void returnBook() {
		this.returnedAt = new Date();
	}
	
	public void renovate() {
		this.deadlineInDays += this.member.getLOAN_LIMIT_IN_DAYS();
	}
	
	public int getDaysInLoan() {
		/** @TODO real calculation with dates */
		return 1;
	}
	
	public boolean isLate() {
		return getDaysInLoan() <= this.deadlineInDays;
	}
	
	public double getFine() {
		if(!this.isLate()) {
			return 0;
		} else {
			return (this.getDaysInLoan() - this.deadlineInDays) * this.member.getFINE_PER_DAY();
		}
	}
}
