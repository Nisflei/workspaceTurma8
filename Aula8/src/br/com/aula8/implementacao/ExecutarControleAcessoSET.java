package br.com.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import br.com.aula8.util.Input;

public class ExecutarControleAcessoSET {

	public static void main(String[] args) {

		Set<String> controleAcesso = new HashSet<String>();
		String cracha, tipo;

		System.out.println(">-- Controle De Acesso"); 
		while (true) {
			tipo = Input.texto("Digite <E>ntrada ou <S>aida");
			
			if (tipo.equalsIgnoreCase("E")) {
				cracha = Input.texto("Leitor Cracha:");

				if (!controleAcesso.contains(cracha)) {
					Input.mensagem("Bem vindo.. Acesso liberado: " + cracha);
					controleAcesso.add(cracha);
				} else {
					Input.mensagem("Entrada já foi registrada para esse cracha " + cracha + " - Acesso Bloqueado..!");
				}
			}
			if (tipo.equalsIgnoreCase("S")) {
				cracha = Input.texto("Leitor Cracha:");
				if (!controleAcesso.contains(cracha)) {	
					Input.mensagem("Entrada NÃO registrada para esse cracha " + cracha + " - Acesso Bloqueado para SAIR..!");
				} else {
					Input.mensagem("Obrigado pela Visita..!" + cracha);
					controleAcesso.remove(cracha);
				}
			}
			System.out.println(controleAcesso);
		}

	}

}
