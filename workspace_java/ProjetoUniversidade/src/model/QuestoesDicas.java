package model;

public class QuestoesDicas extends QuestoesSimples {

	private String dica;
	
	public QuestoesDicas(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}
	
	public String aplicarQuestao() {
		return "Q: "+super.enunciado+
				"\n   DICA: "+this.dica;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	
	
}