package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		
		/*
		 * Sintaxe do for:
		 * 1� variavel que vai contar
		 * 2� condi��o
		 * 3� como ele vai contar?
		 */
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		for (int contador=0;contador<15;contador+=1) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
