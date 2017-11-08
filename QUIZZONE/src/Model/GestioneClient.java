package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class GestioneClient {
	Domanda d;
	String dom = null, rispVera = null, rispFalsa = null;
	Socket s;

	public Domanda getNewDomanda() {
		try {
			s = new Socket("localhost", 9999);
			InputStreamReader isr2 = new InputStreamReader(s.getInputStream());
			BufferedReader in2 = new BufferedReader(isr2);
			
			for(int i=1; i<=3; i++) {
				switch(i) {
					case 1:
						dom=in2.readLine();
						break;
					case 2:
						rispVera=in2.readLine();
						break;
					case 3:
						rispFalsa=in2.readLine();
						break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		d = new Domanda(dom, rispVera, rispFalsa);
		System.out.println(d);
		return d;
	}

	public Domanda getD() {
		return d;
	}

	public void setD(Domanda d) {
		this.d = d;
	}

	public String getDom() {
		return dom;
	}

	public void setDom(String dom) {
		this.dom = dom;
	}

	public String getRispVera() {
		return rispVera;
	}

	public void setRispVera(String rispVera) {
		this.rispVera = rispVera;
	}

	public String getRispFalsa() {
		return rispFalsa;
	}

	public void setRispFalsa(String rispFalsa) {
		this.rispFalsa = rispFalsa;
	}
}
