package Control;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

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
		try {
			if(e.getSource()==f.getBtnRispTrue()) {
				stampaNuovaDomanda();
				Object[] options = {"OK"};
				int optPane = JOptionPane.showOptionDialog(null, "Stai per procedere alla domanda successiva", "ATTENZIONE", 
						JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				g.sendOk();
			}
			if(e.getSource()==f.getBtnRispFalse()) {
				stampaNuovaDomanda();
				g.sendOk();
			}
			if(e.getSource()==f.getBtnIstruzioni()) {
				
			}
		}catch(Exception e1) {
		}
	}
	
	private void stampaNuovaDomanda() {
		model.clear();
		model.addElement(g.getNewDomanda().getDomanda());
		f.getList().setModel(model);
		f.getBtnRispTrue().setText(g.getRispVera());
		f.getBtnRispFalse().setText(g.getRispFalsa());;
	}
	
	private void addingActionListeners() {
		f.getBtnRispTrue().addActionListener(this);
		f.getBtnRispFalse().addActionListener(this);
		f.getBtnIstruzioni().addActionListener(this);
	}
}
