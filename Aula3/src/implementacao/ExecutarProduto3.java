package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;
import util.Input;

public class ExecutarProduto3 {
	public static void main(String[] args) {
	
		Produto p3 = new Produto();
		
		p3.setNome(Input.texto("Nome do Produto"));
		p3.setMarca(Input.texto("Digite a Marca"));
		p3.setValor(Input.decimal("Valor do Produto"));
		p3.setPromocao(Input.logico("Produto em Promoção ?"));
		
		JOptionPane.showMessageDialog(null, p3.toString());
		
		System.out.println(p3.toString());
		
	}
}
