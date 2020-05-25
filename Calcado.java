package e1;

public class Calcado {

	private int tamanho;
	private String marca;
	private String tipo;

	public Calcado(int tamanho, String marca, String tipo) {
		this.tamanho = tamanho;
		this.marca = marca;
		this.tipo = tipo;
	}

	public void setTamanho(int tam) {
		tamanho = tam;
	}

	public void setMarca(String m) {
		marca = m;
	}

	public void setTipo(String t) {
		tipo = t;
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void andar() {
		System.out.println("Bora gastar a sola");
	}

	public void chutar() {
		System.out.println("Proteger o pé e chutar uma bola");
	}

	public void proteger() {
		System.out.println("Asfalto quente, chão frio e sujo #protejaospes");
	}
}
