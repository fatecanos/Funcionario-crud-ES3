package br.com.fatec.controller.command;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.patterns.ICommand;
import br.com.fatec.controller.facade.Fachada;

public class Inativar implements ICommand{

	Fachada fachada = new Fachada();
	
	@Override
	public void executa(EntidadeDominio e) {
		e.setIsAtivo(false);
	}
	
}
