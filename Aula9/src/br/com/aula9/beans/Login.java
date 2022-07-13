package br.com.aula9.beans;

public class Login {

		private String usuario;
		private String senha;
		
		// constante para acesso
		
		private String userAcesso = "admin";
		private String userPwd = "admin";
		
		// construtores 
		
		public Login() {}

		public Login(String usuario, String senha) {
			super();
			this.usuario = usuario;
			this.senha = senha;
		}
		// getter + setter 

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		
		// metodos 
		
		public boolean fazerLogin( String usuario, String senha) {
			
			// sem usar Try Catch
			
			/*
			if (this.userAcesso.equalsIgnoreCase(usuario) && this.userPwd.equalsIgnoreCase(senha)) 
				return true;
			else
				return false;	
			*/
			
			try {
				if (this.userAcesso.equalsIgnoreCase(usuario) && this.userPwd.equalsIgnoreCase(senha)) {
					return true;
				}
				throw new Exception("LOG: Usuario/Senha Invalidados..!! " + usuario); 	
				
			} catch (Exception e) {
				// Tratamento
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
				e.printStackTrace();
			}
			return false;
		}
}
