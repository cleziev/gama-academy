
public class Banco {
	
	import javax.swing.JOptionPane;

public static void main(String[] args) {
		
		DadosConta c1, c2;
		
		c1 = new DadosConta();
		c2 = new DadosConta();
		
		c1.setNumeroDaConta(987654);
		c1.setTitular("Jose Capiroto");
		c1.setCPF("250.000.345-20");
		c1.Deposito(1000.00);
		
		System.out.println(c1.exibirDadosConta());
		
		System.out.println(" Sacando R$10,00 ");
				
		if (c1.Saque (10)) {			
			System.out.println(" Saque autorizado ");				
		} 
		else {
			System.out.println(" Sem grana!! Saque n�o autorizado ");
		}

		System.out.println(c1.exibirDadosConta());
			
		c2.setNumeroDaConta(123456);
		c2.setTitular("Maria Capirota");
		c2.setCPF("251.200.345-20");
		c2.Deposito(2000.00);

		System.out.println(c2.exibirDadosConta());
		
	
}

}
