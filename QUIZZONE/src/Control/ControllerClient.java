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
			
			stampaNuovaDomanda();
		}
		if(e.getSource()==f.getBtnRispFalse()) {
			stampaNuovaDomanda();
		}
		if(e.getSource()==f.getBtnIstruzioni()) {
			
		}
	}
	
	private void stampaNuovaDomanda() {
		model.clear();
		model.addElement(g.getNewDomanda().getDomanda());
		f.getList().setModel(model);
	}
	
	private void addingActionListeners() {
		f.getBtnRispTrue().addActionListener(this);
		f.getBtnRispFalse().addActionListener(this);
		f.getBtnIstruzioni().addActionListener(this);
	}
}
