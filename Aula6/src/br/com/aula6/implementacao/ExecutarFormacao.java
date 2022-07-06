package br.com.aula6.implementacao;

import br.com.aula6.beans.Bacharelado;
import br.com.aula6.beans.Formacao;
import br.com.aula6.beans.Medio;
import br.com.aula6.beans.Tecnologo;

public class ExecutarFormacao {

	public static void main(String[] args) {
		
		Formacao f = new Formacao("Ensio", 360, 1000, 5);
	    
		
		Medio m = new Medio("Ensio Médio", 3, 350, 1, "obrigatorio");
		m.calculaMensalidade(0.1);
		System.out.println("Medio: " + m.getMensalidade());
		
		Bacharelado b = new Bacharelado("Ensio Bacharelado", 4, 500, 2, 100, "JAvaDEV");
		b.calculaMensalidade(0.2);
		System.out.println("Bach: " + b.getMensalidade());
		
		Tecnologo t = new Tecnologo("Ensino Tecnologo", 1, 250, 1, true);
		t.calculaMensalidade(0.1);
		System.out.println("Tecn: " + t.getMensalidade());
	}

}
