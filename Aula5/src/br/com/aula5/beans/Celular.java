package br.com.aula5.beans;

public class Celular extends Produto {
	private int cameraMega;
	private int armazenamento;
	
	public Celular() {}

	public Celular(int id, String descricao, double preco, int cameraMega, int armazenamento) {
		super(id, descricao, preco);
		this.cameraMega = cameraMega;
		this.armazenamento = armazenamento;
	}

	public int getCameraMega() {
		return cameraMega;
	}

	public void setCameraMega(int cameraMega) {
		this.cameraMega = cameraMega;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

	// Metodo	
	
}
