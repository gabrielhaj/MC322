	package actors;

import excecao.ExcecaoDevolucaoSemEmprestimo;
import excecao.ExcecaoItemDanificado;
import excecao.ExcecaoItemNaoDisponivel;
import excecao.ExcecaoLimiteEmprestimosExcedido;
import excecao.ExcecaoMultasPendentes;
import flows.Loan;
import resources.Multimedia;

//Parent class from manager that is administrator parent
public class LibraryEmployee {
	// Atributos da classe
	private String name;
	private int id;
	private String phoneNumber;
	
	public LibraryEmployee(String name, int id, String phoneNumber) {
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void registerLoan(Multimedia multimedia, Member member) 
			throws ExcecaoLimiteEmprestimosExcedido, ExcecaoItemNaoDisponivel, ExcecaoMultasPendentes{
		if(multimedia.isAvailable()) {
			if(member.getLoans().length < member.getMAX_LOANS()) {
				Loan[] loans = member.getLoans();
				int totalFine = 0;
				for(int i = 0; i < loans.length; i++) {
					totalFine += loans[i].getFine();					
				}
				if(totalFine == 0) {
					Loan loan = new Loan(multimedia, member);
				} else {
					throw new ExcecaoMultasPendentes("O usuário possui multas pendentes");
				}
			} else {
				throw new ExcecaoLimiteEmprestimosExcedido("O limite de empréstimos do usuário já foi atingido.");
			}
				
		} else {
			throw new ExcecaoItemNaoDisponivel("O item não está disponível.");
		}
	
	}
	
	public void registerRenovation(Loan loan){
		loan.renovate();
	}
	
	public void registerDevolution(Loan loan) 
			throws ExcecaoDevolucaoSemEmprestimo,ExcecaoItemDanificado  {
		loan.returnBook();
	}
}
