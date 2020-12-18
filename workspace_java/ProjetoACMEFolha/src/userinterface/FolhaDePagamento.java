package userinterface;

import model.Chefe;
import model.Comissionado;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {

		Funcionario lista[];
		
		lista= new Funcionario[4];
		
		f[0] = new Empreiteio		("File", 1345, 1000.00);
		f[1] = new Horista			("Edit", 0987, 20.0,5);
		f[2] = new Comissionado		("Source", 7654, 30.0,5);
		f[3] = new Chefe			("Refactor", 1470, 50.0,5);
		
		for (int pos=0; pos(f.length;pos++)) {
			System.out.println("Salario do "+f[pos].getNome()+" R$: "+f[pos].calcularSalario());
		}

		System.out.println();
	}
}
