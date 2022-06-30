package implementacao;

import beans.ContaBancaria;
import util.Input;

public class ExecutarConta {

	public static void main(String[] args) {

		ContaBancaria cc = new ContaBancaria(Input.inteiro("Digite a Numero da Conta:"),
											 0,
											 Input.texto("Cliente:"),
											 Input.texto("Digite: <corrente> ou <poupanca>"));			
		
		System.out.println(cc.extrato());
		Input.mensagem(cc.extrato());
		
		Input.mensagem(cc.deposito(Input.decimal("Valor para deposito:")));
		Input.mensagem(cc.definirLimite(Input.decimal("Informe o limite")));

		Input.mensagem(cc.extrato());
		
		Input.mensagem(cc.saque(Input.decimal("Valor para saque:")));
		Input.mensagem(cc.extrato());
		
		
	}

}
