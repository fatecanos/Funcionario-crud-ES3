package br.com.fatec.controller.strategy;

import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.config.patterns.IValidacaoStrategy;

public class Validate {
	
	public static Resultado valida(IValidacaoStrategy entidade) {
		if(entidade.processa() == null)
			return new Resultado(true, "Cadastro efetuado com sucesso!");
		return new Resultado(false, entidade.processa());
	}
	
}
