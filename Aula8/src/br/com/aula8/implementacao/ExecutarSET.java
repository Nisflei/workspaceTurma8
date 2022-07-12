package br.com.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

public class ExecutarSET {

	public static void main(String[] args) {
		
		Set<String> h_set = new HashSet<String>();

		// adicionar 
		
		h_set.add("azul");
		h_set.add("amarelo");
		
		System.out.println(h_set.add("verde"));
		System.out.println(h_set.add("amarelo"));
		
		// listar
		System.out.println(h_set);
		
		for(String elemento: h_set) {
			System.out.println("Conteudo:" + elemento);
		}
		
		// tem conteudo ?
		System.out.println("Esta Vazio?" + h_set.isEmpty());
		
		// procuro um elemento ?
		System.out.println("Tem a cor azul? " + h_set.contains("azul"));
		System.out.println("Tem a cor cinza? " + h_set.contains("cinza"));
			
		// remover conteudo
		
		h_set.remove("azul");
		System.out.println(h_set);
		
		// Trocar um conteudo 
		
		h_set.add("azul claro");
		System.out.println(h_set);
		
		
	}

}
