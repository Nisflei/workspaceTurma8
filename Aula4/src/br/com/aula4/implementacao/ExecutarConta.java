package br.com.aula4.implementacao;

import br.com.aula4.beans.Cliente;
import br.com.aula4.beans.ContaBancaria;
import br.com.aula4.util.Input;

public class ExecutarConta {

	public static void main(String[] args) {

		Cliente cli = new Cliente(Input.texto("Digite o nome:"),
								  Input.texto("Digite o CPF:"),
								  Input.texto("Qual o fone: "));
		
		ContaBancaria cc = new ContaBancaria(Input.inteiro("Digite o numero conta:"),
											 0,
											 cli,
											 Input.texto("Informe <corrente> ou <poupanca>:"));
	
		Input.mensagem(cc.extrato());
		
		System.out.println("Extrato:" + cc.extrato());
		
		cli.setNome("Ana Maria Braga");
		System.out.println("Obj Cliente: " + cli.getNome());
		
		System.out.println("Extrato:" + cc.extrato());

		System.out.println("Obj Conta:" + cc.getCliente().getNome());

	}

}
