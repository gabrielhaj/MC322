package actors;

public class Employee {
	// Atributos da classe
	private String name;
	private int id;
	
	//Construtor da classe
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
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

//	public void setId(int id) {
//		this.id = id;
//	}
	
}
