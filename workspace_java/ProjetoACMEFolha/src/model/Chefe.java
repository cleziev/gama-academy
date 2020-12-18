package model;

public class Chefe extends Funcionario {
	
	protected double salarioBase;
	protected double adicionalFuncao;
	protected double beneficioTerno;
	
	
	public Chefe(int numRegistro, String nome, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}


	public float getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}


	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}


	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}


	public float getBeneficioTerno() {
		return beneficioTerno;
	}


	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
		public double calcularSalario() {
			return salarioBase * salarioBase * 
		}
}
