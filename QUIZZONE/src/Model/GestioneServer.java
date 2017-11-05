package Model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GestioneServer extends ArrayList<Domanda> {
	
	private ArrayList<Domanda> domande;
	
	public GestioneServer() {
		this.domande = new ArrayList<Domanda>();
	}
	
	public void insNuovaDomanda(Domanda nuovaDomanda) {
		domande.add(nuovaDomanda);
		Object[] options = {"OK"};
		int optPane = JOptionPane.showOptionDialog(null, "Domanda inserita correttamente nell'archivio!", "Operazione eseguita", 
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	}
	
	public ArrayList<Domanda> getVett() {
		return domande;
	}
	
	public void setVett(ArrayList<Domanda> vett) {
		this.domande = vett;
	}
}
