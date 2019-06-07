package br.com.fatec.model.domain;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.fatec.config.aplicacao.EntidadeDominio;

@Entity
public class Funcionario extends EntidadeDominio{
	
	@Column(name="is_ativo", nullable=false)
	private boolean isAtivo;
	
	@Column(name="nome_funcionario", nullable=false)
	private String nome;
	
	@Column(name="data_contratacao", nullable=false)
	private LocalDate dataContratacao;
	
	private int numeroMatricula;
	
	@Column(name="cpf", nullable=false)
	private String cpf;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="data_cadastro", nullable=false)
	private LocalDate dataCadastro;
	
	@OneToOne
	private Cargo cargo;
	
	@OneToOne
	@JoinColumn(name="usuario_responsavel_cadastro")
	private Usuario usuario;

	public Funcionario() {
		super();
	}
	
	public Funcionario(boolean isAtivo, String nome, LocalDate dataContratacao, int numeroMatricula, String cpf,
			String email, CategoriaInativacao categoriaInativacao, Cargo cargo, Usuario usuario) {
		super();
		this.isAtivo = isAtivo;
		this.nome = nome;
		this.dataContratacao = dataContratacao;
		this.numeroMatricula = numeroMatricula;
		this.cpf = cpf;
		this.email = email;
		this.cargo = cargo;
		this.usuario = usuario;
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

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}
