package br.com.aula4.implementacao;

import br.com.aula4.beans.Motor;
import br.com.aula4.beans.Veiculo;

public class ExecutarVeiculo {

	public static void main(String[] args) {
		
		Motor motor1= new Motor(50,4,"gasolina");
		
		System.out.println(motor1.toString());
		
		Veiculo carro = new Veiculo();
		
		carro.setModelo("Fusca");
		carro.setCategoria("Compacto");
		carro.setPlaca("ABC5H1");
		carro.setPortas(2);
		carro.setMotorizacao(motor1);
		
		System.out.println(carro.toString());
		
		System.out.println(carro.getMotorizacao().getCombustivel());
		
		
		Motor motor2 = new Motor(150,4,"alcool");
		
		carro.setMotorizacao(motor2);
		System.out.println(carro.toString());
		
		
		
	}

}
