package Control;

import javax.swing.DefaultListModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.GestioneClient;
import View.Finestra;

public class ControllerClient implements ActionListener{
	private Finestra f;
	private GestioneClient g;
	DefaultListModel model = new DefaultListModel();
	int cont = 0;
	
	public ControllerClient(Finestra f, GestioneClient g) {
		this.f = f;
		this.g = g;
		f.getFrmQuizzone().setVisible(true);
		this.addingActionListeners();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==f.getBtnRispTrue()) {
			
		}
		if(e.getSource()==f.getBtnRispFalse()) {
			
		}
		if(e.getSource()==f.getBtnIstruzioni()) {
			
		}
	}
	
	public void stampaNuovaDomanda(int cont) {
		f.getList().setModel(g.getNewDomanda(cont));
	}
	
	private void addingActionListeners() {
		f.getBtnRispTrue().addActionListener(this);
		f.getBtnRispFalse().addActionListener(this);
		f.getBtnIstruzioni().addActionListener(this);
	}
}
