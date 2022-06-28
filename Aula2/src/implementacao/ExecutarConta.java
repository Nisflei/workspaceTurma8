package implementacao;

import beans.ContaBancaria;

public class ExecutarConta {

	public static void main(String[] args) {
		
		System.out.println("Iniciando..!!");
		System.out.println(" ");
		
		ContaBancaria cc = new ContaBancaria();
		
		cc.setConta(10101);
		cc.setSaldo(500);
		System.out.println("Inicial Saldo:" + cc.getSaldo());
		
		System.out.println("Saque executado: " +  cc.saque(900));
		
		
		System.out.println("Saldo:" + cc.getSaldo());
		
		System.out.println("Extrato: " + cc.extrato());
		
	}

}
