package br.com.fatec.controller.facade;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.config.patterns.IFachada;
import br.com.fatec.model.dao.DaoGenerico;

public class Fachada implements IFachada{

	@Override
	public Resultado cadastrar(EntidadeDominio e) {
		Resultado resultado = new Resultado();
		try {
			new DaoGenerico().salva(e);
			resultado.setMensagem("Cadastro de "+e.getClass().getSimpleName()+" foi Efetuado com sucesso!");
			resultado.setMotivo("Ok");
			resultado.getEntidades().add(e);
		}catch (Exception ex) {
			ex.printStackTrace();
			resultado.setMensagem("Não foi possivel cadastrar "+e.getClass().getSimpleName());
			resultado.setMotivo("Erro de implemetação");
		}
		return resultado;
	}

	@Override
	public Resultado editar(EntidadeDominio e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resultado excluir(EntidadeDominio e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resultado consultarTodos(EntidadeDominio e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resultado consultarPorId(EntidadeDominio e) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
