package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameFine {

	private JFrame frmFineGioco;
	int rispV, rispF, domTot, domSaltate;
	private JTextField textFieldDomTot;
	private JTextField textFieldDomSaltate;
	private JTextField textFieldRispV;
	private JTextField textFieldRispF;
	
	public FrameFine(int rispV, int rispF, int domTot, int domSaltate) {
		this.rispV = rispV;
		this.rispF = rispF;
		this.domTot = domTot;
		this.domSaltate = domSaltate;
		this.initialize();
	}

	private void initialize() {
		frmFineGioco = new JFrame();
		frmFineGioco.setTitle("Punteggi");
		frmFineGioco.getContentPane().setBackground(new Color(102, 204, 255));
		frmFineGioco.getContentPane().setLayout(null);
		frmFineGioco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFineGioco.setVisible(true);
		
		JLabel lblQuizzoneTerminato = new JLabel("Quizzone Terminato!");
		lblQuizzoneTerminato.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuizzoneTerminato.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblQuizzoneTerminato.setBounds(10, 11, 323, 46);
		frmFineGioco.getContentPane().add(lblQuizzoneTerminato);
		
		JLabel lblHaiSegnatoI = new JLabel("Hai segnato i seguenti punteggi:");
		lblHaiSegnatoI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHaiSegnatoI.setBounds(10, 68, 208, 25);
		frmFineGioco.getContentPane().add(lblHaiSegnatoI);
		
		JLabel lblDomandeTotali = new JLabel("Domande totali:");
		lblDomandeTotali.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDomandeTotali.setBounds(45, 104, 130, 25);
		frmFineGioco.getContentPane().add(lblDomandeTotali);
		
		JLabel lblDomandeSaltate = new JLabel("Domande saltate:");
		lblDomandeSaltate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDomandeSaltate.setBounds(45, 140, 130, 25);
		frmFineGioco.getContentPane().add(lblDomandeSaltate);
		
		JLabel lblRisposteGiuste = new JLabel("Risposte giuste:");
		lblRisposteGiuste.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRisposteGiuste.setBounds(45, 176, 130, 25);
		frmFineGioco.getContentPane().add(lblRisposteGiuste);
		
		JLabel lblRisposteSbagliate = new JLabel("Risposte sbagliate");
		lblRisposteSbagliate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRisposteSbagliate.setBounds(45, 212, 130, 25);
		frmFineGioco.getContentPane().add(lblRisposteSbagliate);
		
		textFieldDomTot = new JTextField();
		textFieldDomTot.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldDomTot.setBounds(201, 104, 35, 20);
		frmFineGioco.getContentPane().add(textFieldDomTot);
		textFieldDomTot.setColumns(10);
		textFieldDomTot.setEditable(false);
		textFieldDomTot.setText(""+domTot);
		
		textFieldDomSaltate = new JTextField();
		textFieldDomSaltate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldDomSaltate.setBounds(201, 143, 35, 20);
		frmFineGioco.getContentPane().add(textFieldDomSaltate);
		textFieldDomSaltate.setColumns(10);
		textFieldDomSaltate.setEditable(false);
		textFieldDomSaltate.setText(""+domSaltate);
		
		textFieldRispV = new JTextField();
		textFieldRispV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldRispV.setBounds(201, 179, 35, 20);
		frmFineGioco.getContentPane().add(textFieldRispV);
		textFieldRispV.setColumns(10);
		textFieldRispV.setEditable(false);
		textFieldRispV.setText(""+rispV);
		
		textFieldRispF = new JTextField();
		textFieldRispF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFieldRispF.setBounds(201, 215, 35, 20);
		frmFineGioco.getContentPane().add(textFieldRispF);
		textFieldRispF.setColumns(10);
		textFieldRispF.setEditable(false);
		textFieldRispF.setText(""+rispF);
		
		frmFineGioco.setBounds(100, 100, 359, 287);
		frmFineGioco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmFineGioco.setVisible(true);
	}

	public JTextField getTextFieldDomTot() {
		return textFieldDomTot;
	}

	public void setTextFieldDomTot(JTextField textFieldDomTot) {
		this.textFieldDomTot = textFieldDomTot;
	}

	public JTextField getTextFieldDomSaltate() {
		return textFieldDomSaltate;
	}

	public void setTextFieldDomSaltate(JTextField textFieldDomSaltate) {
		this.textFieldDomSaltate = textFieldDomSaltate;
	}

	public JTextField getTextFieldRispV() {
		return textFieldRispV;
	}

	public void setTextFieldRispV(JTextField textFieldRispV) {
		this.textFieldRispV = textFieldRispV;
	}

	public JTextField getTextFieldRispF() {
		return textFieldRispF;
	}

	public void setTextFieldRispF(JTextField textFieldRispF) {
		this.textFieldRispF = textFieldRispF;
	}
	
	
}
