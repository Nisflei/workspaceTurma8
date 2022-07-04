package br.com.aula5.beans;

public abstract class Produto {
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
	public void ImpostoProd() {
		double valor = this.preco * 0.10;
		System.out.println("Imposto: " + valor);
	}
	
}
