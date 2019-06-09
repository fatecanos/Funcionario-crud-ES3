package br.com.fatec.model.domain;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Funcionario extends EntidadeDominio{
	
	@Column(name="nome_funcionario", nullable=false)
	private String nome;
	
	@Column(name="data_contratacao", nullable=false)
	private LocalDate dataContratacao;
	
	@Column(name="numeroMatricula", nullable=false)
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
	
	@Override
	public String processa() {
		/*if(this.nome.equals(null) || this.nome.equals("")
		|| this.isAtivo.equals(null)
		|| this.cargo.equals(null)
		|| this.cpf.equals(null) || this.cpf.equals("")
		|| this.dataCadastro.equals(null)
		|| this.dataContratacao.equals(null)
		|| this.email.equals(null)
		|| this.numeroMatricula == -1
		|| this.usuario.equals(null)
		) {
			return "Campo vazio";
		}else if() {
			
		}*/
		return null;
	}
	
}
