package br.com.fatec.controller.command;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.patterns.ICommand;
import br.com.fatec.controller.facade.Fachada;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cadastrar implements ICommand{
	
	private Fachada fachada = new Fachada();
	private String mensagem;
	
	@Override
	public void executa(EntidadeDominio e) {
		mensagem = fachada.cadastrar(e);
	}
	
}
