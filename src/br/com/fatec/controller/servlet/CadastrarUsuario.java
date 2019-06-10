package br.com.fatec.controller.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.config.aplicacao.Broker;
import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.patterns.IHelper;
import br.com.fatec.controller.command.Cadastrar;
import br.com.fatec.model.domain.Usuario;

/**
 * Servlet implementation class CadastrarUsuario
 */
@WebServlet("/CadastrarUsuario")
public class CadastrarUsuario extends HttpServlet implements IHelper{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String senha = req.getParameter("senha");
		
		Usuario usuario = new Usuario(nome, senha);
		
		Cadastrar cad = new Cadastrar();
		
		/*Broker broker = new Broker();
		broker.setEntidade(usuario);
		broker.adicionaComando(cad);
		broker.executarAcoes();*/
		cad.executa(usuario);
		
		req.getSession().setAttribute("resultado", cad.getMensagem());
		res.sendRedirect("index.jsp");
		
		
		/*setView(getEntidade(req), req, res);
		PrintWriter out = res.getWriter();
		out.println("<h1><%+=resposta%></h1>");*/
	}
	
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		
		Usuario usuario = new Usuario(nome, senha);
		return usuario;
	}

	@Override
	public void setView(EntidadeDominio entidadeDominio, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Usuario usuario = (Usuario) entidadeDominio;
		Cadastrar cad = new Cadastrar();
		
		Broker broker = new Broker();
		broker.setEntidade(usuario);
		broker.adicionaComando(cad);
		broker.executarAcoes();
		
		request.getSession().setAttribute("resultado", cad.getMensagem());
		response.sendRedirect("index.jsp");
	}
       
	

}
