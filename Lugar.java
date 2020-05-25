package e1;

public class Lugar {

	private Double temperatura;
	private String ambiente;
	private String nome;

	public Lugar(Double temperatura, String ambiente, String nome) {
		this.temperatura = temperatura;
		this.ambiente = ambiente;
		this.nome = nome;
	}

	public void setTemperatura(Double t) {
		temperatura = t;
	}

	public void setAmbiente(String amb) {
		ambiente = amb;
	}

	public void setNome(String n) {
		nome = n;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public String getNome() {
		return nome;
	}

	public void viagem() {
		System.out.println("Prontos para a viagem");
	}

	public void passear() {
		System.out.println("Dar uma volta pelo local e aproveitar");
	}

	public void observar() {
		System.out.println("Observar a paisagem!");
	}
	
}
