package br.com.fatec.controller.facade;

import java.util.List;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.config.patterns.IFachada;
import br.com.fatec.controller.strategy.Validate;
import br.com.fatec.model.dao.DaoGenerico;

public class Fachada implements IFachada{

	@Override
	public String cadastrar(EntidadeDominio e) {
		Resultado resultado = Validate.valida(e);
		if(!resultado.getStatus()) {
			return e.getClass().getSimpleName()+": "+resultado.getMensagem();
		}else {
			new DaoGenerico().salva(e);
			return e.getClass().getSimpleName()+": "+resultado.getMensagem();
		}
	}

	@Override
	public String editar(EntidadeDominio e) {
		new DaoGenerico().atualiza(e);
		return e.getClass().getSimpleName()+": Atualizado com sucesso!";
	}

	@Override
	public String excluir(EntidadeDominio e) {
		new DaoGenerico().exclui(e);
		return e.getClass().getSimpleName()+": Excluído com sucesso!";
	}

	@Override
	public <T> List<T> consultarTodos(Class<T> e) {
		return new DaoGenerico().listarTodos(e);
	}

	@Override
	public EntidadeDominio consultarPorId(EntidadeDominio e) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
