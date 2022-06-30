package br.com.aula3.beans;

public class Produto {
	private String nome;
	private String marca;
	private double valor;
	private boolean promocao;
	
	//Construtores
	
	public Produto() {}
	
	public Produto(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
	}
	public Produto(String nome, String marca, double valor) {
		this.nome = nome;
		this.marca = marca;
		this.valor =valor;
	}
	
	public Produto(String nome, String marca, double valor, boolean promocao) {
		this.nome = nome;
		this.marca = marca;
		this.valor =valor;
		this.promocao = promocao;
	}
	


	
	
	// getters + setters 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isPromocao() {
		return promocao;
	}
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	
	
	//Medoto
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", marca=" + marca + ", valor=" + valor + ", promocao=" + promocao + "]";
	}

	
	
}
