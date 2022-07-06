package br.com.aula6.beans;

public class ContaPoupanca extends ContaBancaria {

	private double rendimento;

	// construtor
	public ContaPoupanca(int conta,  Cliente cliente, Banco banco, double rendimento) {
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

	@Override
	public String extrato() {
		String extratoBancario = super.extrato();
		return extratoBancario + ", rendimento=" + this.rendimento + "]";
	}
	
	
}
