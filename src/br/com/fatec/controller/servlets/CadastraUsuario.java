package br.com.fatec.controller.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.config.aplicacao.Broker;
import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.config.patterns.IHelper;
import br.com.fatec.controller.command.Cadastrar;
import br.com.fatec.model.domain.Usuario;

/**
 * Servlet implementation class CadastraUsuario
 */
@WebServlet("/CadastraUsuario")
public class CadastraUsuario extends HttpServlet implements IHelper{
	private static final long serialVersionUID = 1L;

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		Usuario usuario = new Usuario(nome, senha);
		return usuario;
	}

	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Cadastrar cadastrar = new Cadastrar();
		Broker broker = new Broker();
		broker.setEntidade(getEntidade(request));
		broker.adicionaComando(cadastrar);
		broker.executarAcoes();
		request.getSession().setAttribute("resposta", broker.getResultado().getMensagem());
		response.sendRedirect("index.jsp");
	}
       
	

}
