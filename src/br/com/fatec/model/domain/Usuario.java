package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.fatec.config.aplicacao.EntidadeDominio;

@Entity
public class Usuario extends EntidadeDominio{
	
	@Column(name="is_ativo", nullable=false)
	private boolean isAtivo;
	
	@Column(name="nome_usuario", nullable=false)
	private String nome;
	
	@Column(name="senha_usuario", nullable=false)
	private String senha;
	
	public Usuario() {
		super();
	}
	public Usuario(boolean isAtivo, String nome, String senha) {
		super();
		this.isAtivo = isAtivo;
		this.nome = nome;
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	
}
