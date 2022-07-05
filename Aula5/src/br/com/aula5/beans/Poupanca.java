package br.com.aula5.beans;

public class Poupanca extends ContaBancaria {

	private double rendimento;

	// construtor
	public Poupanca(int conta,  Cliente cliente, Banco banco, double rendimento) {
		super(conta, cliente, banco);
		this.rendimento = rendimento;
	}
	
	// getter + setter

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	 
	//metodos
	
	//Deposito: OK herança
	
	//Saque: OK herança
	
	public String creditarRendimentos() {
		double valor = (this.rendimento/100) * 	super.saldo;
		super.saldo = super.saldo + valor;
		return "Rendimento: "+ valor; 
	}
}
