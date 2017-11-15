package Control;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

import Model.Domanda;
import Model.GestioneClient;
import View.Finestra;
import View.FrameFine;
import View.Istruzioni;

public class ControllerClient implements ActionListener{
	private Finestra f;
	private GestioneClient g;
	private Domanda dTemp = null;
	DefaultListModel<String> model = new DefaultListModel<String>();
	int cont = 0;
	Object[] options = {"OK"};
	int rispV, rispF, domTot, domSaltate;
	
	public ControllerClient(Finestra f, GestioneClient g) throws Exception {
		this.f = f;
		this.g = g;
		f.getFrmQuizzone().setVisible(true);
		this.addingActionListeners();
		int optPane = JOptionPane.showOptionDialog(null, "Iniziamo a giocare!", "Divertiamoci", 
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		stampaNuovaDomanda();
		g.sendOk();	
		rispV = 0;	rispF = 0;	domTot = 0;	domSaltate = 0;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==f.getBtnSx()) {
				this.trueOrFalse(f.getBtnSx().getText(), (JButton)e.getSource());
				stampaNuovaDomanda();
				domTot++;
			}
			if(e.getSource()==f.getBtnDx()) {
				this.trueOrFalse(f.getBtnDx().getText(), (JButton)e.getSource());
				stampaNuovaDomanda();
				domTot++;
			}
			if(e.getSource()==f.getBtnSucc()) {
				int dialogResult = JOptionPane.showConfirmDialog (null, "Voui davvero saltare questa domanda?","Attenzione!",JOptionPane.YES_NO_OPTION);
				if(dialogResult==0) {		
					domSaltate++;
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
			FrameFine frameFine = new FrameFine(rispV, rispF, domTot, domSaltate);
			g.sendClosingOperation();
			f.getFrmQuizzone().dispose();
		}
		else {
			model.clear();
			model.addElement(dTemp.getDomanda());
			f.getList().setModel(model);
			Random random = new Random();
			int n = random.nextInt(10);
			if(n>5) {
				f.getBtnSx().setText(dTemp.getRispostaVera());
				f.getBtnDx().setText(dTemp.getRispostaFalsa());
			} 
			else {
				f.getBtnSx().setText(dTemp.getRispostaFalsa());
				f.getBtnDx().setText(dTemp.getRispostaVera());
			}
			f.getBtnSx().setBackground(Color.WHITE);
			f.getBtnDx().setBackground(Color.WHITE);
			g.sendOk();
		}
	}
	
	private void trueOrFalse(String text, JButton source) {
		if(text.compareTo(dTemp.getRispostaVera())==0) {
			int optPane = JOptionPane.showOptionDialog(null, "HAI INDOVINATO", "GIUSTO", 
					JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			source.setBackground(Color.GREEN);
			rispV++;
		}
		else {
			int optPane = JOptionPane.showOptionDialog(null, "HAI SBAGLIATO !", "SBAGLIATO", 
					JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			source.setBackground(Color.RED);
			rispF++;
		}
	}
	
	private void addingActionListeners() {
		f.getBtnSx().addActionListener(this);
		f.getBtnDx().addActionListener(this);
		f.getBtnIstruzioni().addActionListener(this);
		f.getBtnSucc().addActionListener(this);
	}
}
