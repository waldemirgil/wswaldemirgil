package variaveis;

public class ManipulaString {

public static void main(String[] args) {

	/*
	 * Identificador (nomes dos elementos que criamos: vari�veis, classes, pacotes etc.
	 * - Regras:
	 * 1� - N�o come�ar�s com n�mero.
	 * 2� - N�o utilizar�s palavras reservadas (palavras da linguagem de programa��o).
	 *      Exemplo: int, double, class, void...
	 * 3� - N�o far�s uso de caracteres especiais.
	 *      Exemplo: n@me, tr#s, nome cliente (espa�o � caracter especial).
	 * 
	 * - Padr�es:
	 * 1) CamelCase : da segunda palavra em diante (em uma composi��o) deve come�ar com letra mai�scula.
	 *    Exemplo:
	 *    certo => dataNascimento
	 *    errado => datanascimento 
	 *    certo => data_nascimento
	 *    errado => data_Nascimento
	 *    
	 * 2) UML : � respons�vel por padronizar elementos da Orienta��o a Objetos.
	 *    - Toda classe deve come�ar com letra mai�scula.
	 *    - Toda vari�vel deve come�ar com letra min�sucula.
	 *    - Todo m�todo deve come�ar com letra min�sucula e deve ser seguido de par�nteses.
	 *    
	 */
	
	
	
	String email = "WaldeMirgil@uoL.com.Br";

	System.out.println("Original: " + email);
	System.out.println("Minuscula: " + email.toLowerCase());
	System.out.println("Maiusculo: " + email.toUpperCase());
	System.out.println("Tem arroba? " + email.contains("@"));	
	System.out.println("Posi��o do @: " + email.indexOf("@"));
	System.out.println("Qtde Caracteres: " + email.length());
	System.out.println("Do 2� at� o quinto caracter: " + email.substring(1,5));
	System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
	System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")).toUpperCase());
	System.out.println("Servidor: " + email.substring(email.indexOf("@")+1, email.length()).toLowerCase());
	System.out.println("Primeiro caracter: " + email.charAt(0));
	
	
	
	// usu�rio do email
	// o servidor do email
	// boas pr�ticas para nomenclatura
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	



}

