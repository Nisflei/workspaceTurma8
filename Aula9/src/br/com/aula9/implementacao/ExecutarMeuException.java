package br.com.aula9.implementacao;

import javax.swing.JOptionPane;

import br.com.aula9.excecao.MeuException;

public class ExecutarMeuException {

	public static void main(String[] args) throws MeuException {

		try {
			int vl1 = Integer.parseInt(JOptionPane.showInputDialog("Valo1:"));
			int vl2 = Integer.parseInt(JOptionPane.showInputDialog("Valo2:"));
			
			JOptionPane.showMessageDialog(null, "Resultado: " + (vl1/vl2));
		
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Estamos com indisponibilidade momentania... !!");
			throw new MeuException("Erro na rotina de fechamento..!!", e, true, false);

		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null," Não é possivel divisão por Zero...");
			throw new MeuException("Erro na rotina de fechamento..!!", e, false, true);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null," Sistema Indisponivel... Tente novamente em minutos.!");
			throw new MeuException("ERRO System", e);
	
		} finally {
			System.out.println("Processo Finalizado...!!");
		}
	}

}
