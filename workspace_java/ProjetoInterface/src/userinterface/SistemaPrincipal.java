package userinterface;

import core.InterfaceBD;
import core.BDMySQL;

public class SistemaPrincipal {
	
	public static void main(String[] args) {
		
		InterfaceBD ibd;
		ibd = new BDMySQL();
		
		ibd.conectar("Teste", "usu�rio");
		ibd.comando("Select from tabela");
		ibd.desconectar("banco");
	}

}