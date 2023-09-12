package resources;

import java.util.Date;

public class ReservaSala {
		private Date dataReserva;
		private Date horaInicio;
		private Date horaFim;
		
		public ReservaSala(Date dataReserva, Date horaInicio, Date horaFim) {
			this.dataReserva = dataReserva;
			this.horaInicio = horaInicio;
			this.horaFim = horaFim;
		}
		public Date getDataReserva() {
			return dataReserva;
		}
		public Date getHoraInicio() {
			return horaInicio;
		}
		public Date getHoraFim() {
			return horaFim;
		}

		public class SalaIndividual {
			private int numSala;
			private boolean computador;
			
			public SalaIndividual(int numSala, boolean computador) {
				this.numSala = numSala;
				this.computador = computador;
			}

			public int getNumSala() {
				return numSala;
			}

			public boolean getComputador() {
				return computador;
			}
		}
		
		public class SalaGrupo {
			private int numSala;
			private int maxLotacao;
			private boolean projetor;
			
			public SalaGrupo(int numSala, int maxLotacao, boolean projetor) {
				this.numSala = numSala;
				this.maxLotacao = maxLotacao;
				this.projetor = projetor;
			}

			public int getNumSala() {
				return numSala;
			}

			public int getMaxLotacao() {
				return maxLotacao;
			}

			public boolean isProjetor() {
				return projetor;
			}
		}
		
		public class SalaSilenciosa {
			private int numSala;
			private int numAssentos;
			private boolean cabines;
			
			public SalaSilenciosa(int numSala, int numAssentos, boolean cabines) {
				this.numSala = numSala;
				this.numAssentos = numAssentos;
				this.cabines = cabines;
			}

			public int getNumSala() {
				return numSala;
			}

			public int getNumAssentos() {
				return numAssentos;
			}

			public boolean isCabines() {
				return cabines;
			}
		}
		
		public class SalaMultimedia {
			private int numSala;
			private boolean gravacaoVideo;
			private boolean gravacaoAudio;
			
			public SalaMultimedia(int numSala, boolean gravacaoVideo, boolean gravacaoAudio) {
				this.numSala = numSala;
				this.gravacaoVideo = gravacaoVideo;
				this.gravacaoAudio = gravacaoAudio;
			}

			public int getNumSala() {
				return numSala;
			}

			public boolean isGravacaoVideo() {
				return gravacaoVideo;
			}

			public boolean isGravacaoAudio() {
				return gravacaoAudio;
			}
		}
		
		public enum StatusReserva {
			PENDENTE,
			CONFIRMADA,
			CANCELADA
		}			
}
