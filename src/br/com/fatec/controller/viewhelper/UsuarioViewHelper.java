package br.com.fatec.controller.viewhelper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.config.patterns.IHelper;
import br.com.fatec.model.domain.Usuario;

public class UsuarioViewHelper implements IHelper{

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		Usuario usuario = new Usuario(nome, senha);
		usuario.setIsAtivo(true);
		return usuario;
	}

	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("resultado", resultado.getMensagem() + ": "+ resultado.getMotivo());
		response.sendRedirect("index.jsp?resultado="+resultado.getMensagem()+": "+resultado.getMotivo());
	}
	
}	
