package br.com.aula6.implementacao;

import br.com.aula6.beans.Banco;
import br.com.aula6.beans.Cliente;
import br.com.aula6.beans.ContaBancaria;
import br.com.aula6.beans.ContaCorrente;
import br.com.aula6.beans.ContaPoupanca;
import br.com.aula6.util.Input;

public class ExecutarConta {

	public static void main(String[] args) {
		
		Banco bb = new Banco(Input.inteiro("IdBancario:"), 
							 Input.texto("Razão Social:"));
		
		
		Cliente cli = new Cliente(Input.texto("Cliente Nome:"), 
								  Input.texto("CPF:"), 
								  Input.texto("Fone:"));
		
		
		/*
		
		ContaBancaria cb = new ContaBancaria(1010, cli, bb);
		System.out.println(cb.extrato());
		*/
		
		ContaCorrente cc = new ContaCorrente(1010, cli, bb,0,0);
		Input.mensagem("Deposito cc (1000):" + cc.deposito(1000));
		Input.mensagem("Saque cc (1100): " + cc.saque(1100));
		Input.mensagem("Novo Limite (500): " + cc.definirLimite(500));
		Input.mensagem("Novo Saque cc (1100):  " + cc.saque(1100));

		System.out.println(cc.extrato());
		
		ContaPoupanca pp = new ContaPoupanca(101020, cli, bb, 10);
		Input.mensagem("Deposito pp:" + pp.deposito(5000));
		Input.mensagem("Rendimento pp (10%):" + pp.creditarRendimentos());
		Input.mensagem("Saque pp: " + pp.saque(1100));
		System.out.println(pp.extrato());
		
	}

}
