package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cargo{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="isAtivo", nullable=false)
	private boolean isAtivo;
	
	@Column(name="nomeCargo", nullable=false)
	private String nome;
	
	@OneToOne
	private Setor setor;
	
	public Cargo() {
		super();
	}

	public Cargo(int id, boolean isAtivo, String nome, Setor setor) {
		super();
		this.id = id;
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

	public int getId() {
		return id;
	}

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
}
