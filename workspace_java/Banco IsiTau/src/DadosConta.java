
public class DadosConta {

	private int NumeroDaConta;
	private String Titular;
	private String CPF;
	private double Saldo;

	public int getNumeroDaConta() {
		return NumeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		NumeroDaConta = numeroDaConta;
	}

	public String getTitula() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public double getSaldo() {
		return Saldo;
	}

	public String exibirDadosConta() {
		String resultado = "N�mero da Conta " + NumeroDaConta + " \nTitular: " + Titular + " \nCPF: " + CPF
				+ "\nSaldo: R$ " + String.format ("%.2f",Saldo);
		return resultado;

	}

	public void Deposito(double VDepositado) {
		Saldo = Saldo + VDepositado;
	}

	public boolean Saque(double VSaque) {
		if (Saldo >= VSaque) {
			Saldo = Saldo - VSaque;
			return true;
		} else {
			return false;

		}
	}
}
