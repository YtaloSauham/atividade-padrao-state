package states;

import entities.Processo;

public class EmAvaliacao implements EstadoProcesso  {
	
	public void notificarAvaliacao(String mensagem) {
		System.out.println(mensagem);
	}
	@Override
	public void criado(Processo processo) {
		throw new RuntimeException("Processo j� criado");
		
	}

	@Override
	public void emAvaliacao(Processo processo) {
		throw new RuntimeException("Processo j� em avalia��o");
		
	}

	@Override
	public void emRecurso(Processo processo) {
		throw new RuntimeException("Processo n�o pode entrar em recurso no estado de avalia��o");
		
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
