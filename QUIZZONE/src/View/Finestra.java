package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Finestra {

	private JFrame frmQuizzone;
	private JButton btnRispTrue;
	private JButton btnRispFalse;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnIstruzioni;
	private JLabel lblDomanda;
	private JButton btnSucc;
	
	public Finestra() {
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
		
		btnRispTrue = new JButton("New button");
		btnRispTrue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRispTrue.setBounds(33, 258, 150, 46);
		frmQuizzone.getContentPane().add(btnRispTrue);
		
		btnRispFalse = new JButton("New button");
		btnRispFalse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRispFalse.setBounds(204, 258, 150, 46);
		frmQuizzone.getContentPane().add(btnRispFalse);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 140, 374, 107);
		frmQuizzone.getContentPane().add(scrollPane);
		
		list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setViewportView(list);
		
		
		btnIstruzioni = new JButton("");
		btnIstruzioni.setIcon(new ImageIcon(Finestra.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		btnIstruzioni.setBounds(10, 11, 29, 33);
		frmQuizzone.getContentPane().add(btnIstruzioni);
		
		lblDomanda = new JLabel("DOMANDA");
		lblDomanda.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomanda.setFont(new Font("Vineta BT", Font.PLAIN, 20));
		lblDomanda.setBounds(115, 11, 172, 46);
		frmQuizzone.getContentPane().add(lblDomanda);
		
		btnSucc = new JButton("");
		btnSucc.setIcon(new ImageIcon(Finestra.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnSucc.setFont(new Font("Viner Hand ITC", Font.PLAIN, 15));
		btnSucc.setBounds(355, 14, 29, 30);
		frmQuizzone.getContentPane().add(btnSucc);
	}

	public JFrame getFrmQuizzone() {
		return frmQuizzone;
	}

	public void setFrmQuizzone(JFrame frmQuizzone) {
		this.frmQuizzone = frmQuizzone;
	}

	public JButton getBtnRispTrue() {
		return btnRispTrue;
	}
	

	public void setBtnRispTrue(JButton btnRispTrue) {
		this.btnRispTrue = btnRispTrue;
	}

	public JButton getBtnRispFalse() {
		return btnRispFalse;
	}

	public void setBtnRispFalse(JButton btnRispFalse) {
		this.btnRispFalse = btnRispFalse;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public JButton getBtnIstruzioni() {
		return btnIstruzioni;
	}

	public void setBtnIstruzioni(JButton btnIstruzioni) {
		this.btnIstruzioni = btnIstruzioni;
	}

	public JButton getBtnSucc() {
		return btnSucc;
	}

	public void setBtnSucc(JButton btnSucc) {
		this.btnSucc = btnSucc;
	}
}
