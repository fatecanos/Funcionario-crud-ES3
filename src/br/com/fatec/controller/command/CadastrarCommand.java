package br.com.fatec.controller.command;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;

public class CadastrarCommand extends Comand{

	@Override
	public Resultado executa(EntidadeDominio e) {
		return fachada.cadastrar(e);
	}
	
}
