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

public class Finestra {

	private JFrame frmQuizzone;
	private JButton btnRispTrue;
	private JButton btnRispFalse;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnIstruzioni;
	private JLabel lblDomanda;
	
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
		btnRispTrue.setBounds(41, 247, 128, 57);
		frmQuizzone.getContentPane().add(btnRispTrue);
		
		btnRispFalse = new JButton("New button");
		btnRispFalse.setBounds(236, 247, 122, 57);
		frmQuizzone.getContentPane().add(btnRispFalse);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 71, 340, 137);
		frmQuizzone.getContentPane().add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		btnIstruzioni = new JButton("Istruzioni");
		btnIstruzioni.setBounds(10, 26, 89, 23);
		frmQuizzone.getContentPane().add(btnIstruzioni);
		
		lblDomanda = new JLabel("DOMANDA");
		lblDomanda.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomanda.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 18));
		lblDomanda.setBounds(106, 11, 153, 46);
		frmQuizzone.getContentPane().add(lblDomanda);
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
}
