package br.com.aula6.beans;

public class Bacharelado extends Formacao {
	private int cargaHorariaEstagio;
	private String projetoConclusao;
	
	public Bacharelado() {}

	public Bacharelado(String descricao, int duracao, double mensalidade, int periodo, int cargaHorariaEstagio,
			String projetoConclusao) {
		super(descricao, duracao, mensalidade, periodo);
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	
	@Override
	public void calculaMensalidade(double fator) {
		setMensalidade( (getDuracao() * fator * 200) + (this.cargaHorariaEstagio * 12) );
	}
	
	@Override
	public void definirDuracao() {
		if (getDescricao().equalsIgnoreCase("engenharia")) {
			setDuracao(48);
		} else {
			setDuracao(60);
		}
	}
}
