package states;

import entities.Processo;

public class EmRecurso implements EstadoProcesso {

	@Override
	public void criado(Processo processo) {
		throw new RuntimeException("Processo não pode entrar no estado de avaliação");
		
		
	}

	@Override
	public void emAvaliacao(Processo processo) {
		processo.EstadoAtual(new EmAvaliacao());
		
	}

	@Override
	public void emRecurso(Processo processo) {
		throw new RuntimeException("Processo já em recurso");
		
		
	}

	@Override
	public void indeferido(Processo processo) {
		throw new RuntimeException("Processo não pode entrar no estado de recurso");
		
		
	}

	@Override
	public void deferido(Processo processo) {
		throw new RuntimeException("Processo não pode entrar no estado de deferido");
		
		
	}

	@Override
	public void fechado(Processo processo) {
		throw new RuntimeException("Processo não pode entrar no estado de fehcado");
		
		
	}
	

}
