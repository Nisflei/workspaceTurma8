package br.com.aula4.implementacao;

import br.com.aula4.beans.Banco;
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
		
		// Carregando o Banco
		
		Banco b1 = new Banco(Input.inteiro("ID Bancario:"),
							 Input.texto("Razão Social:"));

		Banco b2 = new Banco(341,"Banco Itau");

		Banco b3 = new Banco();
		b3.setIdBancario(261);
		b3.setRazaoSocial("Banco Bradesco");
		
		
		ContaBancaria cc2 = new ContaBancaria(Input.inteiro("Digite o numero conta:"),
				 							  0,
				 							  cli,
				 							  Input.texto("Informe <corrente> ou <poupanca>:"),
				 							  b1);
		
		
		Input.mensagem(cc2.extrato());
		System.out.println("Extrato:" + cc2.extrato());

	}

}
