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

import Model.Domanda;
import Model.GestioneClient;
import View.Finestra;
import View.Istruzioni;

public class ControllerClient implements ActionListener{
	private Finestra f;
	private GestioneClient g;
	private Domanda dTemp = null;
	DefaultListModel<String> model = new DefaultListModel<String>();
	int cont = 0;
	Object[] options = {"OK"};
	
	public ControllerClient(Finestra f, GestioneClient g) throws Exception {
		this.f = f;
		this.g = g;
		f.getFrmQuizzone().setVisible(true);
		this.addingActionListeners();
		int optPane = JOptionPane.showOptionDialog(null, "Iniziamo a giocare!", "Divertiamoci", 
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		stampaNuovaDomanda();
		g.sendOk();	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==f.getBtnRispTrue()) {
				f.getBtnRispTrue().setBackground(Color.GREEN);
				int optPane = JOptionPane.showOptionDialog(null, "HAI INDOVINATO", "GIUSTO", 
						JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				stampaNuovaDomanda();
			}
			if(e.getSource()==f.getBtnRispFalse()) {
				f.getBtnRispFalse().setBackground(Color.RED);
				int optPane = JOptionPane.showOptionDialog(null, "HAI SBAGLIATO !", "SBAGLIATO", 
						JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				stampaNuovaDomanda();
			}
			if(e.getSource()==f.getBtnSucc()) {
				int dialogResult = JOptionPane.showConfirmDialog (null, "Voui davvero saltare questa domanda?","Attenzione!",JOptionPane.YES_NO_OPTION);
				if(dialogResult==0) {		
					stampaNuovaDomanda();
				}
			}
			if(e.getSource()==f.getBtnIstruzioni()) {
				Istruzioni i = new Istruzioni("C");
			}
		}catch(Exception e1) {
		}
	}
	
	private void stampaNuovaDomanda() throws IOException, InterruptedException {
		dTemp = g.getNewDomanda();
		if(dTemp.getDomanda().compareTo("Domande_Finite")==0) {
			int optPane = JOptionPane.showOptionDialog(null, "Sono terminate le domande! Se vuoi continuare chiedi al gestore del server di aggiungerne altre.", "ATTENZIONE", 
					JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			while(dTemp.getDomanda().compareTo("Domande_Finite")==0) {
				Thread.sleep(750);
				g.sendNotOk();
				dTemp = g.getNewDomanda();
			}
		}
		else {
			model.clear();
			model.addElement(dTemp.getDomanda());
			f.getList().setModel(model);
			f.getBtnRispTrue().setText(dTemp.getRispostaVera());
			f.getBtnRispFalse().setText(dTemp.getRispostaFalsa());;
			f.getBtnRispTrue().setBackground(Color.WHITE);
			f.getBtnRispFalse().setBackground(Color.WHITE);
			g.sendOk();
		}
	}
	
	private void addingActionListeners() {
		f.getBtnRispTrue().addActionListener(this);
		f.getBtnRispFalse().addActionListener(this);
		f.getBtnIstruzioni().addActionListener(this);
		f.getBtnSucc().addActionListener(this);
	}
}
