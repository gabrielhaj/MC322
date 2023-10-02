package resources;
import java.util.ArrayList;
import java.util.List;



public class ListaEmprestimos<T> {
	private List<T> itensEmprestados = new ArrayList<T>();
	private int numeroDeItensEmprestados;
	public ListaEmprestimos() {
		this.itensEmprestados = new ArrayList<T>();
		this.numeroDeItensEmprestados = 0;
	}
	public List<T> getItensEmprestados() {
		return itensEmprestados;
	}
	public int getNumeroDeItensEmprestados() {
		return numeroDeItensEmprestados;
	}
	
	public void emprestarItem(T item) {
		this.itensEmprestados.add(item);
		this.numeroDeItensEmprestados ++;
	}
}
