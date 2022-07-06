package br.com.aula6.beans;

public class Banco {
	private int idBancario;
	private String razaoSocial;
	
	// construtores
	public Banco() {}

	public Banco(int idBancario, String razaoSocial) {
		super();
		this.idBancario = idBancario;
		this.razaoSocial = razaoSocial;
	}

	public int getIdBancario() {
		return idBancario;
	}

	public void setIdBancario(int idBancario) {
		this.idBancario = idBancario;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
}
