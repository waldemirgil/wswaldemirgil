package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		
		String nome="";
		float peso=0;
		float altura=0;
		float imc=0;
		
		do {
			nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
			peso = Float.parseFloat(JOptionPane.showInputDialog("Peso"));
			altura = Float.parseFloat(JOptionPane.showInputDialog("Altura"));
			imc = peso / (altura*altura);
			System.out.printf("%s seu IMC �: %.2f\n", nome, imc);
		}while(JOptionPane.showConfirmDialog
			      (null, "Continuar?", "Titulo", JOptionPane.YES_NO_OPTION)==0);
		
		/*
		while(JOptionPane.showConfirmDialog
			      (null, "Continuar?", "Titulo", JOptionPane.YES_NO_OPTION)==0) {
			nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
			peso = Float.parseFloat(JOptionPane.showInputDialog("Peso"));
			altura = Float.parseFloat(JOptionPane.showInputDialog("Altura"));
			imc = peso / (altura*altura);
			System.out.printf("%s seu IMC �: %.2f\n", nome, imc);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
