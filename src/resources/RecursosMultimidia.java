package resources;


public class RecursosMultimidia {
	
	
	public class Audio {
		private String titulo;
		private String descricao;
		
		public Audio(String titulo, String descricao) {
			this.titulo = titulo;
			this.descricao = descricao;
		}

		public String getTitulo() {
			return titulo;
		}

		public String getDescricao() {
			return descricao;
		}
		
	}
	
	public class Video {
		private String titulo;
		private String descricao;
		
		public Video(String titulo, String descricao) {
			this.titulo = titulo;
			this.descricao = descricao;
		}

		public String getTitulo() {
			return titulo;
		}

		public String getDescricao() {
			return descricao;
		}
		
	}
	
	public class Software {
		private String titulo;
		private String descricao;
		
		public Software(String titulo, String descricao) {
			this.titulo = titulo;
			this.descricao = descricao;
		}

		public String getTitulo() {
			return titulo;
		}

		public String getDescricao() {
			return descricao;
		}
		
	}
	
	public enum FormatoMultimidia {
		AUDIO,
		VIDEO,
		SOFTWARE
	}
			
}
