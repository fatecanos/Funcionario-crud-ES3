package br.com.fatec.config.aplicacao;

import java.util.LinkedList;
import java.util.List;

import br.com.fatec.config.patterns.ICommand;

public class Broker {
	List<ICommand> comandos = new LinkedList<>();
	private EntidadeDominio entidade;
	
	public List<ICommand> getComandos() {
		return comandos;
	}

	public void setComandos(List<ICommand> comandos) {
		this.comandos = comandos;
	}

	public EntidadeDominio getEntidade() {
		return entidade;
	}

	public void setEntidade(EntidadeDominio entidade) {
		this.entidade = entidade;
	}

	public void adicionaComando(ICommand acao) {
		this.comandos.add(acao);
	}
	
	public void executarAcoes() {
		comandos.forEach(comando -> comando.executa(entidade));
	}
}
