package report;

import actors.Member;

import flows.Loan;


public class MemberActivityReport {
	private Member member;

	public MemberActivityReport(Member member) {
		this.member = member;
	}
	
	public int loanReport() {
		return this.member.getLoans().length;
		
	}
	
	public int returnedReport() {
		Loan[] loan = this.member.getLoans();
		int returnedTotalAmount = 0;
		for (int i = 0; i < loan.length; i++) {
			if(loan[i].isReturned()) {
				returnedTotalAmount ++;
			}
		}
		return returnedTotalAmount;
	}
	
	//todo
	public int fineReport() {
		int returnedTotalAmount;
		Loan[] loan = this.member.getLoans();
		int totalFine = 0;
		for (int i = 0; i < loan.length; i++) {
			totalFine += loan[i].getFine();
		}
		return totalFine;
	}
	
	
}
