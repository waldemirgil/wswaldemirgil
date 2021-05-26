package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o n�mero"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (chute>numero) {
				JOptionPane.showMessageDialog(null, "Chutando alto.");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chutando baixo.");
			}
		}while(numero!=chute);
		JOptionPane.showMessageDialog(null, "Parab�ns voc� acertou com " + contador + " tentativa(s)");
		
		/*
		 * Miss�o 1:
		 * O jogador um digita um n�mero inteiro.
		 * A partir da� o Jogador 2 deve advinhar o n�mero,
		 * somente quando ele acertar dever� aparecer a mensagem
		 * "Parab�ns, voc� acertou"
		 * 
		 * Miss�o 2:
		 * Acrescente dicas para o Jogador2, informando se o n�mero que ele
		 * tem que advinhar � maior ou menor que o n�mero que ele est� digitando.
		 * 
		 * Miss�o 3:
		 * Acrescente um contador de tentativas, que ser� exibido quando
		 * o Jogador 2 acertar, a mensagem dever� ser:
		 * "Parab�ns, voc� acertou com X tentativa(s)". 
		 * Dica: ter�o que criar uma vari�vel para contar.
		 * 
		 * != => n�o � igual
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
