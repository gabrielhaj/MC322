package resources;

import java.util.Date;

public class EventosBiblioteca {
		public class Palestra {
			private String palestrante;
			private String topico;
			private Date data;
			private Date horario;
			private String local;
			
			public Palestra(String palestrante, String topico, Date data, Date horario, String local) {
				this.palestrante = palestrante;
				this.topico = topico;
				this.data = data;
				this.horario = horario;
				this.local = local;
			}

			public String getPalestrante() {
				return palestrante;
			}

			public String getTopico() {
				return topico;
			}

			public Date getData() {
				return data;
			}

			public Date getHorario() {
				return horario;
			}

			public String getLocal() {
				return local;
			}
			
		}
		
		public class Workshop {
			private String instrutor;
			private String topico;
			private String materiaisNecessarios;
			private Date data;
			private Date horario;
			private String local;
			
			public Workshop(String instrutor, String topico, String materiaisNecessarios, Date data, Date horario,
					String local) {
				this.instrutor = instrutor;
				this.topico = topico;
				this.materiaisNecessarios = materiaisNecessarios;
				this.data = data;
				this.horario = horario;
				this.local = local;
			}

			public String getInstrutor() {
				return instrutor;
			}

			public String getTopico() {
				return topico;
			}

			public String getMateriaisNecessarios() {
				return materiaisNecessarios;
			}

			public Date getData() {
				return data;
			}

			public Date getHorario() {
				return horario;
			}

			public String getLocal() {
				return local;
			}
			
		}
		
		public class Exposicao {
			private String tema;
			private String Expositores[];
			private Date duracao;
			private String local;
			
			public Exposicao(String tema, String[] expositores, Date duracao, String local) {
				this.tema = tema;
				Expositores = expositores;
				this.duracao = duracao;
				this.local = local;
			}

			public String getTema() {
				return tema;
			}

			public String[] getExpositores() {
				return Expositores;
			}

			public Date getDuracao() {
				return duracao;
			}

			public String getLocal() {
				return local;
			}			
			
		}
		
		public enum TipoDeEvento {
			PALESTRA,
			WORKSHOP,
			EXPOSICAO
		}
		
}
