package Model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GestioneServer extends ArrayList<Domanda> implements Runnable{
	
	private ArrayList<Domanda> domande;
	
	public GestioneServer() {
		this.domande = new ArrayList<Domanda>();
		
	}
	
	public void insNuovaDomanda(Domanda nuovaDomanda) {
		domande.add(nuovaDomanda);
		Object[] options = {"OK"};
		int optPane = JOptionPane.showOptionDialog(null, "Domanda inserita correttamente nell'archivio!", "Operazione eseguita", 
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	}
	
	public ArrayList<Domanda> getVett() {
		return domande;
	}
	
	public void setVett(ArrayList<Domanda> vett) {
		this.domande = vett;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{ServerSocket ss=new ServerSocket(9999);
		Socket s=ss.accept();
		while(true){
			//Socket s=ss.accept();
			//riceve testo
			PrintWriter p=new PrintWriter(s.getOutputStream(),true);
			int i=0;
			int j;
			boolean f=true;
			while(f==true){
				j=0;
				while(j<3){
					if(j==0){	
					p.println(domande.get(i).getDomanda());
					}else{
						if(j==1){
							p.println(domande.get(i).getRispostaFalsa());
						}else{
							if(j==2){
								p.println(domande.get(i).getRispostaVera());
							}
						}
					}
					j++;
					
				}
				f=false;
				InputStreamReader isr=new InputStreamReader(s.getInputStream());
				BufferedReader in=new BufferedReader(isr);
				if(in.readLine().compareTo("Ok")==0){
					i++;
					f=true;
				}
				
				
			}
			
			//tornare all'inizio per accettare nuova conn
		
		}
		}catch(Exception e){
			
		}
	}
}
