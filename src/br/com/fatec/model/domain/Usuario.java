package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Usuario extends EntidadeDominio{
	
	@Column(name="nome_usuario", nullable=false)
	private String nome;
	
	@Column(name="senha_usuario", nullable=false)
	private String senha;

	@Override
	public String processa() {
		if(this.nome.equals("") || this.nome.equals(null)||
				this.senha.equals("") || this.senha.equals(null)) {
			return "Campo vazio";
		}else if(this.senha.length() < 8){
			return "Senha muito curta";
		}else {
			return null;
		}
	}
	
}
