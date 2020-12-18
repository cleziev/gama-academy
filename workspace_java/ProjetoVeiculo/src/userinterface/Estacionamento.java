package userinterface;

import model.Carro;
import model.Veiculo;
import model.Moto;


public class Estacionamento {
	public static void main(String[] args) {
		Veiculo v1, v2;
		
		v1 = new Carro ("FIAT", "ABC3456", "URBANO");
		v2 = new Moto ("CG125", "XYX123","SUPERBIKE");
		
		v1.acelerar();
		v1.freiar();
		
		v2.acelerar();
		v2.freiar();
	}
	
		
	}