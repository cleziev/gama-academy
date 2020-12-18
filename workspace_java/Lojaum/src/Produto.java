
public class Produto {

	private	int		CodBarras;
	private	String  Produto;
	private	double	Preco;
	private	String	Departamento;
	
	
	
	public int getCodBarras() {
		return CodBarras;
	}

	public void setCodBarras(int codBarras) {
		CodBarras = codBarras;
	}

	public String getProduto() {
		return Produto;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	void imprimir () {
		System.out.println("Código de Barras : "+CodBarras);
		System.out.println("Produto : "+Produto);
		System.out.println("Valor : R$ "+Preco);
		System.out.println("Departamento: "+Departamento);

	}
	
		double Desconto(double percentual) {
			
			return Preco - Preco*percentual/100;
		
			
					
	}

	
}
