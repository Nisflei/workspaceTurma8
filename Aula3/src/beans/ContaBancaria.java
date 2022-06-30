package beans;

public class ContaBancaria {
	private int conta;
	private double saldo;
	private String cliente;
	private double limiteEspecial;
	private String tipoConta;
	
	// Construtores
	
	public ContaBancaria() {}

	public ContaBancaria(int conta, double saldo, String cliente, String tipoConta) {
		super();
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.tipoConta = tipoConta;
	}

	// Getters + Setters 

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	// Metodos
	
	public String saque(double valor) {
        if ((this.saldo + this.limiteEspecial) < valor) {
            return "Não é possível sacar esse valor, saldo insuficiente";
        } else {
            this.saldo = this.saldo - valor;
            return "Sucesso no saque";
        }
	}

	public String definirLimite(double valor) {
		if (this.tipoConta.equals("corrente")) {
			this.limiteEspecial = valor;
			return "Sucesso no novo limite";
		} else
			return "Tipo de conta Invalida";
	}
	
	public String deposito(double valor) {
		  this.saldo = this.saldo + valor;
	      return "Sucesso no depósito";
	}

	public String extrato() {
		return "ContaBancaria [conta=" + conta + ", saldo=" + saldo + ", cliente=" + cliente + ", limiteEspecial="
				+ limiteEspecial + ", tipoConta=" + tipoConta + "]";
	}

	
	
	
	
}
