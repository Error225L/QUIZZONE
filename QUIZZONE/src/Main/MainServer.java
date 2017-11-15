package Main;

import Control.ControllerServer;
import Model.GestioneServer;
import View.FinestraServer;

public class MainServer {

	public static void main(String[] args) {
		FinestraServer f = new FinestraServer();
		GestioneServer g = new GestioneServer(f);
		ControllerServer c = new ControllerServer(f, g);
	}

	
}
