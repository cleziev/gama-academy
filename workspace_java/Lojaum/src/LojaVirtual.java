
public class LojaVirtual {
	public static void main(String[] args) {
		
		Produto p1, p2, p3;
		
		p1 = new Produto ();
		p2 = new Produto ();
		p3 = new Produto ();	
		
		p1.setCodBarras			(00001);
		p1.setProduto			("Celular 123");
		p1.setPreco				(100.00);
		p1.setDepartamento		("Smartphone");
										
		p2.setCodBarras			(00002);
		p2.setProduto			(" Cal�a");
		p2.setPreco				(50.00);
		p2.setDepartamento		("Roupas");
		
		p3.setCodBarras			(00003);
		p3.setProduto			("Fone");
		p3.setPreco				(10.00);
		p3.setDepartamento		("Acess�rios");
		
		
		p1.imprimir();		
		System.out.println("----->PROMO��O<-----");
		double Descp1 = p1.Desconto(10.0);
		System.out.println("Desconto de 10% = R$ "+Descp1);
		
		p2.imprimir();		
		System.out.println("----->PROMO��O<-----");
		double Descp2 = p2.Desconto(15.0);
		System.out.println("Desconto de 15% = R$ "+Descp2);
		
		
		p3.imprimir();		
		System.out.println("----->PROMO��O<-----");
		double Descp3 = p3.Desconto(50.0);
		System.out.println("Desconto de 50% = R$ "+Descp3);
				
		
					
	}
		
	
	}
