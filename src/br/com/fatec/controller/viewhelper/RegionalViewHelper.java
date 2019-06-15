package br.com.fatec.controller.viewhelper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
import br.com.fatec.config.patterns.IHelper;
import br.com.fatec.model.domain.Regional;

public class RegionalViewHelper implements IHelper {

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		Regional regional = new Regional();
		return regional;
	}

	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("listaRegionais", resultado.getLista());
		response.sendRedirect("cadastro-funcionario.jsp");
	}

}
