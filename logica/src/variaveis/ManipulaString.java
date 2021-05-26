package variaveis;

public class ManipulaString {

public static void main(String[] args) {

	/*
	 * Identificador (nomes dos elementos que criamos: variáveis, classes, pacotes etc.
	 * - Regras:
	 * 1º - Não começarás com número.
	 * 2º - Não utilizarás palavras reservadas (palavras da linguagem de programação).
	 *      Exemplo: int, double, class, void...
	 * 3º - Não farás uso de caracteres especiais.
	 *      Exemplo: n@me, tr#s, nome cliente (espaço é caracter especial).
	 * 
	 * - Padrões:
	 * 1) CamelCase : da segunda palavra em diante (em uma composição) deve começar com letra maiúscula.
	 *    Exemplo:
	 *    certo => dataNascimento
	 *    errado => datanascimento 
	 *    certo => data_nascimento
	 *    errado => data_Nascimento
	 *    
	 * 2) UML : é responsável por padronizar elementos da Orientação a Objetos.
	 *    - Toda classe deve começar com letra maiúscula.
	 *    - Toda variável deve começar com letra minúsucula.
	 *    - Todo método deve começar com letra minúsucula e deve ser seguido de parênteses.
	 *    
	 */
	
	
	
	String email = "WaldeMirgil@uoL.com.Br";

	System.out.println("Original: " + email);
	System.out.println("Minuscula: " + email.toLowerCase());
	System.out.println("Maiusculo: " + email.toUpperCase());
	System.out.println("Tem arroba? " + email.contains("@"));	
	System.out.println("Posição do @: " + email.indexOf("@"));
	System.out.println("Qtde Caracteres: " + email.length());
	System.out.println("Do 2º até o quinto caracter: " + email.substring(1,5));
	System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
	System.out.println("Usuário: " + email.substring(0, email.indexOf("@")).toUpperCase());
	System.out.println("Servidor: " + email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
	System.out.println("Primeiro caracter: " + email.charAt(0));
	
	
	
	// usuário do email
	// o servidor do email
	// boas práticas para nomenclatura
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	



}

