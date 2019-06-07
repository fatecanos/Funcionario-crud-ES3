package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.fatec.config.aplicacao.EntidadeDominio;

@Entity
public class Cargo extends EntidadeDominio{
	
	@Column(name="isAtivo", nullable=false)
	private boolean isAtivo;
	
	@Column(name="nomeCargo", nullable=false)
	private String nome;
	
	@OneToOne
	private Setor setor;
	
	public Cargo() {
		super();
	}

	public Cargo(boolean isAtivo, String nome, Setor setor) {
		super();
		this.isAtivo = isAtivo;
		this.nome = nome;
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
}
