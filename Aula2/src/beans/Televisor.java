package beans;

public class Televisor {
	private int canal;
	private int volume;
	private boolean ligado;

	//  gets + sets
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	// metodos
	
	public void aumentarVolume() {
		if (isLigado()) {
			if (this.volume < 10)  
				this.volume = this.volume + 1; 
				//this.volume++;
		}		
	}
	
	public void reduzirVolume() {
		if (isLigado()) {
			if (this.volume > 0)  
				this.volume--;
		}				
	}
	
	public void subirCanal() {
		if (isLigado()) {
			if (this.canal < 16)  
				this.canal++;
		}				
	}
	
	public void descerCanal() {
		if (isLigado()) {
			if (this.canal > 0 )  
				this.canal--;
		}				
	}
	
	public void ligarTV() {
		this.ligado = true;
	}
	
	public void desligarTV() {
		this.ligado = false;
		this.canal = 0;
		this.volume = 0;
	}
	
	public void mostrarStatus() {
		System.out.println("TV ligada: " + this.ligado);
		System.out.println("Canal: " + this.canal);
		System.out.println("Volume: " + this.volume);
	}
	
	
	
}
