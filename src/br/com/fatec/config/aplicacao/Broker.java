package br.com.fatec.config.aplicacao;

import java.util.LinkedList;
import java.util.List;

import br.com.fatec.config.patterns.ICommand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Broker {
	List<ICommand> comandos;
	private EntidadeDominio entidade;
	
	public Broker() {
		this.comandos = new LinkedList<>();
	}

	public void adicionaComando(ICommand acao) {
		this.comandos.add(acao);
	}
	
	public void executarAcoes() {
		for(ICommand comando : comandos) {
			comando.executa(entidade);
		}
		
	}
}
