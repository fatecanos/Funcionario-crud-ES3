package br.com.fatec.model.domain;

import java.time.LocalDate;

public class Funcionario {
	private int id;
	private String nome;
	private LocalDate dataContratacao;
	private int numeroMatricula;
	private String cpf;
	private String email;
	private CategoriaInativacao categoriaInativacao;
	private Cargo cargo;
	private Usuario usuario;
	
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
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CategoriaInativacao getCategoriaInativacao() {
		return categoriaInativacao;
	}
	public void setCategoriaInativacao(CategoriaInativacao categoriaInativacao) {
		this.categoriaInativacao = categoriaInativacao;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
