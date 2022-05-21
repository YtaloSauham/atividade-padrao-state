package states;

import entities.Processo;

public class Deferido implements EstadoProcesso {

	@Override
	public void criado(Processo processo) {
		throw new RuntimeException("Processo já deferido");
		
	}

	@Override
	public void emAvaliacao(Processo processo) {
		throw new RuntimeException("Processo já deferido");
		
	}

	@Override
	public void emRecurso(Processo processo) {
		throw new RuntimeException("Processo já deferido");
		
	}

	@Override
	public void indeferido(Processo processo) {
		throw new RuntimeException("Processo já deferido");
		
	}

	@Override
	public void deferido(Processo processo) {
		throw new RuntimeException("Processo já deferido");
	}

	@Override
	public void fechado(Processo processo) {
		processo.EstadoAtual(new Fechado());
		
	}
	

}
