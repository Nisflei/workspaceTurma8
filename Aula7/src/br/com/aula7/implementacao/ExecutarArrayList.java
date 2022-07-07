package br.com.aula7.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.aula7.beans.Aluno;

public class ExecutarArrayList {

	public static void main(String[] args) {

		List<String> listaNomes = new ArrayList<String>();
		
		
		listaNomes.add("Ana");
		listaNomes.add("Maria");
		listaNomes.add("Beatriz");
		listaNomes.add("Jose");
		listaNomes.add(0, "Pedro");
		listaNomes.add("Cris");
		listaNomes.set(0, "Leonardo");
		
		System.out.println("Mostrar Conteudo:" + listaNomes);
		System.out.println("Tamanho: " + listaNomes.size());
		
		Collections.sort(listaNomes);
		System.out.println("Após SORT");
		System.out.println("Mostrar Conteudo:" + listaNomes);

		// pesquisar
		String pesquisa = JOptionPane.showInputDialog("Nome de pesquisa:");

		int posicao = listaNomes.indexOf(pesquisa);
		if (posicao >=0)
			System.out.println("Encontrou na posição [ " + posicao + " ] " + listaNomes.get(posicao));
		else
			System.out.println("Não encontrou..!! ");
		
		
		// Classe 
		
		System.out.println("Agora é classe..!!");
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();

		listaAlunos.add(new Aluno("Ana",5,0,20));
		listaAlunos.add(new Aluno("Fausto",10,0,40));
		listaAlunos.add(new Aluno("Beatriz",8,0,25));
		Aluno a1 = new Aluno("Cris",10,0,30);
		listaAlunos.add(a1);
		
		System.out.println("Mostrar Conteudo:" + listaAlunos);
		System.out.println("Tamanho: " + listaAlunos.size());
		
		Collections.sort(listaAlunos);
		
		System.out.println("Mostrar Conteudo:" + listaAlunos);
		
	}

}
