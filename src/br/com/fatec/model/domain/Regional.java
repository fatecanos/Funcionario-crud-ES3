package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Regional {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="is_ativo", nullable=false)
	private boolean isAtivo;
	
	@Column(nullable=false)
	private String nome;
	
	public Regional() {
		super();
	}
	public Regional(int id, boolean isAtivo, String nome) {
		super();
		this.id = id;
		this.isAtivo = isAtivo;
		this.nome = nome;
	}
	public int getId() {
		return id;
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
