package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FinestraServer {

	private JFrame frmQuizzone;
	private JButton btnIstruzioni;
	private JButton btnInserisci;
	private JTextField domanda;
	private JLabel lblDomanda;
	private JTextField rispTrue;
	private JTextField rispFalse;
	private JLabel lblRispTrue;
	private JLabel lblRispFalse;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraServer window = new FinestraServer();
					window.frmQuizzone.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FinestraServer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizzone = new JFrame();
		frmQuizzone.setTitle("QUIZZONE");
		frmQuizzone.setBounds(100, 100, 600, 400);
		frmQuizzone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuizzone.getContentPane().setLayout(null);
		
		btnIstruzioni = new JButton("Istruzioni");
		btnIstruzioni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIstruzioni.setBounds(10, 327, 89, 23);
		frmQuizzone.getContentPane().add(btnIstruzioni);
		
		btnInserisci = new JButton("Inserisci");
		btnInserisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInserisci.setBounds(462, 316, 112, 34);
		frmQuizzone.getContentPane().add(btnInserisci);
		
		domanda = new JTextField();
		domanda.setBounds(221, 45, 265, 20);
		frmQuizzone.getContentPane().add(domanda);
		domanda.setColumns(10);
		
		lblDomanda = new JLabel("Aggiungi una domanda:");
		lblDomanda.setHorizontalAlignment(SwingConstants.LEFT);
		lblDomanda.setBounds(10, 48, 201, 17);
		frmQuizzone.getContentPane().add(lblDomanda);
		
		rispTrue = new JTextField();
		rispTrue.setBounds(221, 85, 265, 20);
		frmQuizzone.getContentPane().add(rispTrue);
		rispTrue.setColumns(10);
		
		rispFalse = new JTextField();
		rispFalse.setBounds(221, 125, 265, 20);
		frmQuizzone.getContentPane().add(rispFalse);
		rispFalse.setColumns(10);
		
		lblRispTrue = new JLabel("Risposta vera:");
		lblRispTrue.setHorizontalAlignment(SwingConstants.CENTER);
		lblRispTrue.setBounds(10, 88, 201, 17);
		frmQuizzone.getContentPane().add(lblRispTrue);
		
		lblRispFalse = new JLabel("Risposta falsa:");
		lblRispFalse.setHorizontalAlignment(SwingConstants.CENTER);
		lblRispFalse.setBounds(10, 128, 201, 17);
		frmQuizzone.getContentPane().add(lblRispFalse);
	}
}
