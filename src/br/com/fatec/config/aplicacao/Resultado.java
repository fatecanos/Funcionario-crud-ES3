package br.com.fatec.config.aplicacao;

import java.util.LinkedList;
import java.util.List;

public class Resultado {
	private String motivo;
	private String mensagem;
	private List<EntidadeDominio> entidades = new LinkedList<>();
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public List<EntidadeDominio> getEntidades() {
		return entidades;
	}
	public void setEntidades(List<EntidadeDominio> entidades) {
		this.entidades = entidades;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
}
