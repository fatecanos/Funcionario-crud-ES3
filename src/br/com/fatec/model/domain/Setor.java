package br.com.fatec.model.domain;

public class Setor {
	private int id;
	private String nome;
	private Regional regional;
	
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
	public Regional getRegional() {
		return regional;
	}
	public void setRegional(Regional regional) {
		this.regional = regional;
	}
	
	
}
