package demo;

import entities.Processo;

public class Demo {
	 public static void main(String[] args) {
		 Processo processo = new Processo();
		 processo.emAvaliacao();
		 processo.deferido();
		 processo.fechado();
	 }
	 
}
