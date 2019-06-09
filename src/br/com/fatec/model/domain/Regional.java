package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Regional extends EntidadeDominio{
	
	@Column(name="is_ativo", nullable=false)
	private boolean isAtivo;
	
	@Column(nullable=false)
	private String nome;
	
	public Regional() {
		super();
	}
	public Regional(boolean isAtivo, String nome) {
		super();
		this.isAtivo = isAtivo;
		this.nome = nome;
	}
	
	@Override
	public String processa() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
