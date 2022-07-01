package br.com.aula4.beans;

import java.util.Optional;

public class ContaBancaria {
	private int conta;
	private double saldo;
	private Cliente cliente;
	private Banco banco;
	private double limiteEspecial;
	private String tipoConta;
	
	// Construtores
	
	public ContaBancaria() {}

	public ContaBancaria(int conta, double saldo, Cliente cliente, String tipoConta) {
		super();
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.tipoConta = tipoConta;
	}
	
	public ContaBancaria(int conta, double saldo, Cliente cliente, String tipoConta, Banco banco) {
		super();
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.tipoConta = tipoConta;
		this.banco = banco;				
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
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
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
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
		if (this.banco == null) 
			return "ContaBancaria [conta=" + conta + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + ", limiteEspecial="
					+ limiteEspecial + ", tipoConta=" + tipoConta + "]";
		else
			return "ContaBancaria [Banco=" +  banco.getRazaoSocial()  + ", conta=" + conta + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + ", limiteEspecial="
			+ limiteEspecial + ", tipoConta=" + tipoConta + "]";
	}

	
	
	
	
}
