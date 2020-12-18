package core;

public class BDMySQL implements InterfaceBD{

	@Override
	public void conectar(String bd, String usuario) {
	System.out.println("Conectando BD");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("executando");
		
	}

	@Override
	public void desconectar(String bd) {
		System.out.println("Desconentando BD");
		
	}
	
	

	
	
	
}
