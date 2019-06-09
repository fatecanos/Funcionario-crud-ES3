package br.com.fatec.config.patterns;

import java.util.List;

import br.com.fatec.config.aplicacao.EntidadeDominio;

public interface IFachada {
	public String cadastrar(EntidadeDominio e);
	public String editar(EntidadeDominio e);
	public String excluir(EntidadeDominio e);
	public <T> List<T> consultarTodos(Class<T> e);
	public EntidadeDominio consultarPorId(EntidadeDominio e);
}
