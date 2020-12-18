package model;

public class Comissionado extends Funcionario{
	
	private double salarioBase;
	private double comissao;
	
	
	public Comissionado(int numRegistro, String nome, float salarioBase, float comissao) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	
	
	
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}




	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	}
