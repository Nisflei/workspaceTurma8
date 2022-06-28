package beans;

public class Pessoa {
	// Atributos
	
	private int id;
	private String nome;
	private int idade;
	private String cidade;
	private String sentimento;
	
	//getters + Setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		if (idade <= 0) {
			System.out.println("Idade Invalida..!!");
		}else {
			this.idade = idade;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSentimento() {
		return sentimento;
	}

	public void setSentimento(String sentimento) {
		this.sentimento = sentimento;
	}
	
	
	
	// Metodos

	public void comer(String alimento) {
		System.out.println("Matando a fome..!!" + alimento);
	}
	
	public void dormir(int tempo) {
		System.out.println("Tempo de sono: " + tempo);
		
		if (tempo <= 5) {
			this.sentimento = "Cansado";
		} else { 
			if ((tempo > 5) && (tempo <= 8)) {
				this.sentimento = "Disposto";			   
			} else {
				this.sentimento = "Relaxado";
			}
		}
	}
	
	
}
