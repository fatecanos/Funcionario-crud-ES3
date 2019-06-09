package br.com.fatec.controller.command;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.patterns.ICommand;
import br.com.fatec.controller.facade.Fachada;

public class Cadastrar implements ICommand{
	
	private Fachada fachada = new Fachada();
	
	@Override
	public void executa(EntidadeDominio e) {
		System.out.println(fachada.cadastrar(e));
	}
	
}
