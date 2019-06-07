package br.com.fatec.controller.strategy;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.patterns.IValidacaoStrategy;

public class ValidarCpf implements IValidacaoStrategy{
	
	private String cpf;
		
	public ValidarCpf(String cpf) {
		super();
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String processa(EntidadeDominio e) {
		// TODO Auto-generated method stub
		return null;
	}

}
