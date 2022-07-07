package br.com.aula6.beans;

public class Medio extends Formacao {
	private String tipo;
	
	public Medio() {}

	public Medio(String descricao, int duracao, double mensalidade, int periodo, String tipo) {
		super(descricao, duracao, mensalidade, periodo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public void calculaMensalidade(double fator) {
		setMensalidade(getDuracao() * fator * 100);
	}
	
	@Override
	public void definirDuracao() {
		setDuracao(36);
	}
	
	
}
