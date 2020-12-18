package model;

	public class CashBack extends CartaoPrePago{
		
		private int modelo;
		
		
		public CashBack(String numCartao, String nomeTitular, int anoValidade, int mesValidade, int modelo, double saldo) {
			super(numCartao, nomeTitular, anoValidade, mesValidade, saldo);
			this.modelo = modelo;
		}

		
		public boolean comprar(double valor) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				if (modelo == 0){
					super.saldo += valor * 0.08;  //recompensa cartao gold
					
				}
				else if(modelo == 1) {
					super.saldo+=valor*0.05;	//recompesa cartao silver
				}
				else if(modelo == 2) {
					super.saldo+=valor*0.02;	// recompensa cartao bronze
		}
			return true;
		}
			return false;
	}
		
		
		public int getModelo() {
			return modelo;
		}

		public void setModelo(int modelo) {
			this.modelo = modelo;
		}
		
	}	
