package br.com.aula5.beans;

public class ContaCorrente extends ContaBancaria{
	private double limiteEspecial;
	private double taxa;
	
	// construtor
	public ContaCorrente(int conta, Cliente cliente, Banco banco, double limiteEspecial, double taxa) {
		super(conta, cliente, banco);
		this.limiteEspecial = limiteEspecial;
		this.taxa = taxa;
	}

	// getters + setter 

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
	// metodos
	
	//Deposito: OK herança
	
	@Override
	public String saque(double valor) {
		if (super.saldo + this.limiteEspecial  < valor) {
            return "Não é possível sacar esse valor, saldo insuficiente";
        } else {
            super.saldo = super.saldo - valor;
            return "Sucesso no saque";
        }
	}
	
	public String definirLimite(double valor) {
		this.limiteEspecial = valor;
		return "Sucesso no novo limite";
	}
	
}
