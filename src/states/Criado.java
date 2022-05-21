package states;

import entities.Processo;

public class Criado implements EstadoProcesso{

	@Override
	public void criado(Processo processo) {
		throw new RuntimeException("Processo já criado ");
	}

	@Override
	public void emAvaliacao(Processo processo) {
		processo.EstadoAtual(new EmAvaliacao());
		
	}

	@Override
	public void emRecurso(Processo processo) {
		processo.EstadoAtual(new EmRecurso());
		
	}

	@Override
	public void indeferido(Processo processo) {
		processo.EstadoAtual(new Indeferido());
		
	}

	@Override
	public void deferido(Processo processo) {
		processo.EstadoAtual(new Deferido());
		
	}

	@Override
	public void fechado(Processo processo) {
		processo.EstadoAtual(new Fechado());
		
	}
	
	

}
