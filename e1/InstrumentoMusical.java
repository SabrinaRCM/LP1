package e1;

public class InstrumentoMusical {

	private String nome;
	private String tipo;
	private String marca;

	public InstrumentoMusical(String nome, String tipo, String marca) {
		this.nome = nome;
		this.tipo = tipo;
		this.marca = marca;
	}

	public void setNome(String n) {
		nome = n;
	}

	public void setTipo(String t) {
		tipo = t;
	}

	public void setMarca(String m) {
		marca = m;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void show() {
		System.out.println("Para o show começar é só tocar!");
	}

	public void aprender() {
		System.out.println("Aprendendo a tocar");
	}

	public void afinar() {
		System.out.println("Um instrumento afinado é importante");
	}
}
