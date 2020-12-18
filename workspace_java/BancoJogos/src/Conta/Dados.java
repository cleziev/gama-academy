package Conta;

public class Dados {

	protected String nome;
	protected String cpf;
	protected int conta;
	protected double saldo;

	protected float debitar;
	protected float creditar;

	public void creditar(double valor) {
		this.saldo += valor;
	}

	public boolean debitar(double valor) {
		if (this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public String toString() {
		return "Nome: " + nome + " \nCPF: " + cpf + "\nConta: " + conta + "\nSaldo: R$ " + String.format("%.2f", saldo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public float getDebitar() {
		return debitar;
	}

	public void setDebitar(float debitar) {
		this.debitar = debitar;
	}

	public float getCreditar() {
		return creditar;
	}

	public void setCreditar(float creditar) {
		this.creditar = creditar;
	}

	public double getSaldo() {
		return saldo;
	}
}
