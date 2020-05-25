package e1;

public class Profissional {

	private String formacao;
	private String empresa;
	private String especialidade;

	public Profissional(String formacao, String empresa, String especialidade) {
		this.formacao = formacao;
		this.empresa = empresa;
		this.especialidade = especialidade;
	}

	public void setFormacao(String form) {
		formacao = form;
	}

	public void setEmpresa(String emp) {
		empresa = emp;
	}

	public void setEspecialidade(String esp) {
		especialidade = esp;
	}

	public String getFormacao() {
		return formacao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void estudar() {
		System.out.println("Porque estudar nunca é demais");
	}

	public void trabalhar() {
		System.out.println("De segunda a sexta (as vezes sábado e domingo também) estamos no escritório");
	}

	public void descansar() {
		System.out.println("Porque descansar nunca é demais");
	}
}
