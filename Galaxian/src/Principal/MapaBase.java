package Principal;

import java.util.LinkedList;
import Entidades.*;

public class MapaBase extends Mapa {
	
	public MapaBase(Juego j) {
		this.enemigos= new LinkedList<Enemigo>();
		this.obstaculos= new LinkedList<Obstaculo>();
		int x= 20;
		int y= 110;
		
		for(int i=0;i<5;i++){
			enemigos.add(new EnemigoBase(7,x,y));
			x+= 60;
		}
		
		//obstaculos.add(new ObstaculoBasico (x,y));
	}
}
