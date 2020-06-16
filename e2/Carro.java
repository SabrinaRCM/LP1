package e2;

import java.util.ArrayList;


public class Carro {
	
	private String cor;
	private String modelo;
	private String marca;
	private int ano;
	private String placa;
	
	
	 public Carro(String cor, String modelo,String marca, int ano, String placa){
		  
		 this.cor=cor;
		 this.modelo=modelo;
		 this.marca=marca;
		 this.ano=ano;
		 this.placa=placa; 
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
	
	
	public static void main(String[] args) {
		
		ArrayList<Carro> Carros = new ArrayList<Carro>();
		//Carro Carro;
		
		Carros.add(new Carro("Vermelho", "Gol", "VW", 1993, "DBZ0339"));
		Carros.add(new Carro("Branco", "Palio", "Fiat", 2006, "AUV0234"));
		Carros.add(new Carro("Preto", "Celta", "Fiat", 2009, "CEU1234"));
		Carros.add(new Carro("Amarelo", "Uno", "Fiat", 2005, "AOC0987"));
		Carros.add(new Carro("Prata", "Golf", "VW", 1999, "GDB5678"));
		
		//Teste
		//for(int i=0;i<Carros.size();i++) {
		//	Carro=(Carro)Carros.get(i);
		//	System.out.println("A cor do carro é: " + Carro.getCor());
		//}
		
	}


}
