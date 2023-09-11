package resources;

public class Equipamentos {
	public class Informatica {
		private String categoria;

		public Informatica(String categoria) {
			this.categoria = categoria;
		}

		public String getCategoria() {
			return categoria;
		}
		
	}
	
	public class Audiovisual {
		private String categoria;

		public Audiovisual(String categoria) {
			this.categoria = categoria;
		}

		public String getCategoria() {
			return categoria;
		}
		
	}
	
	public class Impressao {
		private String categoria;

		public Impressao(String categoria) {
			this.categoria = categoria;
		}

		public String getCategoria() {
			return categoria;
		}
		
	}
	
	public enum CategoriaEquipamento {
		INFORMATICA,
		AUDIOVISUAL,
		IMPRESSAO
	}
}
