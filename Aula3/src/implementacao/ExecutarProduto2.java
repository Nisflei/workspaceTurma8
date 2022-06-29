package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ExecutarProduto2 {

	public static void main(String[] args) {

		Produto impressora = new Produto();
		
		impressora.setNome(JOptionPane.showInputDialog("Nome"));
		impressora.setMarca(JOptionPane.showInputDialog("Marca"));
		
		String valor = JOptionPane.showInputDialog("Valor do Produto");
		impressora.setValor(Double.parseDouble(valor));
		
		int resp = JOptionPane.showConfirmDialog(null, "Esta em promoção ?","Informe", JOptionPane.YES_NO_OPTION);
		
		if (resp == 0)
			impressora.setPromocao(true);
		else
			impressora.setPromocao(false);
			
		
		System.out.println(impressora.toString());
	}

}
