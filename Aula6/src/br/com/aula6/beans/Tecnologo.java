package br.com.aula6.beans;

public class Tecnologo extends Formacao {
	private boolean planoEstendido;

	public Tecnologo() {}
	
	public Tecnologo(String descricao, int duracao, double mensalidade, int periodo, boolean planoEstendido) {
		super(descricao, duracao, mensalidade, periodo);
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	@Override
	public void calculaMensalidade( double fator) {
		setMensalidade(getDuracao() * fator * 200);
	}
	
	@Override
	public void definirDuracao() {
		setDuracao(24);
	}
	

	
	
}
