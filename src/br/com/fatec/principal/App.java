package br.com.fatec.principal;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.controller.command.Cadastrar;
import br.com.fatec.controller.command.ConsultarTodos;
import br.com.fatec.model.dao.DaoGenerico;
import br.com.fatec.model.domain.Regional;

public class App {

	public static void main(String[] args){
		ConsultarTodos consulta = new ConsultarTodos();
		consulta.executa(new Regional());
	}

}
