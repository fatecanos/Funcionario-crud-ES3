	package br.com.fatec.controller.facade;

import java.util.List;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.config.patterns.IFachada;
import br.com.fatec.controller.strategy.Validate;
import br.com.fatec.model.dao.DaoGenerico;
import br.com.fatec.model.domain.CategoriaInativacao;

public class Fachada implements IFachada{
	
	DaoGenerico dao = new DaoGenerico();
	
	@Override
	public Resultado cadastrar(EntidadeDominio e) {
		Resultado resultadoValidacao = Validate.valida(e);
		if(resultadoValidacao.getStatus()) {
			try {
				dao.salva(e);
				return new Resultado("Cadastro efetuado com sucesso", "ok", true);
			}catch (Exception excessao) {
				return new Resultado("Erro ao cadastrar", "erro de persistencia", false);
			}
		}else {
			return resultadoValidacao;
		}
	}

	@Override
	public Resultado editar(EntidadeDominio e) {
		try {
			new DaoGenerico().atualiza(e);
			return new Resultado("Atualização efetuada com sucesso", "ok", true);
		}catch(Exception ex) {
			ex.printStackTrace();
			return new Resultado("Erro ao atualizar", "erro no banco de dados", false);
		}
	}

	@Override
	public Resultado excluir(EntidadeDominio e) {
		try {
			new DaoGenerico().exclui(e);
			return new Resultado("Exclusão efetuada com sucesso", "ok", true);
		}catch(Exception ex) {
			ex.printStackTrace();
			return new Resultado("Erro ao excluir", "erro no banco de dados", false);
		}
	}

	@Override
	public <T> List<T> consultarTodos(Class<T> e) {
		return new DaoGenerico().listarTodos(e);
	}

	@Override
	public Resultado inativar(EntidadeDominio e, CategoriaInativacao categoriaInativacao) {
		e.setIsAtivo(false);
		return cadastrar(categoriaInativacao);
	}

	@Override
	public Resultado ativar(EntidadeDominio e, CategoriaInativacao catInativacao) {
		e.setIsAtivo(true);
		return excluir(catInativacao);
	}

	

	
	

}
