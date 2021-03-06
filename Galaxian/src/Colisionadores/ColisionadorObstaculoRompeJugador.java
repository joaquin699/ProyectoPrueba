package Colisionadores;

import Disparos.*;
import Entidades.*;
import PowerUps.*;

public class ColisionadorObstaculoRompeJugador extends Colision {
	
	private Obstaculo obstaculo;
	
	public ColisionadorObstaculoRompeJugador(Obstaculo o) {
		this.obstaculo=o;
	}
	
	
	public void afectarEnemigo(Enemigo e) {
		
	}
	
	public void afectarDisparoEnemigo(Disparo d) {
		
	}
	
	public void afectarDisparoJugador(Disparo d){
		d.golpearObstaculoJugador(obstaculo);
	}
	
	public void afectarJugador(Jugador j) {
		
	}
	
	public void afectarObstaculo(Obstaculo o) {
		
	}
	
	public void afectarPowerUp(PowerUp p) {
		
	}
	
	public void afectarObstaculoRompeJugador(Obstaculo o) {
		
	}

}