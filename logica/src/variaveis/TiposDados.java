package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
   // main() ? o start point de uma aplica??o Java
   // ? a chave de igni??o do carro
	public static void main(String[] args) {
		
		// Sintaxe: <Tipo de dado> <nome da vari?vel> = <dado>;
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		double imc = peso / (altura * altura);
		
		
		System.out.println("Nome   : " + nome);
		System.out.println("Idade..: " + idade);
		System.out.println("Altura.: " + altura);
		System.out.println("IMC....:" + imc);
		
		
		
		
		/* 
		 * Alfanum?rico: ? um texto, parte de um texto ou um n?mero que n?o ser? utilizado em
		 * opera??es matem?ticas.
		 * CEP (exemplo RH Ita?)
		 * Em Javan?s: String ? uma classe (com S mai?suculo)
		 * 
		 * Num?rico: representa um dado que pode ser utilizado em express?es matem?ticas e/ou
		 * ? considerado um dado cr?tico para o contexto.
		 * CEP => 00010-009 => 1  (exemplo Correios)
		 * CPF (receita federal)
		 * Funcional (colaboradores Ita?)
		 * Em javan?s:
		 * - int => para representa??o de n?meros inteiros
		 * - double => para n?meros reais (com casas decimais)
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	// em uma classe encontramos m?todos e atributos
	// nossa classe ? p?blica
}
