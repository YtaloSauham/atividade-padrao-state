package states;

import entities.Processo;

public class EmAvaliacao implements EstadoProcesso  {
	
	public void notificarAvaliacao(String mensagem) {
		System.out.println(mensagem);
	}
	@Override
	public void criado(Processo processo) {
		throw new RuntimeException("Processo já criado");
		
	}

	@Override
	public void emAvaliacao(Processo processo) {
		throw new RuntimeException("Processo já em avaliação");
		
	}

	@Override
	public void emRecurso(Processo processo) {
		throw new RuntimeException("Processo não pode entrar em recurso no estado de avaliação");
		
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
		// TODO Auto-generated method stub
		
	}
	
	
	

}
