package Conta;

public class Banco {
	public static void main(String[] args) {
		
		Dados c1 = new Dados();
		
				
		c1.setConta(122445);
		c1.setNome("Jose");
		c1.setCpf("123.456.789-10");
		
		System.out.println(c1);
		
		ContaEspecial c2 = new ContaEspecial();
		
		c2.setNome("joao");
		c2.setConta(87566);
		c2.setCpf("123.345.456-10");
		c2.setLimite(331);
		
		System.out.println(c2);
	
		
		if (c1.debitar(221)) {
			System.out.println("Debito autorizado na conta "+c1.getConta());
		}
		else {
			System.out.println("Saldo insuficiente na conta "+c1.getConta());
		}
		
		System.out.println(c1);
		
		if (c2.debitar(114)) {
			System.out.println("Debito autorizado na conta "+c2.getConta());
		}
		else {
			System.out.println("Saldo insuficiente na conta "+c2.getConta());
		}
}
}
