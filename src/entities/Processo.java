package entities;

import states.Criado;
import states.EstadoProcesso;

public class Processo {
	
	private EstadoProcesso estadoAtual;
	
	
	public void EstadoAtual(EstadoProcesso state) {
		this.estadoAtual = state;
	}
	
	public Processo() {
		EstadoAtual(new Criado()); 
	}
	
	public void emAvaliacao() {
		this.estadoAtual.emAvaliacao(this);
	}
	
	public void deferido() {
		this.estadoAtual .deferido(this);
	}
	
	public void indeferido() {
		this.estadoAtual .indeferido(this);
	}
	
	public void fechado() {
		this.estadoAtual.fechado(this);
	}

}
