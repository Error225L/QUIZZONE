package Control;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import Model.GestioneClient;
import View.Finestra;
import View.Istruzioni;

public class ControllerClient implements ActionListener{
	private Finestra f;
	private GestioneClient g;
	DefaultListModel model = new DefaultListModel();
	int cont = 0;
	Color rosso = new Color(255, 0, 0);
	Color verde = new Color(0, 255, 0);
	Color bianco = new Color(255, 255, 255);
	
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
				Object[] options = {"OK"};
				int optPane = JOptionPane.showOptionDialog(null, "HAI INDOVINATO", "GIUSTO", 
						JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				f.getBtnRispTrue().setBackground(verde);
			}
			if(e.getSource()==f.getBtnRispFalse()) {
				Object[] options = {"OK"};
				int optPane = JOptionPane.showOptionDialog(null, "HAI SBAGLIATO !", "SBAGLIATO", 
						JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				f.getBtnRispFalse().setBackground(rosso);
			}
			if(e.getSource()==f.getBtnSucc()) {
				stampaNuovaDomanda();
				g.sendOk();							//passa alla domanda successiva
				f.getBtnRispTrue().setBackground(bianco);
				f.getBtnRispFalse().setBackground(bianco);
			}
			if(e.getSource()==f.getBtnIstruzioni()) {
				Istruzioni i = new Istruzioni("C");
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
		f.getBtnSucc().addActionListener(this);
	}
}
