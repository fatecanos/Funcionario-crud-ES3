package br.com.fatec.controller.command;

import java.util.List;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.patterns.ICommand;
import br.com.fatec.controller.facade.Fachada;

public class ConsultaTodos implements ICommand{

	private Fachada fachada = new Fachada();
	private List<EntidadeDominio> entidades;
	
	@Override
	public void executa(EntidadeDominio e) {
		this.fachada.consultarTodos(e.getClass());
		System.out.println("Consulta de "+e.getClass().getSimpleName()+" efeftuada com sucesso!");
	}

	public List<EntidadeDominio> getEntidades() {
		return entidades;
	}

	public void setEntidades(List<EntidadeDominio> entidades) {
		this.entidades = entidades;
	}
	
}
