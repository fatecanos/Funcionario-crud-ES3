package br.com.fatec.config.patterns;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;

public interface IFachada {
	public Resultado cadastrar(EntidadeDominio e);
	public Resultado editar(EntidadeDominio e);
	public Resultado excluir(EntidadeDominio e);
	public Resultado consultarTodos(EntidadeDominio e);
	public Resultado consultarPorId(EntidadeDominio e);
}
