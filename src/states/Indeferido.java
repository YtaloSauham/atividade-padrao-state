package states;

import entities.Processo;

public class Indeferido implements EstadoProcesso {

	@Override
	public void criado(Processo processo) {
		
		
	}

	@Override
	public void emAvaliacao(Processo processo) {
		throw new RuntimeException("Processo não pode entrar no estado de avaliação");
		
	}

	@Override
	public void emRecurso(Processo processo) {
		processo.EstadoAtual(new EmRecurso());
		
	}

	@Override
	public void indeferido(Processo processo) {
		throw new RuntimeException("Processo já indeferido");
		
		
	}

	@Override
	public void deferido(Processo processo) {
		throw new RuntimeException("Processo não pode entrar no estado de deferido");
		
		
	}

	@Override
	public void fechado(Processo processo) {
		// TODO Auto-generated method stub
		
	}
	

}
