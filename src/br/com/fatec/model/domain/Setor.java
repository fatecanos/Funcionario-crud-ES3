package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Setor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="is_ativo",nullable=false)
	private boolean isAtivo;
	
	@Column(name="nome_setor", nullable=false)
	private String nome;
	
	@OneToOne
	private Regional regional;
	
	public Setor() {
		super();
	}
	public Setor(int id, boolean isAtivo, String nome, Regional regional) {
		super();
		this.id = id;
		this.isAtivo = isAtivo;
		this.nome = nome;
		this.regional = regional;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
