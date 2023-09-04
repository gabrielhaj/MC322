package actors;


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
	
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public int getId() {
		return id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

//	public void setId(int id) {
//		this.id = id;
//	}
	
	public void registerLoan() {
		
	}
	
	public void registerRenovation(){
		
	}	
	
	public void registerDevolution() {
		
	}
}
