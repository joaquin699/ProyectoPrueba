package Principal;

import java.util.LinkedList;
import Entidades.*;

public class MapaBase extends Mapa {
	
	public MapaBase(Juego j) {
		this.enemigos= new LinkedList<Enemigo>();
		this.obstaculos= new LinkedList<Entidad>();
		int x= 50;
		int y= 50;
		
		for(int i=0;i<5;i++){
			EnemigoBase enem= new EnemigoBase(7,x,y);
			enem.setJuego(j);
			enemigos.add(enem);
			x+= 70;
		}
		
		PowerUp premio=new PowerUpEscudo(7,250,250);
		premio.setJuego(j);
		obstaculos.add(premio);
		
		
		EnemigoPierdeArma enem= new EnemigoPierdeArma(7,x,y);
		enem.setJuego(j);
		enemigos.add(enem);
		
		
		
		
		
		
		
		
		
		
		
		/*for(int i=0;i<5;i++){
			EnemigoBase enem= new EnemigoBase(7,x,y);
			enem.setJuego(j);
			enemigos.add(enem);
			x+= 70;
		}
		
		y+=100;
		x=100;
		for(int i=0;i<3;i++){
			EnemigoPierdeArma enem= new EnemigoPierdeArma(7,x,y);
			enem.setJuego(j);
			enemigos.add(enem);
			x+= 70;
		}
		
	 	obstaculos.add(new ObstaculoRompeJugador(250,300));
	 	obstaculos.add(new ObstaculoBasico(100,500));*/
	 	
		}
		
		
	}

