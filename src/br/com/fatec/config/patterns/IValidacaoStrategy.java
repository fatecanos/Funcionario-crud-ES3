package br.com.fatec.config.patterns;

import br.com.fatec.config.aplicacao.EntidadeDominio;

public interface IValidacaoStrategy {
		
	public String processa(EntidadeDominio e);
	
}
