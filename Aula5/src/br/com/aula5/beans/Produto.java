package br.com.aula5.beans;

import br.com.aula5.interfaces.padraoCalcImposto;

public abstract class Produto implements padraoCalcImposto {
	private int id;
	private String descricao;
	private double preco;

	public Produto() {}

	public Produto(int id, String descricao, double preco) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// Metodos: 
	@Override
	public void CalcImposto() {
		// TODO Auto-generated method stub
		double valor = this.preco* 0.20;
		System.out.println("Imposto: " + valor);
	}
	
}
