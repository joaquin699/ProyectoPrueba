package Inteligencias;

import java.util.Random;

import Armas.ArmaBoss;
import Disparos.Disparo;

import Entidades.PrimerBoss;

public class InteligenciaBoss extends InteligenciaEnemigoConArma {
	
	private Random r;
	private PrimerBoss boss;
	
	public InteligenciaBoss(PrimerBoss enem) {
		super(enem);
		r= new Random();
	}
	
	public void disparar() {
		if(r.nextInt(40)==5) {
			ArmaBoss arma= boss.getArmaBoss();
			if(arma!=null) {
				for(Disparo d: boss.getArmaBoss().generarDisparoBoss())
					enemigo.getJuego().addDisparo(d);
			}
		}
	}

}
