package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class CategoriaInativacao extends EntidadeDominio{
	
	@Column(name="descricao", nullable=false)
	private String 	descricao;
	
	@OneToOne
	private EntidadeDominio entidade;
	
	public CategoriaInativacao() {}
	
	public CategoriaInativacao(String descricao) {
		super();
		this.descricao = descricao;
	}

	@Override
	public String processa() {
		// TODO Auto-generated method stub
		return null;
	}

}
