
public class IsiCarrosLoja {
	public static void main(String[] args) {
		int a, b, c;
		
		Carro c1, c2;
		
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca = "Porche";
		c1.modelo = "Kaiene";
		c1.cor = "Azul Marinho";
		c1.ano = 2020;
		c1.preco = 125000.00;
		
		c2.marca = "Xevrolet";
		c2.modelo = "C�rsa";
		c2.cor = "Prata e branco";
		c2.ano = 1998;
		c2.preco = 3852.00;
		
		c1.imprimir();
		c2.imprimir();
				
		
		
	}
}