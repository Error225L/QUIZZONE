package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Color;
import java.awt.Font;

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
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		initialize();
	}

	private void initialize() {
		frmQuizzone = new JFrame();
		frmQuizzone.getContentPane().setBackground(new Color(135, 206, 250));
		frmQuizzone.setTitle("QUIZZONE");
		frmQuizzone.setBounds(100, 100, 410, 353);
		frmQuizzone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuizzone.getContentPane().setLayout(null);
		
		btnIstruzioni = new JButton("Istruzioni");
		btnIstruzioni.setForeground(Color.DARK_GRAY);
		btnIstruzioni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIstruzioni.setFont(new Font("Vineta BT", Font.PLAIN, 14));
		btnIstruzioni.setBounds(10, 285, 140, 20);
		frmQuizzone.getContentPane().add(btnIstruzioni);
		
		btnInserisci = new JButton("Inserisci");
		btnInserisci.setForeground(Color.BLACK);
		btnInserisci.setFont(new Font("Vineta BT", Font.PLAIN, 14));
		btnInserisci.setBounds(237, 271, 140, 34);
		frmQuizzone.getContentPane().add(btnInserisci);
		
		domanda = new JTextField();
		domanda.setBounds(154, 88, 223, 20);
		frmQuizzone.getContentPane().add(domanda);
		domanda.setColumns(10);
		
		lblDomanda = new JLabel("Domanda:");
		lblDomanda.setForeground(Color.BLUE);
		lblDomanda.setFont(new Font("Vineta BT", Font.PLAIN, 14));
		lblDomanda.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomanda.setBounds(23, 90, 121, 17);
		frmQuizzone.getContentPane().add(lblDomanda);
		
		rispTrue = new JTextField();
		rispTrue.setBounds(154, 187, 223, 20);
		frmQuizzone.getContentPane().add(rispTrue);
		rispTrue.setColumns(10);
		
		rispFalse = new JTextField();
		rispFalse.setBounds(154, 147, 223, 20);
		frmQuizzone.getContentPane().add(rispFalse);
		rispFalse.setColumns(10);
		
		lblRispTrue = new JLabel("V");
		lblRispTrue.setForeground(Color.GREEN);
		lblRispTrue.setFont(new Font("Vineta BT", Font.PLAIN, 20));
		lblRispTrue.setHorizontalAlignment(SwingConstants.CENTER);
		lblRispTrue.setBounds(23, 149, 121, 18);
		frmQuizzone.getContentPane().add(lblRispTrue);
		
		lblRispFalse = new JLabel("F");
		lblRispFalse.setForeground(Color.RED);
		lblRispFalse.setBackground(Color.WHITE);
		lblRispFalse.setFont(new Font("Vineta BT", Font.PLAIN, 20));
		lblRispFalse.setHorizontalAlignment(SwingConstants.CENTER);
		lblRispFalse.setBounds(23, 189, 121, 18);
		frmQuizzone.getContentPane().add(lblRispFalse);	
		
		JLabel lblNewLabel = new JLabel("QUIZZONE");
		lblNewLabel.setFont(new Font("Vineta BT", Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 11, 162, 46);
		frmQuizzone.getContentPane().add(lblNewLabel);
	}


	public JFrame getFrmQuizzone() {
		return frmQuizzone;
	}


	public void setFrmQuizzone(JFrame frmQuizzone) {
		this.frmQuizzone = frmQuizzone;
	}


	public JButton getBtnIstruzioni() {
		return btnIstruzioni;
	}


	public void setBtnIstruzioni(JButton btnIstruzioni) {
		this.btnIstruzioni = btnIstruzioni;
	}


	public JButton getBtnInserisci() {
		return btnInserisci;
	}


	public void setBtnInserisci(JButton btnInserisci) {
		this.btnInserisci = btnInserisci;
	}


	public JTextField getDomanda() {
		return domanda;
	}


	public void setDomanda(JTextField domanda) {
		this.domanda = domanda;
	}


	public JTextField getRispTrue() {
		return rispTrue;
	}


	public void setRispTrue(JTextField rispTrue) {
		this.rispTrue = rispTrue;
	}


	public JTextField getRispFalse() {
		return rispFalse;
	}


	public void setRispFalse(JTextField rispFalse) {
		this.rispFalse = rispFalse;
	}
}
