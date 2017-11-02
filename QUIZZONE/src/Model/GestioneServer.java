package Model;

import java.util.ArrayList;

public class GestioneServer {
	private ArrayList<Domanda> vett;

	public GestioneServer(ArrayList<Domanda> vett) {
		this.vett = vett;
	}
	public GestioneServer() {
		this.vett =new ArrayList<Domanda>();
	}
	public ArrayList<Domanda> getVett() {
		return vett;
	}
	public void setVett(ArrayList<Domanda> vett) {
		this.vett = vett;
	}
}
