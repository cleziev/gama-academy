
public class Carro {
	
	String marca;
	String modelo;
	int    ano;
	String cor;
	double preco;
	
	void imprimir(){
		System.out.println("----CARRO----");
		System.out.println("Marca: "+marca+" / "+modelo);
		System.out.println("Ano :"+ano+" Cor: "+cor);
		System.out.println("Pre�o: R$: "+preco);
	}
	
	/* todo mestodo � um trecho de c�digo
	 * como todo trecho de c�digo, ele segue tam�m o padr�o E - P - S
	 * 
	 * a declara��o do m�todo � feita da seguinte forma:
	 * 
	 * tipoSaida   nomeMetodo (Lista de parametro de entrada){
	 * .... logica (processamente}
	 */
	
	double calcularIPVA(){
		if (ano < 2000) {
			return 0;
		}
		else {
			return preco * 0.04;
		}
	}

}
