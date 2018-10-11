package Principal;

import java.util.LinkedList;
import Entidades.*;

public class MapaBase extends Mapa {
	
	public MapaBase(Juego j) {
		this.enemigos= new LinkedList<Enemigo>();
		this.obstaculos= new LinkedList<Obstaculo>();
		int x= 0;
		int y= 0;
		/**
		for(int i=0;i<3;i++){
			y+= 60;
			for(int h=0;h<3;h++) {
				x+=60;
				enemigos.add(new EnemigoBase(7,x,y));
			}
			x=0;
		}
		y+=60;
		**/
		for(int p=0;p<3;p++) {
			x+=60;
			enemigos.add(new EnemigoKamikaze(7,x,y,j));
		}
		
		
		
		//obstaculos.add(new ObstaculoBasico (x,y));
	}
}
