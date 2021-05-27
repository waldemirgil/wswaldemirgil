package br.com.caicaielevator.modelo;

public class Elevador {

	
	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private int andarAtual;
	
	
	public String retornarNome() {
		return nome;
	}
	
	public void preencherNome(String param) {
		nome=param; 
	}
	
	public void inicializar(int pandarMax, int pandarMin, int pCapPessoas) {
		andarMaximo = pandarMax;
		andarMinimo = pandarMin;
		capacidadePessoas = pCapPessoas;
	}
	
	public String retornarResumo() {
		return 
				"Nome: " + nome + "\n" +
				"Andar: " + andarAtual + "\n" +
				"Pessoas: " + qtdePessoas;
	}
	
	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
			return "Subindo";
		}else {
			return "Já está no último andar";
		}
	}
	
	public String descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
			return "Descendo";
		}else {
			return "Já está no andar mínimo";
		}
	}
		
	public void sair() {
		if (qtdePessoas>0) {
			qtdePessoas--;
		}
	}
	
	public void sair(int qtde) {
		int resultado = qtdePessoas - qtde;
		if (resultado>=0) {
			qtdePessoas-=qtde;
		}
	}
	
	public void entrar(int qtde) {
		int resultado = qtdePessoas + qtde;
		if (resultado<=capacidadePessoas) {
			qtdePessoas+=qtde;
		}
	}
	
}
