package implementacao;

import beans.Pessoa;

public class ExecutarPessoa {

	public static void main(String[] args) {

		System.out.println("Iniciando..!!!");
		System.out.println(" ");
		
		Pessoa cliente1 = new Pessoa();
		
		cliente1.setNome("Ana Maria");   
		cliente1.setIdade(30);
		cliente1.setSentimento("Não Sei");
		
		
		System.out.println("Cliente: " + cliente1.getNome());
		System.out.println("Idade:" + cliente1.getIdade());
		System.out.println("Sentimento: " + cliente1.getSentimento() );
		cliente1.comer("Feijoada");
		cliente1.dormir(10);
		System.out.println("Sentimento: " + cliente1.getSentimento() );
		
		
		
		System.out.println(" ");
		System.out.println("Terminou..!!");
	}

}
