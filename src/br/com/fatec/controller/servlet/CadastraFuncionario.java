package br.com.fatec.controller.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastraFuncionario")
public class CadastraFuncionario extends HttpServlet {

	private static final long serialVersionUID = -8797087192509082797L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String dtContratacaoString = request.getParameter("dt-contratacao");
		String matricula = request.getParameter("matricula");
		String regional = request.getParameter("regional");
		String setor = request.getParameter("setor");
		String cargo = request.getParameter("cargo");
		String responsavel = request.getParameter("responsavel");
	}
}