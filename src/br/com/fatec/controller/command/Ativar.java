package br.com.fatec.controller.command;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.patterns.ICommand;

public class Ativar implements ICommand{

	@Override
	public void executa(EntidadeDominio e) {
		e.setIsAtivo(true);
	}

}
