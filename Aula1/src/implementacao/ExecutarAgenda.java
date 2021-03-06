package implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import beans.AgendaRevisao;

public class ExecutarAgenda {

	public static void main(String[] args) throws ParseException {
		
		System.out.println("Iniciando...");
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		AgendaRevisao agenda1 = new AgendaRevisao();
		 
		agenda1.cliente = "Fausto Silva";
		agenda1.modelo = "Gol";
		agenda1.veiculo = "Gol GTI";
		agenda1.data = formatoData.parse("23/06/2022");
		
		
		agenda1.agendar();
		
		
		System.out.println(" ");
		System.out.println("Dados do Agendamento..!!");
		System.out.println("cliente: " + agenda1.cliente);
		System.out.println("modelo: " + agenda1.modelo);
		System.out.println("Data: " + formatoData.format(agenda1.data));
		
		
		System.out.println(" ");
		
		agenda1.cancelarAgenda();
		
		//Missao:  Adicionar a informação para HORA :) 
	}

}
