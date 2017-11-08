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
	int i = 0;
	Socket s;

	public Domanda getNewDomanda() {
		try {
			s = new Socket("localhost", 9999);
			InputStreamReader isr2;
			isr2 = new InputStreamReader(s.getInputStream());
			BufferedReader in2 = new BufferedReader(isr2);
			
			while (i < 3) {
				if (i == 0) {
					dom = in2.readLine();
				} else {
					if (i == 1) {
						rispVera = in2.readLine();
					} else {
						rispFalsa = in2.readLine();
						
					}					
				}
				i++;
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
