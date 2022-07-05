package br.com.aula5.implementacao;

import br.com.aula5.beans.Celular;
import br.com.aula5.beans.Livro;
import br.com.aula5.beans.Produto;

public class ExecutarVenda {

	public static void main(String[] args) {

		Celular cel = new Celular();	
		
		cel.setId(10);
		cel.setPreco(100);
		cel.setArmazenamento(64);
		
		System.out.println("Celular:" +" - "+ cel.getId() + " - "+cel.getPreco() + " - "+cel.getArmazenamento());
		cel.CalcImposto();
		
		Livro lv = new Livro(0, "Java Será ?", 250.0, "Fracisco M", "ISBN1345");
		
		System.out.println("Livro: " + lv.getDescricao() +" - " + lv.getPreco() ); 
		lv.CalcImposto();
		
		
		//Produto pp = new Produto(5,"Sabão",5);
		
		//System.out.println("produto:" + pp.getDescricao());
		//pp.ImpostoProd();
		
		
	}

}
