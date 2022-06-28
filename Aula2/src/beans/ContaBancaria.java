package beans;

public class ContaBancaria {
	private double saldo;
	private int conta;
	
	// Getters + Setters
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	// Operações / Métodos
	
	public String saque(double valor) {
		this.saldo = this.saldo - valor;
		return "Sucesso";
	}
	
	public String deposito(double valor) {
		this.saldo = this.saldo + valor;
		return "Sucesso";
	}
	
	public String extrato() {
		return "cc: "+ this.conta + " \\ Saldo: " + this.saldo;
	}
	
	
}
