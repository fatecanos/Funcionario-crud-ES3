package br.com.fatec.controller.command;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.config.patterns.Command;

public class ConsultaTodos extends Command{

	@Override
	public Resultado executa(EntidadeDominio e) {
		return fachada.consultar(e);
	}

}
