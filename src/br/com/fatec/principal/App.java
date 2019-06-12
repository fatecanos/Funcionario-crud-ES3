package br.com.fatec.principal;

import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.model.dao.DaoGenerico;
import br.com.fatec.model.domain.Usuario;

public class App {

	public static void main(String[] args){
		Resultado resultado = new DaoGenerico().buscarPorId(1, Usuario.class);
		System.out.println(resultado.getMensagem());
		Usuario u = (Usuario)resultado.getEntidade();
		System.out.println(u.getNome()+" "+u.getSenha());
	}

}
