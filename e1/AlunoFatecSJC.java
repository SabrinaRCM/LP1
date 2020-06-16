package e1;

public class AlunoFatecSJC {

	private String nome;
	private String curso;
	private int notafinal;

	public AlunoFatecSJC(String nome, String curso, int notafinal) {
		this.nome = nome;
		this.curso = curso;
		this.notafinal = notafinal;
	}

	public void setNome(String n) {
		nome = n;
	}

	public void setCurso(String c) {
		curso = c;
	}

	public void setNotaFinal(int not) {
		notafinal = not;
	}

	public String getNome() {
		return nome;
	}

	public String getCurso() {
		return curso;
	}

	public int getNotaFinal() {
		return notafinal;
	}

	public void estudar() {
		System.out.println("É o principal");
	}

	public void fazerprova() {
		System.out.println("Se desesperar");
	}

	public void seformar() {
		System.out.println("Finalmente diploma!");
	}
}
