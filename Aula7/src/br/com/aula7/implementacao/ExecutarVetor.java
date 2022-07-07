package br.com.aula7.implementacao;

import javax.swing.JOptionPane;
import br.com.aula7.beans.Aluno;

public class ExecutarVetor {

	public static void main(String[] args) {

		String listaNome[] = {"Ana", "Fausto", "Beatriz"};
		
		//Apresentar
		System.out.println(listaNome);
		System.out.println("Visualizar conteudo 1o. posição: " + listaNome[0]);
		
		listaNome[0] = "Jose";
		System.out.println("Visualizar conteudo 1o. posição: " + listaNome[0]);
		
		String listaNome2[] = new String[10];
		//listaNome[3] = "Ana";
		//System.out.println("Visualizar conteudo 4o. posição: " + listaNome[3]);
		
		listaNome2[3] = "Ana";
		System.out.println("Visualizar conteudo 4o. posição: " + listaNome2[3] + " {listaNome2}");
		
		System.out.println(listaNome2.length);
		
		for (int posicao=0; posicao < listaNome.length; posicao++) {
			System.out.println("Indice [ "+ posicao + "] - " + listaNome[posicao]);
		}
		
		// pesquisar
		String pesquisa = JOptionPane.showInputDialog("Nome de pesquisa:");
		
		for (int posicao=0; posicao < listaNome.length; posicao++) {
			if (listaNome[posicao].equalsIgnoreCase(pesquisa)) 
				System.out.println("Encontrou... Indice [ "+ posicao + "] - " + listaNome[posicao]);
		}
		
		/// Usando Objeto
		
		Aluno[] listaAlunos = new Aluno[3];
		
		listaAlunos[0] = new Aluno("Ana",5,0,20);
		listaAlunos[1] = new Aluno("Fausto",10,0,40);
		listaAlunos[2] = new Aluno("Beatriz",8,0,25);
		
		//listaAlunos[3] = new Aluno("Jose",8,0,25);
		
		System.out.println("Visualizar conteudo 1o. posição: " + listaAlunos[0]);
		System.out.println("Visualizar conteudo 1o. posição: " + listaAlunos[0].getNome());

		// pesquisar
		pesquisa = JOptionPane.showInputDialog("Nome de pesquisa:");
		
		for (int posicao=0; posicao < listaAlunos.length; posicao++) {
			if (listaAlunos[posicao].getNome().equalsIgnoreCase(pesquisa)) 
				System.out.println("Encontrou Obj... Indice [ "+ posicao + "] - " + listaAlunos[posicao].getNome());
		}

		
	}

}
