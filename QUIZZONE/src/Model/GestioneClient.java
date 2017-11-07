package Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class GestioneClient{

	public Domanda getNewDomanda() {
		Domanda d;
		String dom = null,vero = null ,falso = null ;
		int i=0;
		Socket s;
		try {
			s = new Socket("localhost",9999);
			InputStreamReader isr2;
			isr2 = new InputStreamReader(s.getInputStream());
			BufferedReader in2=new BufferedReader(isr2);
			
			while(i<3){
				if(i==0){
					dom=in2.readLine();
					}else{if(i==1){
						falso=in2.readLine();
					}else{
						vero=in2.readLine();
					}
					i++;
				}
			}
			
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			d=new Domanda(dom, vero, falso);	
			System.out.println(d);
			
		return d;
	}
	
	
	
}
