package model;

public class QuestoesSimples {
	protected String enunciado;
	protected String resposta; // gabarito
	
	
	public QuestoesSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return "Q: "+enunciado;
	}
	
	public boolean corrigir(String respUsuario) {
		return resposta.equals(respUsuario);
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	

}