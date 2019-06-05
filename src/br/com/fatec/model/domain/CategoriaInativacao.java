package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CategoriaInativacao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="descricao", nullable=false)
	private String 	descricao;
	
	@OneToOne
	private Entity entidade;
	
	public CategoriaInativacao() {
		
	}
	
	public CategoriaInativacao(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	
	
	
}
