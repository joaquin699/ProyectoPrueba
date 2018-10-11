package Principal;

import Entidades.Jugador;
import Entidades.PrimerBoss;

public class GameManager {
	private Juego juego;
	private Jugador jugador;
	
	public GameManager(Juego j, Jugador jug) {
		juego=j;
		jugador =jug;
	}
	
	public void manage() {
		if(juego.getListaEntidades().size()==1&&jugador.getVida()>0) {
			//PrimerBoss boss = new PrimerBoss(10,200,200);
			
		}
	}
}
