package implementacao;

import java.util.Scanner;

import beans.Livro;

public class ExecutarLivro {

	public static void main(String[] args) {
		
		System.out.println("Iniciando...!!! ");
		
		Livro objLivro = new Livro();
		
		objLivro.autor = "Fausto Silva";
		objLivro.editora ="Nova";
		objLivro.numPagina= 150;
		objLivro.titulo = "OO no mundo Java..!!";
		objLivro.preco = 105.01;
		
		System.out.println(" ");
		System.out.println("Dados do Livro:");
		System.out.println("Titulo: " + objLivro.titulo);
		System.out.println("Preço:" + objLivro.preco);
		
		/*Missão
		 *  Criar outro objeto e obter 2 atributos por teclado
		 */
		
		Livro objLivro2 = new Livro();
		
		Scanner leitor = new Scanner(System.in);

		System.out.println(" ");
		System.out.println("Dados do Livro2...... ");

		System.out.println("Digite o Titulo: ");
		objLivro2.titulo = leitor.nextLine();
		
		System.out.println("Digite o Autor: ");
		objLivro2.autor = leitor.nextLine();
		
		System.out.println(" ");
		System.out.println("Dados do Livro2:");
		System.out.println("Titulo: " + objLivro2.titulo);
		System.out.println("Preço:" + objLivro2.preco);
		System.out.println("Autor:" + objLivro2.autor);
		
		
		
		
		
				
				
	}

}
