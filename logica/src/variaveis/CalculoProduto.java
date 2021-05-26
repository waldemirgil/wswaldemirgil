package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {

	/*
	 * Tipos primitivos (TODOS aqueles que come�am com letra min�scula
	 * boolean => L�gico (True/False)
	 * char => um caracter entre apostrofos
	 * 
	 * byte   => -128/+127 (at� 255 posi��es)
	 * short  => -32 mil/+32 mil
	 * int    => -2 trilh�es / +2 trilh�es
	 * long   => (-) 9 quintilh�es / (+) 9 quintilh�es
	 * 
	 * float  => at� 5 casas decimais
	 * double => acima de 5 casas decimais
	 */
	public static void main(String[] args) {
		
		/*
		 * Capturem:
		 * - nome do produto
		 * - qtde do produto
		 * - valor unitario
		 * exibir no final:
		 * nome do produto
		 * valor total
		 * valor do imposto (17% sobre o valor total)
		 */
		
		String produto = JOptionPane.showInputDialog("Produto");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor unit�rio"));
		float total = valor*quantidade;
		double aliquota = Double.parseDouble(JOptionPane.showInputDialog("Imposto"));
		double imposto = total * aliquota;
		
		
		System.out.println("Produto: " + produto);
		System.out.println("Valor Total: " + total);
		System.out.println("Valor do Imposto: " + imposto);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
