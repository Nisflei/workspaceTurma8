package br.com.aula9.beans;

public class ContaCorrente {
	
	private double saldo;

	public ContaCorrente(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String sacar(double valor) {
		return "OK!";
	}
	
	public String deposito(double valor) throws Exception {
		if (valor > 1000) {
			throw new Exception("Não é permitido valores acima de R$ 1000.00");
		}
		this.saldo = this.saldo + valor;
		return "Sucesso no depósito";
	} 
	
}
