package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.fatec.config.aplicacao.EntidadeDominio;

@Entity
public class Regional extends EntidadeDominio{
	
	@Column(name="is_ativo", nullable=false)
	private boolean isAtivo;
	
	@Column(nullable=false)
	private String nome;
	
	public Regional() {
		super();
	}
	public Regional(boolean isAtivo, String nome) {
		super();
		this.isAtivo = isAtivo;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	
}
