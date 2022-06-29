package util;

import javax.swing.JOptionPane;

public class Input {
	//atributos
	//contrutor
	
	//metodos
	
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static double decimal(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	public static boolean logico(String msg) {
		int resp = JOptionPane.showConfirmDialog(null, msg,"Pergunta..", JOptionPane.YES_NO_OPTION);
		
		if (resp == 0)
			return true;
		else
			return false;
	}
	
}
