package br.com.aula8.implementacao;

import java.util.HashMap;
import java.util.Map;

public class ExecutarMAP {

	public static void main(String[] args) {
		
		Map<Integer, String> h_map = new HashMap<Integer, String>();
		
		//adicionar 
		
		h_map.put(10,"azul");
		h_map.put(01,"verde");
		h_map.put(20,"amarelo");
		
		// substituir um valor ??
		
		h_map.put(20, "preto");
		
		// listar
		System.out.println(h_map.entrySet());
		System.out.println(h_map.values());
		System.out.println(h_map.keySet());
		
		for (Map.Entry elemento: h_map.entrySet()) {
			System.out.println("Conteudo: " + elemento.getKey() + " - " + elemento.getValue() );
		}
		
		// procurar elemento
		
		System.out.println("Tem a chave 20 ? " + h_map.containsKey(20));
		System.out.println("Tem a cor cinza ? " + h_map.containsValue("cinza"));
		
		// remover 
		System.out.println("Remover um elemento chave 01: " + h_map.remove(01) );
		System.out.println(h_map.entrySet());
		
		System.out.println("Remover um elemento chave 50: " + h_map.remove(50) );
		

		
		
				

	}

}
