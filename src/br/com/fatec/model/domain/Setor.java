package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
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

	@Override
	public String processa() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
