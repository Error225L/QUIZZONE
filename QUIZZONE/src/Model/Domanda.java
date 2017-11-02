package Model;

public class Domanda {
	private String domanda;
	private boolean risposta;
	
	public Domanda(String domanda, boolean risposta) {
		this.domanda = domanda;
		this.risposta = risposta;
	}
	public String getDomanda() {
		return domanda;
	}
	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}
	public boolean isRisposta() {
		return risposta;
	}
	public void setRisposta(boolean risposta) {
		this.risposta = risposta;
	}
	@Override
	public String toString() {
		return "Domanda [domanda=" + domanda + ", risposta=" + risposta + "]";
	}
	
}
