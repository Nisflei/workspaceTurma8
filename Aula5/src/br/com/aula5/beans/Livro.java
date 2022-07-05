package br.com.aula5.beans;

public class Livro extends Produto{
	private String autor;
	private String isbn;

	public Livro(){}

	public Livro(int id, String descricao, double preco, String autor, String isbn) {
		super(id, descricao, preco);
		this.autor = autor;
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public void CalcImposto() {
		System.out.println(("ValorImposto: " + super.getPreco() * 0.10));
	};
	
	// metodo
	
		
}
