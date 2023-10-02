package resources;
import java.util.ArrayList;
import java.util.List;

public class ListaReservas<T> {
	private List<T> itensReservados = new ArrayList<T>();
	private int numeroDeItensReservados;
	public ListaReservas() {
		this.itensReservados = new ArrayList<T>();
		this.numeroDeItensReservados = 0;
	}
	public List<T> getItensReservados() {
		return itensReservados;
	}
	public int getNumeroDeItensReservados() {
		return numeroDeItensReservados;
	}
	
	public void reservarItem(T item) {
		this.itensReservados.add(item);
		this.numeroDeItensReservados ++;
	}
	
	
}
