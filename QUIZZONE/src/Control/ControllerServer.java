package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.GestioneServer;

public class ControllerServer implements ActionListener{
	//private FinestraServer f;
	private GestioneServer g;
	
	public ControllerServer(/* FinestraServer f, */ GestioneServer g) {
		this.g = g;
		/* this.f = f; 
		 * f.getFrame().setVisible(true);*/
		
	}

	/*
	 * public FinestraServer getF() { return f; } public void
	 * setF(FinestraServer f) { this.f = f; }
	 */
	public GestioneServer getG() {
		return g;
	}

	public void setG(GestioneServer g) {
		this.g = g;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
