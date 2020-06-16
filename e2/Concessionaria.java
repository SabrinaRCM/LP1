package e2;

import java.util.*;
import javax.swing.JOptionPane;

public class Concessionaria {
	

	public static void main(String args[]) {
		
		ArrayList<Carro> Carros = new ArrayList<Carro>();
		Carro Carro;
		
		Carros.add(new Carro("Vermelho", "Gol", "VW", 1993, "DBZ0339", 12.000));
		Carros.add(new Carro("Branco", "Palio", "Fiat", 2006, "AUV0234", 15.000));
		Carros.add(new Carro("Preto", "Celta", "Fiat", 2009, "CEU1234", 16.000));
		Carros.add(new Carro("Amarelo", "Uno", "Fiat", 2005, "AOC0987", 20.000));
		Carros.add(new Carro("Prata", "Golf", "VW", 1999, "GDB5678", 25.000));
	
		Set<Carro> conjunto = new HashSet<Carro>();
		
		conjunto.add(new Carro("Vermelho", "Gol", "VW", 1993, "DBZ0339", 12.000));
		conjunto.add(new Carro("Branco", "Palio", "Fiat", 2006, "AUV0234", 15.000));
		conjunto.add(new Carro("Preto", "Celta", "Fiat", 2009, "CEU1234", 16.000));
		conjunto.add(new Carro("Amarelo", "Uno", "Fiat", 2005, "AOC0987", 20.000));
		conjunto.add(new Carro("Prata", "Golf", "VW", 1999, "GDB5678", 25.000));
		  
        Map<String, Carro> Concessionaria = new HashMap<String, Carro>();
         
       for(Carro car : Carros) {
    	   Concessionaria.put(car.getPlaca(), car);
       }

         
        String key = JOptionPane.showInputDialog("Digite a placa deste carro ");
        Carro  = Concessionaria.get(key);
        System.out.println(key + " = " + Carro.getCor() + ", " + Carro.getMarca() + ", " + Carro.getModelo() + ", " + Carro.getAno());
        System.out.println(key + " = " + "Valor: R$" + Carro.getValor() + " mil");
        
      
  }
}
