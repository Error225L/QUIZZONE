package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Domanda;
import Model.GestioneServer;
import View.FinestraServer;
import View.Istruzioni;

public class ControllerServer implements ActionListener{
	private FinestraServer f;
	private GestioneServer g;
	
	public ControllerServer(FinestraServer f, GestioneServer g) {
		this.g = g;
		this.f = f; 
		f.getFrmQuizzone().setVisible(true);
		this.addingActionListeners();
		Thread t=new Thread(this.g);
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==f.getBtnInserisci()) {
			if(this.controls()) {								//Se passano i controlli
				g.insNuovaDomanda(this.nuovaDomanda());
				this.clear();
			}
		}
		if(e.getSource()==f.getBtnIstruzioni()) {
			Istruzioni i = new Istruzioni("S");
		}
	}
	
	private Domanda nuovaDomanda() {
		Domanda d;
		String domanda = f.getDomanda().getText();
		String rispostaVera = f.getRispTrue().getText();
		String rispostaFalsa = f.getRispFalse().getText();
		return d = new Domanda(domanda, rispostaVera, rispostaFalsa);
	}
	
	private boolean controls() {
		Object[] options = {"OK"};
		int flag=1;
		String title = "Operazione Fallita";
		if(f.getDomanda().getText().compareTo("")==0) {
			int optPane = JOptionPane.showOptionDialog(null, "INSERISCI UNA DOMANDA!!!", title, 
					JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			return false;
		}
		else {
			if(f.getRispTrue().getText().compareTo("")==0) {
				int optPane = JOptionPane.showOptionDialog(null, "INSERISCI UNA RISPOSTA VERA!!!", title, 
						JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				return false;
			}
			else {
				if(f.getRispFalse().getText().compareTo("")==0) {
					int optPane = JOptionPane.showOptionDialog(null, "INSERISCI UNA RISPOSTA FALSA!!!", title, 
							JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
					return false;
				}
				else {
					return true;
				}
			}
		}
	}
	
	private void addingActionListeners() {
		f.getBtnInserisci().addActionListener(this);
		f.getBtnIstruzioni().addActionListener(this);
	}
	
	private void clear() {
		f.getDomanda().setText(null);
		f.getRispTrue().setText(null);
		f.getRispFalse().setText(null);
	}
}
