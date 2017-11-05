package Model;

public class Domanda {
	private String domanda, rispostaVera, rispostaFalsa;

	public Domanda(String domanda, String rispostaVera, String rispostaFalsa) {
		this.domanda = domanda;
		this.rispostaVera = rispostaVera;
		this.rispostaFalsa = rispostaFalsa;
	}

	public String getDomanda() {
		return domanda;
	}

	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	public String getRispostaVera() {
		return rispostaVera;
	}

	public void setRispostaVera(String rispostaVera) {
		this.rispostaVera = rispostaVera;
	}

	public String getRispostaFalsa() {
		return rispostaFalsa;
	}

	public void setRispostaFalsa(String rispostaFalsa) {
		this.rispostaFalsa = rispostaFalsa;
	}

	@Override
	public String toString() {
		return "Domanda domanda=" + domanda + ", rispostaVera=" + rispostaVera + ", rispostaFalsa=" + rispostaFalsa;
	}
	
	
}
