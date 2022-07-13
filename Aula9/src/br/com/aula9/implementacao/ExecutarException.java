package br.com.aula9.implementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExecutarException {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	/*	try {
			
		
		System.out.println("Dig vl1: ");
		int vl1 = s.nextInt();
		System.out.println("Dig vl2: ");
		int vl2 = s.nextInt();
		
		
		System.out.println("Divisão: "  + (vl1/vl2));
		
		} catch(InputMismatchException e) {
			JOptionPane.showMessageDialog(null," Meu... voce tem que digitar numeros :( ...");
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null," Não é possivel divisão por Zero...");
		} catch(Exception e){
			//Tratar o erro:
			System.out.println(">---LOG ");
			System.out.println("Ocorreu um ERRO:");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		
		System.out.println("> --- Fim");
		
	*/	
		try {
			System.out.println("Digite a palavra Secreta..!!");
			String palavra = s.nextLine();
			
			if (!palavra.equalsIgnoreCase("java")) {
				throw new Exception("Palavra invalida..!!");
			}
			
			JOptionPane.showMessageDialog(null, "Acertou...!! ");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.out.println(e.getMessage());

		} finally {
			System.out.println("Passou por Finally.. ");
			System.out.println("Fechar conexão BD / Limpar dados da tela");
		}
		
	}

}
