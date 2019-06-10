package br.com.fatec.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.aplicacao.Resultado;
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
	public Resultado processa() {
		Resultado resultado = new Resultado();
		if(this.nome.equals("") || this.nome.equals(null)||
				this.senha.equals("") || this.senha.equals(null)) {
			resultado.setMensagem("Campos inválidos");
			resultado.setMotivo("Campo vazio");
			resultado.setStatus(false);
		}else if(this.senha.length() < 8){
			resultado.setMensagem("Campos inválidos");
			resultado.setMotivo("Senha muito curta");
			resultado.setStatus(false);
		}else {
			resultado.setMensagem("Usuario é válido");
			resultado.setMotivo("campos preenchidos corretamente");
			resultado.setStatus(true);
		}
		return resultado;
	}
	
}
