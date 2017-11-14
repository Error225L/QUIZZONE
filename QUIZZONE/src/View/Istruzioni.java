package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Istruzioni {

	private JFrame frmIstruzioni;
	private JScrollPane scrollPane;
	private JButton btnProcedi;
	private JList<String> list;

	public Istruzioni(String ServerOrClient) {
		initialize();
		DefaultListModel<String> model = new DefaultListModel<String>();
		if(ServerOrClient.compareTo("C")==0) {
			model.clear();
			model.addElement("Istruzioni Client: dai una risposta al quesito; ");
			model.addElement("Apparirà una finestra per dirti se hai risposto correttamente o meno;");
			model.addElement("Procedi con la domanda successiva cliccando il pulsante in alto a destra;");
			model.addElement("Se preferisci uscire premi la 'X' e conferma.");
			list.setModel(model);
		}
		if(ServerOrClient.compareTo("S")==0) {
			model.clear();
			model.addElement("Istruzioni Server: inserisci la domanda e completa i campi delle risposte;");
			model.addElement("premi il bottone inserisci;");
			model.addElement("continua ad inserire domande oppure esci premendo la 'X'.");
			model.addElement("Se vuoi generare delle domande Random premi sul bottone con il dado;");
			list.setModel(model);
		}
	}

	private void initialize() {
		frmIstruzioni = new JFrame();
		frmIstruzioni.getContentPane().setBackground(new Color(102, 204, 255));
		frmIstruzioni.setTitle("ISTRUZIONI");
		frmIstruzioni.setBounds(100, 100, 397, 251);
		frmIstruzioni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIstruzioni.getContentPane().setLayout(null);
		frmIstruzioni.setVisible(true);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 361, 156);
		frmIstruzioni.getContentPane().add(scrollPane);
		
		list = new JList<String>();
		scrollPane.setViewportView(list);
		
		btnProcedi = new JButton("Capito!");
		btnProcedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmIstruzioni.dispose();
			}
		});
		btnProcedi.setBounds(143, 178, 89, 23);
		frmIstruzioni.getContentPane().add(btnProcedi);
	}
}
