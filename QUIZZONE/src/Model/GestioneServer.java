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
	int i;
	
	public GestioneServer() {
		this.domande = new ArrayList<Domanda>();
		i=0;
	}
	
	public void insNuovaDomanda(Domanda nuovaDomanda) {
		domande.add(nuovaDomanda);
		i=(domande.size()-1);
		System.out.println(i);
	}
	
	public ArrayList<Domanda> getVett() {
		return domande;
	}
	
	public void setVett(ArrayList<Domanda> vett) {
		this.domande = vett;
	}

	
	@Override
	public void run() {
		try{
			ServerSocket ss=new ServerSocket(9999);
			Socket s=ss.accept();
			while(true){
				PrintWriter p = new PrintWriter(s.getOutputStream(),true);
				boolean f=true;
				while(f==true){
					if(i>=domande.size()) {
						p.println("Domande_Finite");
						p.println("");
						p.println("");
					}
					else {
						for(int j=1; j<=3; j++) {
							switch(j) {
								case 1:
									p.println(domande.get(i).getDomanda());
									break;
								case 2:
									p.println(domande.get(i).getRispostaVera());
									break;
								case 3:
									p.println(domande.get(i).getRispostaFalsa());
									break;
							}
						}
					}
					f=false;
					InputStreamReader isr=new InputStreamReader(s.getInputStream());
					BufferedReader in=new BufferedReader(isr);
					String ricezione = in.readLine();
					if(ricezione.compareTo("OK")==0) {
						i++;
						f=true;
					}
					else {
						f=true;
					}
				}
				//tornare all'inizio per accettare nuova conn
			}
		}catch(Exception e){
			
		}
	}
}
