
public class Empregado {
	
	String Nome;
	String Cargo;
	double Salario;
	
	void imprimir () {
		System.out.println("Empregado : "+Nome);
		System.out.println("Cargo : "+Cargo);
		System.out.printf("Salario R$ %.2f%n",+Salario);

	}
	
	void aumentarSalario(double percentual) {
		Salario = Salario + Salario*percentual/100;		
	}

	
}
