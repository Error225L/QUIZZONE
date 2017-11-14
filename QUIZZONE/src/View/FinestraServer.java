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
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

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
	private JButton btnAggDomPredef;

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
		frmQuizzone.setResizable(false);
		frmQuizzone.getContentPane().setBackground(new Color(135, 206, 250));
		frmQuizzone.setTitle("QUIZZONE");
		frmQuizzone.setBounds(100, 100, 410, 353);
		frmQuizzone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuizzone.getContentPane().setLayout(null);
		
		btnIstruzioni = new JButton("");
		btnIstruzioni.setIcon(new ImageIcon(FinestraServer.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		btnIstruzioni.setForeground(Color.DARK_GRAY);
		btnIstruzioni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIstruzioni.setFont(new Font("Vineta BT", Font.PLAIN, 14));
		btnIstruzioni.setBounds(10, 271, 29, 34);
		frmQuizzone.getContentPane().add(btnIstruzioni);
		
		btnInserisci = new JButton("Inserisci");
		btnInserisci.setForeground(Color.BLACK);
		btnInserisci.setFont(new Font("Vineta BT", Font.PLAIN, 14));
		btnInserisci.setBounds(237, 271, 140, 34);
		frmQuizzone.getContentPane().add(btnInserisci);
		
		domanda = new JTextField();
		domanda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		domanda.setBounds(154, 88, 223, 24);
		frmQuizzone.getContentPane().add(domanda);
		domanda.setColumns(10);
		
		lblDomanda = new JLabel("Domanda:");
		lblDomanda.setForeground(Color.BLUE);
		lblDomanda.setFont(new Font("Vineta BT", Font.PLAIN, 15));
		lblDomanda.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomanda.setBounds(23, 90, 121, 17);
		frmQuizzone.getContentPane().add(lblDomanda);
		
		rispTrue = new JTextField();
		rispTrue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rispTrue.setBounds(154, 149, 223, 24);
		frmQuizzone.getContentPane().add(rispTrue);
		rispTrue.setColumns(10);
		
		rispFalse = new JTextField();
		rispFalse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rispFalse.setBounds(154, 189, 223, 24);
		frmQuizzone.getContentPane().add(rispFalse);
		rispFalse.setColumns(10);
		
		lblRispTrue = new JLabel("V");
		lblRispTrue.setToolTipText("");
		lblRispTrue.setForeground(Color.GREEN);
		lblRispTrue.setFont(new Font("Vineta BT", Font.ITALIC, 18));
		lblRispTrue.setHorizontalAlignment(SwingConstants.CENTER);
		lblRispTrue.setBounds(23, 152, 121, 18);
		frmQuizzone.getContentPane().add(lblRispTrue);
		
		lblRispFalse = new JLabel("F");
		lblRispFalse.setForeground(Color.RED);
		lblRispFalse.setBackground(Color.WHITE);
		lblRispFalse.setFont(new Font("Vineta BT", Font.ITALIC, 18));
		lblRispFalse.setHorizontalAlignment(SwingConstants.CENTER);
		lblRispFalse.setBounds(23, 192, 121, 18);
		frmQuizzone.getContentPane().add(lblRispFalse);	
		
		JLabel lblNewLabel = new JLabel("QUIZZONE");
		lblNewLabel.setFont(new Font("Vineta BT", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(117, 11, 162, 46);
		frmQuizzone.getContentPane().add(lblNewLabel);
		
		btnAggDomPredef = new JButton("");
		btnAggDomPredef.setForeground(Color.WHITE);
		btnAggDomPredef.setIcon(new ImageIcon("C:\\Users\\Alunno\\git\\QUIZZONE\\QUIZZONE\\src\\dice.png"));
		btnAggDomPredef.setBounds(49, 271, 29, 34);
		frmQuizzone.getContentPane().add(btnAggDomPredef);
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


	public JButton getBtnAggDomPredef() {
		return btnAggDomPredef;
	}

	
	public void setBtnAggDomPredef(JButton btnAggDomPredef) {
		this.btnAggDomPredef = btnAggDomPredef;
	}
}
