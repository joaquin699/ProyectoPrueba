package Inteligencias;

import java.util.Random;
//import Inteligencias.*;

import Entidades.Arma;
import Entidades.Disparo;
import Entidades.Enemigo;

public class InteligenciaEnemigoPierdeArma extends InteligenciaEnemigo {
	
	private Random r;
	private int vidaParaCambiar;
	
	public InteligenciaEnemigoPierdeArma(Enemigo enem){
		this.enemigo=enem;
		r= new Random();
		vidaParaCambiar= (int) enemigo.getVida()*20/100;

	}
	
	public void disparar() {
		if (enemigo.getVida()>vidaParaCambiar) {
			if(r.nextInt(10)==5) {
				Arma arma= enemigo.getArma();
				if(arma!=null) {
					Disparo d= arma.generarDisparo();
					d.getPos().setLocation((int)enemigo.getPos().getX()+(enemigo.getGrafico().getWidth()/2 -1), (int)enemigo.getPos().getY()+30);
					enemigo.getJuego().addDisparo(d);
				}
			}
		}
		else {
			enemigo.setInteligencia(new InteligenciaKamikaze(this.enemigo, this.enemigo.getJuego()));
			this.enemigo.setImagenActual(1);
		}
		
	}
}
