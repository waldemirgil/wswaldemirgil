package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome : ").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade: "));
		
		if (idade<16) {
		System.out.println(nome + " Voc� n�o pode votar.");	
		}
		
		if (idade>=18 && idade<=70) {
			System.out.println(nome + " Seu voto � obrigat�rio.");
		}
		
		if (idade==16 || idade==17 || idade>=70) {
			System.out.println(nome + " Seu voto � facultativo.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
