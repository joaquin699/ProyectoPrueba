package Colisionadores;

import Entidades.DisparoEnemigo;
import Entidades.Enemigo;
import Entidades.Jugador;
import Entidades.Obstaculo;

public class ColisionadorDisparoEnemigo extends Colision {
	DisparoEnemigo disp;
	
	public ColisionadorDisparoEnemigo(DisparoEnemigo d) {
		disp=d;
	}
	
	public void afectarEnemigo(Enemigo e) {
		disp.golpearEnemigo(e);
	}
	
	public void afectarObstaculo(Obstaculo o) {
		disp.golpearEntidad(o);
	}
	
	public void afectarJugador(Jugador j) {
		disp.golpearEntidad(j);
	}
}
