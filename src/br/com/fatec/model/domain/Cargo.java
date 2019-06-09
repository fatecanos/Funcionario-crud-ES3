package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
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

	@Override
	public String processa() {
		// TODO Auto-generated method stub
		return null;
	}



	
}
