package Main;

import Control.ControllerClient;
import Model.GestioneClient;
import View.Finestra;

public class Main {

	public static void main(String[] args) throws Exception {
		Finestra f = new Finestra();
		GestioneClient g = new GestioneClient();
		ControllerClient c = new ControllerClient(f, g);
	}
}
