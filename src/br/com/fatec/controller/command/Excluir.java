package br.com.fatec.controller.command;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.patterns.ICommand;
import br.com.fatec.controller.facade.Fachada;

public class Excluir implements ICommand{

	private Fachada fachada;
	
	@Override
	public void executa(EntidadeDominio e) {
		this.fachada = new Fachada();
		System.out.println(this.fachada.excluir(e));
	}
	
}
