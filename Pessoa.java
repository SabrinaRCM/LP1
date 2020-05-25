package e1;

public class Pessoa {

	private String nome;
	private int idade;
	private Double altura;

	public Pessoa(String nome, int idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public void setNome(String n) {
		nome = n;
	}

	public void setIdade(int i) {
		idade = i;
	}

	public void setAltura(Double alt) {
		altura = alt;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void dormir() {
		System.out.println("Boa noite");
	}

	public void acordar() {
		System.out.println("Bom dia");
	}

	public void comer() {
		System.out.println("Bom apetite");
	}
}
