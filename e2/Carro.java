package e2;

import java.util.ArrayList;


public class Carro {
	
	private String cor;
	private String modelo;
	private String marca;
	private int ano;
	private String placa;
	private double valor;
	
	
	 public Carro(String cor, String modelo,String marca, int ano, String placa, double valor){
		  
		 this.cor=cor;
		 this.modelo=modelo;
		 this.marca=marca;
		 this.ano=ano;
		 this.placa=placa; 
		 this.valor=valor;
	   }

	
	//setters
	public void setCor(String cor) {
		this.cor = cor;
	}

	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	 
	//getters
	public String getCor() {
		return cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}


	public int getAno() {
		return ano;
	}


	public String getPlaca() {
		return placa;
	}
	
	public double getValor() {
		return valor;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Carro> Carros = new ArrayList<Carro>();
		//Carro Carro;
		
		Carros.add(new Carro("Vermelho", "Gol", "VW", 1993, "DBZ0339", 12.000));
		Carros.add(new Carro("Branco", "Palio", "Fiat", 2006, "AUV0234", 15.000));
		Carros.add(new Carro("Preto", "Celta", "Fiat", 2009, "CEU1234", 16.000));
		Carros.add(new Carro("Amarelo", "Uno", "Fiat", 2005, "AOC0987", 20.000));
		Carros.add(new Carro("Prata", "Golf", "VW", 1999, "GDB5678", 25.000));
		
		//Teste
		//for(int i=0;i<Carros.size();i++) {
		//	Carro=(Carro)Carros.get(i);
		//	System.out.println("A cor do carro é: " + Carro.getCor());
		//}
		
	}


}
