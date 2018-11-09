package Principal;

import java.util.LinkedList;

import Entidades.*;

public class MapaPrueba extends Mapa{
	public MapaPrueba(Juego j) {
		this.enemigos= new LinkedList<Enemigo>();
		this.obstaculos= new LinkedList<Entidad>();
		int x= 50;
		int y= 50;
		
		/*Enemigo enem= new EnemigoKamikazeMareado(7,x,y);
		enem.setJuego(j);
		enemigos.add(enem);
		y+=70;*/
		
		Enemigo enem= new EnemigoMareado(7,x,y);
		enem.setJuego(j);
		enemigos.add(enem);
		y+=70;
		
		/*enem= new EnemigoPierdeArma(7,x,y);
		enem.setJuego(j);
		enemigos.add(enem);
		y+=70;*/
		
		/*enem= new EnemigoPierdeArmaKamikaze(7,x,y);
		enem.setJuego(j);
		enemigos.add(enem);*/
	}
}
