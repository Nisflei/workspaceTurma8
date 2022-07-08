package br.com.aula7.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.aula7.beans.Livro;

public class OrganizarLivros {

	public static void main(String[] args) {
		
		List<Livro> estante = new ArrayList<Livro>();
		
		while (0 == JOptionPane.showConfirmDialog(null, "Incluir novo livro?", "Livros",JOptionPane.YES_NO_OPTION)) {
			
			estante.add(new Livro(JOptionPane.showInputDialog("Titulo:"),
							     JOptionPane.showInputDialog("Auto:"),
							     Double.parseDouble(JOptionPane.showInputDialog("Preço:"))));
			
			System.out.println(estante);
		}
		
		Collections.sort(estante);
		
		System.out.println("> --- Estante organizada --- <");
		System.out.println(estante);
		
		
	}

}
