package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="is_ativo", nullable=false)
	private boolean isAtivo;
	
	@Column(name="nome_usuario", nullable=false)
	private String nome;
	
	@Column(name="senha_usuario", nullable=false)
	private String senha;
	
	public Usuario() {
		super();
	}
	public Usuario(int id, boolean isAtivo, String nome, String senha) {
		super();
		this.id = id;
		this.isAtivo = isAtivo;
		this.nome = nome;
		this.senha = senha;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	
}
