package Principal;

import Lutador.Lutador;
import luta.Luta;

public class Main {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[5];
		
		l[0] = new Lutador ("Enzo", "Brasileiro", 1.78, 44, 68.7, 3, 4, 5);
		l[1] = new Lutador ("Breno", "Português", 1.75, 33, 62.7, 1, 5, 6);
		
		Luta UFC = new Luta();
		UFC.marcarLuta(l[0], l[1]);
		UFC.lutar();
		
		
		
		
		

	}

}
