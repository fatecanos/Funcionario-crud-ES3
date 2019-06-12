package br.com.fatec.config.aplicacao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Resultado {
	private String mensagem;
	private String motivo;
	private Boolean status;
	private EntidadeDominio entidade;
}
