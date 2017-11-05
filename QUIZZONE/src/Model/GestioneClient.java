package Model;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class GestioneClient{
	DefaultListModel model = new DefaultListModel();

	public DefaultListModel getNewDomanda(int n) {
		//Richiesta al server della domanda "n" dell'arrayList domande
		//La domanda viene inviata tramite 3 stringhe, le stringhe vengono
		//Il model viene tornato al ControllerClient che le stampa
		return model;
	}
	
	
	
}
