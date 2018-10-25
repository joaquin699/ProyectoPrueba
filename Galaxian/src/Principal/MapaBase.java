package Principal;

import java.util.LinkedList;
import Entidades.*;

public class MapaBase extends Mapa {
	
	public MapaBase(Juego j) {
		this.enemigos= new LinkedList<Enemigo>();
		this.obstaculos= new LinkedList<Entidad>();
		int x= 300;
		int y= 100;
		
		/*EnemigoPierdeArma enem= new EnemigoPierdeArma(7,x,y);
		enem.setJuego(j);
		enemigos.add(enem);*/
		obstaculos.add(new PowerUpEscudo(7, x, y, j));
		obstaculos.add(new PowerUpMisil(7,x+100,y+200,j));
		for(int i=0;i<3 ;i++){
			EnemigoBase enem= new EnemigoBase(7,x,y);
			enem.setJuego(j);
			enem.setJuego(j);
			enemigos.add(enem);
			x+= 70;
		}
	 	/*x=100;
	 	y+=100;
		for(int i=0;i<5;i++){
			EnemigoBase enem= new EnemigoBase(7,x,y);
			enem.setJuego(j);
			enemigos.add(enem);
			x+= 70;
		}*/
		/*x=50;
	 	y+=100;
		for(int i=0;i<5;i++){
			EnemigoBase enem= new EnemigoBase(7,x,y);
			enem.setJuego(j);
			enemigos.add(enem);
			x+= 70;
		}
		for(int p=0;p<3;p++) {
			EnemigoKamikaze enemigo= new EnemigoKamikaze(9,x,y);
			enemigo.setJuego(j);
			enemigos.add(enemigo);
			x+= 70;
		}*/
		
		
		
		
		//obstaculos.add(new ObstaculoBasico (x,y));
	}
}

