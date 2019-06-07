package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.fatec.config.aplicacao.EntidadeDominio;

@Entity
public class Setor extends EntidadeDominio{
	
	@Column(name="is_ativo",nullable=false)
	private boolean isAtivo;
	
	@Column(name="nome_setor", nullable=false)
	private String nome;
	
	@OneToOne
	private Regional regional;
	
	public Setor() {
		super();
	}
	public Setor(boolean isAtivo, String nome, Regional regional) {
		super();
		this.isAtivo = isAtivo;
		this.nome = nome;
		this.regional = regional;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Regional getRegional() {
		return regional;
	}
	public void setRegional(Regional regional) {
		this.regional = regional;
	}
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	
}
