package br.com.fatec.controller.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.config.patterns.Command;
import br.com.fatec.config.patterns.IHelper;
import br.com.fatec.controller.command.Ativar;
import br.com.fatec.controller.command.Atualizar;
import br.com.fatec.controller.command.Cadastrar;
import br.com.fatec.controller.command.ConsultaTodos;
import br.com.fatec.controller.command.Excluir;
import br.com.fatec.controller.command.Inativar;
import br.com.fatec.controller.viewhelper.FuncionarioViewHelper;
import br.com.fatec.controller.viewhelper.UsuarioViewHelper;


@WebServlet("/Servico")
public class Servico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static HashMap<String, Command> comandos;
	private static HashMap<String, IHelper> viewHelpers;
	
    public Servico() {
        comandos = new HashMap<>();
        comandos.put("salvar", new Cadastrar());
        comandos.put("atualizar", new Atualizar());
        comandos.put("excluir", new Excluir());
        comandos.put("consultarTodos", new ConsultaTodos());
        comandos.put("inativar", new Inativar());
        comandos.put("ativar", new Ativar());
        
        viewHelpers = new HashMap<>();
        viewHelpers.put("/Funcionario-crud-ES3/Servico/CadastrarUsuario", new UsuarioViewHelper());
        viewHelpers.put("/Funcionario-crud-ES3/Servico/CadastrarFuncionario", new FuncionarioViewHelper());
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
												throws ServletException, IOException {
		doProcessRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
												throws ServletException, IOException {
		doProcessRequest(request, response);
	}

	protected void doProcessRequest(HttpServletRequest request, HttpServletResponse response)
														throws ServletException, IOException {

		String uri = request.getRequestURI();
		String metodo = request.getParameter("metodo");
		String operacao = request.getParameter("operacao");
	
		IHelper vh = viewHelpers.get(uri+metodo);
		EntidadeDominio entidade =  vh.getEntidade(request);
		
		PrintWriter out = response.getWriter();
		
		out.println("Classe encontrada: "+ entidade.getClass().getSimpleName());
		out.println("Metodo solicitado:" + metodo);
		out.println("Operacao solicitada: "+operacao);
		out.println("URI:"+ uri+metodo);
		
		Command command = comandos.get("salvar");
		Resultado resultado = command.executa(entidade);
		out.println("Mensagem: "+resultado.getMensagem() + ": "+ resultado.getMotivo());
		
		//vh.setView(resultado, request, response);
		
	}
	
}
