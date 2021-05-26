package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {

	/*
	 * Tipos primitivos (TODOS aqueles que começam com letra minúscula
	 * boolean => Lógico (True/False)
	 * char => um caracter entre apostrofos
	 * 
	 * byte   => -128/+127 (até 255 posições)
	 * short  => -32 mil/+32 mil
	 * int    => -2 trilhões / +2 trilhões
	 * long   => (-) 9 quintilhões / (+) 9 quintilhões
	 * 
	 * float  => até 5 casas decimais
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
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor unitário"));
		float total = valor*quantidade;
		double aliquota = Double.parseDouble(JOptionPane.showInputDialog("Imposto"));
		double imposto = total * aliquota;
		
		
		System.out.println("Produto: " + produto);
		System.out.println("Valor Total: " + total);
		System.out.println("Valor do Imposto: " + imposto);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
