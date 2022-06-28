package implementacao;

import beans.Televisor;

public class ExecutarTV {

	public static void main(String[] args) {
		
		System.out.println("Iniciando..!! ");
		System.out.println(" ");
		
		Televisor tv = new Televisor();
		
		tv.ligarTV();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.subirCanal();
		tv.subirCanal();
		
		tv.mostrarStatus();
		tv.descerCanal();
		tv.reduzirVolume();
		tv.mostrarStatus();

		tv.desligarTV();
		tv.mostrarStatus();
		
	}

}
