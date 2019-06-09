package br.com.fatec.config.aplicacao;

public class Resultado {
	private boolean status;
	private String mensagem;
	
	public Resultado() {
		super();
	}
	public Resultado(boolean status, String mensagem) {
		super();
		this.status = status;
		this.mensagem = mensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
}
