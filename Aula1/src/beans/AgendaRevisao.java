package beans;

import java.util.Date;

public class AgendaRevisao {
	// Atributos (propriedade)
	 
	public String cliente;
	public String modelo;
	public String veiculo;
	public Date data;
	public Date hora;
	
	// Metodos ( operações )
	
	public void agendar() {
		System.out.println("Agendamento realizado com sucesso..!!!");
	}
	
	public void cancelarAgenda() {
		System.out.println("Agendamento cancelado..!!!");
	}
	
}
