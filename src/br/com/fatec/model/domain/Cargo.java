package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Cargo extends EntidadeDominio{
	
	@Column(name="isAtivo", nullable=false)
	private boolean isAtivo;
	
	@Column(name="nomeCargo", nullable=false)
	private String nome;
	
	@OneToOne
	private Setor setor;

	@Override
	public Resultado processa() {
		return new Resultado("Pode salvar", "ok", true, null);
	}
	
}
