package br.com.aula9.excecao;

public class MeuException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String smtpServer = "smtp://www.fiap.com.br";
	private String smtpPort = "22";
		

	public MeuException(String message, Exception ex) {
		super(message, ex);
		
		print();
	}
	
	public MeuException(String message, Exception ex, boolean email, boolean LogBD ) {
		super(message, ex);
		
		if (email){
			enviarEmail();	
		} 
		if (LogBD){
			logBanco();	
		}
		
		if (!email && !LogBD) {
			print();
		}
	}
	
	public void enviarEmail() {
		System.out.println("Abrindo conexao email:");
		System.out.println("email Suporte: suporte@fiap.com.br");
		System.out.println("Server: " + this.smtpServer + this.smtpPort);

		System.out.println("==== Detalhes ====");
		System.out.println(super.getMessage());
		printStackTrace();
	}

	public void logBanco() {
		System.out.println("Abrindo conexão BD");
		
		System.out.println("==== Gravando detalhes ====");
		System.out.println(super.getMessage());
		printStackTrace();
	}
	
	public void print() {
		System.out.println("==== Meu Exception ====");
		System.out.println(super.getMessage());
	}
}

