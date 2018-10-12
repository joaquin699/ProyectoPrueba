package Inteligencias;

import Entidades.DisparoEnemigo;

public class InteligenciaDisparoEnemigo extends Inteligencia {
	DisparoEnemigo disp;
	
	public InteligenciaDisparoEnemigo(DisparoEnemigo disparo) {
		disp= disparo;
	}
	

	public void mover() {
		disp.mover(3);
	}

}
