package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*
		 * Exerc�cio 1:
		 * Solicite dois valores e um operador matem�tico
		 * (+, -, / ou *)
		 * Dependendo do operador que foi digitado realize o c�lculo e exiba o resultado
		 * Dica: Se utilizar String a compara��o de String deve ser:
		 * if (vari�vel.equals(valorasercomparado")){
		 */
		
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor1"));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor2"));
		char operador = JOptionPane.showInputDialog("Digite um operador").charAt(0);
		
		if (operador=='*') {
			System.out.println("Resultado: " + (valor1*valor2));
		}else if (operador=='/') {
			if (valor2!=0) {
				System.out.println("Resultado: " + (valor1/valor2));
			}else {
				System.out.println("Divis�o n�o pode ser realizada!");
			}
		}else if (operador=='+') {
			System.out.println("Resultado: " + (valor1+valor2));
		}else if (operador=='-') {
			System.out.println("Resultado: " + (valor1-valor2));
		}else {
			System.out.println("Operador inv�lido");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
