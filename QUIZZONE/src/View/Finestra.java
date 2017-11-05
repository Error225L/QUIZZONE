package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Finestra {

	private JFrame frmQuizzone;
	private JLabel lblDomanda;
	private JLabel lblQuesito;
	private JButton btnRispTrue;
	private JButton btnRispFalse;
	private JScrollPane scrollPane;
	private JList list;
	
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
		frmQuizzone.setTitle("QUIZZONE");
		frmQuizzone.setBounds(100, 100, 600, 400);
		frmQuizzone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuizzone.getContentPane().setLayout(null);
		
		lblDomanda = new JLabel("DOMANDA");
		lblDomanda.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomanda.setBounds(234, 11, 109, 14);
		frmQuizzone.getContentPane().add(lblDomanda);
		
		lblQuesito = new JLabel("");
		lblQuesito.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuesito.setBounds(10, 36, 564, 28);
		frmQuizzone.getContentPane().add(lblQuesito);
		
		btnRispTrue = new JButton("New button");
		btnRispTrue.setBounds(40, 278, 195, 72);
		frmQuizzone.getContentPane().add(btnRispTrue);
		
		btnRispFalse = new JButton("New button");
		btnRispFalse.setBounds(339, 278, 195, 72);
		frmQuizzone.getContentPane().add(btnRispFalse);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 38, 494, 229);
		frmQuizzone.getContentPane().add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
	}
}
