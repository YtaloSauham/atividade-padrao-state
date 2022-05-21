package states;

import entities.Processo;

public interface EstadoProcesso {

	
		void criado(Processo processo);
		void emAvaliacao(Processo processo);
		void emRecurso(Processo processo);
		void indeferido(Processo processo);
		void deferido(Processo processo);
		void fechado(Processo processo);

	

}
