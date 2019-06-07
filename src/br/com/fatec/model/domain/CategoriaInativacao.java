package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.fatec.config.aplicacao.EntidadeDominio;

@Entity
public class CategoriaInativacao extends EntidadeDominio{
	
	@Column(name="descricao", nullable=false)
	private String 	descricao;
	
	@OneToOne
	private Entity entidade;
	
	public CategoriaInativacao() {
		
	}
	
	public CategoriaInativacao(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
