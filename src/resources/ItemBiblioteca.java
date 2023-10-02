package resources;
import java.util.ArrayList;
import java.util.List;

public class ItemBiblioteca<T> {
	private List<T> itensReservados = new ArrayList<T>();
	private List<T> itensEmprestados = new ArrayList<T>();
	private int numeroDeItensEmprestados;
	private int numeroDeItensReservados;
	
	public ItemBiblioteca() {
		this.itensReservados = new ArrayList<T>();
		this.itensEmprestados = new ArrayList<T>();
		this.numeroDeItensEmprestados = 0;
		this.numeroDeItensReservados = 0;
	}

	public List<T> getItensReservados() {
		return itensReservados;
	}

	public List<T> getItensEmprestados() {
		return itensEmprestados;
	}

	public int getNumeroDeItensEmprestados() {
		return numeroDeItensEmprestados;
	}

	public int getNumeroDeItensReservados() {
		return numeroDeItensReservados;
	}
	
	public void reservarItem(T item) {
		this.itensReservados.add(item);
		this.numeroDeItensReservados ++;
	}
	
	public void emprestarItem(T item) {
		this.itensEmprestados.add(item);
		this.numeroDeItensEmprestados ++;
	}
	
	public void devolverItem(T item) {
		if(this.itensReservados.contains(item)) {
			this.numeroDeItensReservados --;
			this.itensReservados.remove(item);
			//chamar empréstimo
		} else if(this.itensEmprestados.contains(item)) {
			this.itensEmprestados.remove(item);
			this.numeroDeItensEmprestados --;
		} else {
			System.out.println("Erro: Item não emprestado");
		} 	
	}
}
