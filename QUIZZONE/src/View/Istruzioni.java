package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Istruzioni {

	private JFrame frmIstruzioni;
	private JScrollPane scrollPane;
	private JButton btnProcedi;
	private JList list;

	public Istruzioni(String ServerOrClient) {
		initialize();
		DefaultListModel model = new DefaultListModel();
		if(ServerOrClient.compareTo("C")==0) {
			model.clear();
			model.addElement("Istruzioni Client: dai una risposta al quesito; "
					+ "\n Apparirà una finestra per dirti se hai risposto correttamente o meno;"
					+ "\n Procedi con la domanda successiva cliccando il pulsante in alto a destra;"
					+ "\n Se preferisci uscire premi la 'X' e conferma.");
			list.setModel(model);
		}
		if(ServerOrClient.compareTo("S")==0) {
			model.clear();
			model.addElement("Istruzioni Server: inserisci la domanda e completa i campi delle risposte;"
					+ "\n premi il bottone inserisci;"
					+ "\n continua ad inserire domande oppure esci premendo la 'X'.");
			list.setModel(model);
		}
	}

	private void initialize() {
		frmIstruzioni = new JFrame();
		frmIstruzioni.setTitle("ISTRUZIONI");
		frmIstruzioni.setBounds(100, 100, 375, 250);
		frmIstruzioni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIstruzioni.getContentPane().setLayout(null);
		frmIstruzioni.setVisible(true);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 339, 156);
		frmIstruzioni.getContentPane().add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		btnProcedi = new JButton("Capito!");
		btnProcedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmIstruzioni.dispose();
			}
		});
		btnProcedi.setBounds(131, 178, 89, 23);
		frmIstruzioni.getContentPane().add(btnProcedi);
	}
}
