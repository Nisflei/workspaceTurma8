package implementacao;

import java.util.Scanner;

import beans.Produto;

public class ExecutarProduto {
	public static void main(String[] args) {
		
		System.out.println("Iniciando..!! ");
		
		Produto p1 = new Produto();
		
		p1.setMarca("Nestle");
		p1.setNome("Leite");
		System.out.println("P1 "+ p1.toString());
		
		Produto p2 = new Produto("Impressora HP", "HP", 500.0);
		
		System.out.println("P2 " + p2.toString());
		
		Produto p3 = new Produto("Note 15", "DEll", 1500, true);
		 
		System.out.println("P3 " + p3.toString());
		
		Produto p4 = new Produto();
		
		Scanner leitor = new Scanner(System.in);
		
		p4.setNome(leitor.nextLine());
		System.out.println(p4.toString());
		
	}
}
