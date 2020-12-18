package model;

public class Horista extends Funcionario {

	private double 	valorHora;
	private int		numHoras;
	
	public Horista(int numRegistro, String nome, double valorHora, int numHoras) {
		super(numRegistro, nome);
		this.valorHora = valorHora;
		this.numHoras = numHoras;
	}
	
	
	
	
	
}
