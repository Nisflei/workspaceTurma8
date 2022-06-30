package br.com.aula4.beans;

public class Veiculo {
	private String placa;
	private int portas;
	private String modelo;
	private String categoria;
	private Motor motorizacao;
	
	// Construtor
	
	public Veiculo() {}

	public Veiculo(String placa, int portas, String modelo, String categoria, Motor motorizacao) {
		super();
		this.placa = placa;
		this.portas = portas;
		this.modelo = modelo;
		this.categoria = categoria;
		this.motorizacao = motorizacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Motor getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(Motor motorizacao) {
		this.motorizacao = motorizacao;
	}
	
	// Metodo
	
	public void acelerar() {
		System.out.println("Acelerando o Carro..!!");
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", portas=" + portas + ", modelo=" + modelo + ", categoria=" + categoria
				+ ", motorizacao=" + motorizacao + "]";
	}
	
	
	
}
