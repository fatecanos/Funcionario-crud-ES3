package br.com.fatec.config.patterns;

import br.com.fatec.config.aplicacao.EntidadeDominio;

public interface ICommand {
	public void executa(EntidadeDominio e);
}
