package Conta;

public class ContaEspecial extends Dados {
	private double limite;
	
	public boolean debitar(double valor) {
		if (saldo + limite >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Conta Especial: "+conta+
				"\nLimite R$: " +String.format("%.2f",limite);
	}
	
	

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	
}
