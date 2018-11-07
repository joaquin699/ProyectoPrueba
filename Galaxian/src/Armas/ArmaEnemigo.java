package Armas;

import Disparos.Disparo;
import Disparos.DisparoEnemigo;
import Entidades.*;

public class ArmaEnemigo extends Arma {
	public ArmaEnemigo(Enemigo e) {
		super(e);	
	}
	
	public Disparo generarDisparo() {
		return new DisparoEnemigo(5,0,0);
	}
}
