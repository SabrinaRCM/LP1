package e1;

public class Teste {

	public static void main(String[] args) {

		Lugar l1 = new Lugar(25.0, "praia", "Caraguatatuba");
		l1.viagem();
		l1.passear();
		l1.observar();
		
		Lugar l2 = new Lugar(17.0, "casa", "São José dos Campos");
		l2.viagem();
		l2.passear();
		l2.observar();
		
		Lugar l3 = new Lugar(8.0, "frio", "Campos do Jordão");
		l3.viagem();
		l3.passear();
		l3.observar();
		
		Lugar l4 = new Lugar(30.0, "quente", "Rio de Janeiro");
		l4.viagem();
		l4.passear();
		l4.observar();
		
		Lugar l5 = new Lugar(22.0, "nublado", "São Paulo");
		l5.viagem();
		l5.passear();
		l5.observar();
		
		Lugar[] novoLugar = new Lugar[5];
		novoLugar[0] = l1;
		novoLugar[1] = l2;
		novoLugar[2] = l3;
		novoLugar[3] = l4;
		novoLugar[4] = l5;
		
		Pessoa p1 = new Pessoa("Sabrina", 24, 1.60);
		p1.acordar();
		p1.dormir();
		p1.comer();

		Pessoa p2 = new Pessoa("Pedro", 21, 1.68);
		p2.acordar();
		p2.dormir();
		p2.acordar();

		Pessoa p3 = new Pessoa("Gianni", 53, 1.58);
		p3.acordar();
		p3.dormir();
		p3.comer();

		Pessoa p4 = new Pessoa("Val", 55, 1.68);
		p4.acordar();
		p4.dormir();
		p4.comer();

		Pessoa p5 = new Pessoa("Gabriel", 8, 1.30);
		p5.acordar();
		p5.dormir();
		p5.comer();

		Pessoa[] novaPessoa = new Pessoa[5];
		novaPessoa[0] = p1;
		novaPessoa[1] = p2;
		novaPessoa[2] = p3;
		novaPessoa[3] = p4;
		novaPessoa[4] = p5;
		
		AlunoFatecSJC a1 = new AlunoFatecSJC("Sabrina", "Banco de dados", 6);
		a1.estudar();
		a1.fazerprova();
		a1.seformar();

		AlunoFatecSJC a2 = new AlunoFatecSJC("Pedro", "Banco de dados", 6);
		a2.estudar();
		a2.fazerprova();
		a2.seformar();

		AlunoFatecSJC a3 = new AlunoFatecSJC("Gianni", "Logística", 7 );
		a3.estudar();
		a3.fazerprova();
		a3.seformar();

		AlunoFatecSJC a4 = new AlunoFatecSJC("Val", "Logística", 6);
		a4.estudar();
		a4.fazerprova();
		a4.seformar();

		AlunoFatecSJC a5 = new AlunoFatecSJC("Gabriel", "Manutenção de aeronaves", 8);
		a5.estudar();
		a4.fazerprova();
		a4.seformar();

		AlunoFatecSJC[] novoAlunoFatecSJC = new AlunoFatecSJC[5];
		novoAlunoFatecSJC[0] = a1;
		novoAlunoFatecSJC[1] = a2;
		novoAlunoFatecSJC[2] = a3;
		novoAlunoFatecSJC[3] = a4;
		novoAlunoFatecSJC[4] = a5;
		
		Profissional pro1 = new Profissional("Advocacia", "GRT", "Criminal");
		pro1.estudar();
		pro1.trabalhar();
		pro1.descansar();

		Profissional pro2 = new Profissional("Biomedicina", "Lab mil", "Genética");
		pro2.estudar();
		pro2.trabalhar();
		pro2.descansar();

		Profissional pro3 = new Profissional("Programação", "CodeB", "Java" );
		pro3.estudar();
		pro3.trabalhar();
		pro3.descansar();

		Profissional pro4 = new Profissional("Programação", "Global", "Python");
		pro4.estudar();
		pro4.trabalhar();
		pro4.descansar();

		Profissional pro5 = new Profissional("Programação", "BD new", "SQL");
		pro5.estudar();
		pro5.trabalhar();
		pro5.descansar();

		Profissional[] novoProfissional = new Profissional[5];
		novoProfissional[0] = pro1;
		novoProfissional[1] = pro2;
		novoProfissional[2] = pro3;
		novoProfissional[3] = pro4;
		novoProfissional[4] = pro5;
		
		Calcado c1 = new Calcado(38, "Nike", "Tenis");
		c1.andar();
		c1.chutar();
		c1.proteger();

		Calcado c2 = new Calcado(39, "Adiddas", "Sandália");
		c2.andar();
		c2.chutar();
		c2.proteger();

		Calcado c3 = new Calcado(35, "Dakota", "Rasteirinha" );
		c3.andar();
		c3.chutar();
		c3.proteger();

		Calcado c4 = new Calcado( 28, "Klin", "Tenis");
		c4.andar();
		c4.chutar();
		c4.proteger();

		Calcado c5 = new Calcado(36, "All Star", "Tenis");
		c5.andar();
		c5.chutar();
		c5.proteger();

		Calcado[] novoCalcado = new Calcado[5];
		novoCalcado[0] = c1;
		novoCalcado[1] = c2;
		novoCalcado[2] = c3;
		novoCalcado[3] = c4;
		novoCalcado[4] = c5;
	}

}
