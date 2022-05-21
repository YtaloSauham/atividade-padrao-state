package states;

import entities.Processo;

public class Fechado implements EstadoProcesso{

	
	@Override
	public void criado(Processo processo) {
		throw new RuntimeException("Processo não pode entrar nesse estado");
		
	}

	@Override
	public void emAvaliacao(Processo processo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Processo não pode entrar nesse estado");
	}

	@Override
	public void emRecurso(Processo processo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Processo não pode entrar nesse estado");
	}

	@Override
	public void indeferido(Processo processo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Processo não pode entrar nesse estado");
	}

	@Override
	public void deferido(Processo processo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Processo não pode entrar nesse estado");
	}

	@Override
	public void fechado(Processo processo) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Processo já nesse estado" );
	}
	 

}
