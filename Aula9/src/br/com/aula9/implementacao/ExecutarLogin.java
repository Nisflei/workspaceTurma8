package br.com.aula9.implementacao;

import javax.swing.JOptionPane;

import br.com.aula9.beans.Login;

public class ExecutarLogin {

	public static void main(String[] args) {
		
		String usuario = JOptionPane.showInputDialog("Digite o usuario");
		String senha = JOptionPane.showInputDialog("Senha de Acesso");
		
		Login lg = new Login();
		
		if (lg.fazerLogin(usuario, senha))
			JOptionPane.showMessageDialog(null,"Credenciais Aceitas.....");
		else
			JOptionPane.showMessageDialog(null,"Credenciais Invalidas.....");
		
	}

}
