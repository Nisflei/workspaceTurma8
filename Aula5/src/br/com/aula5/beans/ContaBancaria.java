package br.com.aula5.beans;

import java.util.Optional;

public class ContaBancaria {
	private int conta;
	protected double saldo;
	private Cliente cliente;
	private Banco banco;
	
	// Construtores
		
	public ContaBancaria(int conta, Cliente cliente, Banco banco) {
		super();
		this.conta = conta;
		this.cliente = cliente;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	
	// Metodos
	
	public String saque(double valor) {
		if (this.saldo  < valor) {
            return "Não é possível sacar esse valor, saldo insuficiente";
        } else {
            this.saldo = this.saldo - valor;
            return "Sucesso no saque";
        }

	}


	public String deposito(double valor) {
		  this.saldo = this.saldo + valor;
	      return "Sucesso no depósito";
	}

	public String extrato() {
		return 	"ContaBancaria [Banco=" +  banco.getRazaoSocial()  + ",[conta=" + conta + ", saldo=" + saldo + ", cliente=" + cliente.getNome(); 

		/// Missão:
		/* 
		 * 
		 * Como resolver o EXTRATO para ter dados de CC e PP  ???
		 * 
		 */
		
		/*		if (this.banco == null) 
			return "ContaBancaria [conta=" + conta + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + ", limiteEspecial="
					+ limiteEspecial + ", tipoConta=" + tipoConta + "]";
		else
			return "ContaBancaria [Banco=" +  banco.getRazaoSocial()  + ", conta=" + conta + ", saldo=" + saldo + ", cliente=" + cliente.getNome() + ", limiteEspecial="
			+ limiteEspecial + ", tipoConta=" + tipoConta + "]";
	*/
	}

	
	
	
	
}
