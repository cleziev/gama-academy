package userinterface;

import model.CartaoPrePago;

public class Party {

	public static void main(String[] args) {
		
		CartaoPrePago c1 = new CartaoPrePago ("1234", "Jos�", 2021, 12, 0.0);
	
		System.out.println("Carregar 100,00");
		c1.creditar (100,00);
		System.out.println(c1);
	}
	
}