package Entidades;

import Armas.Arma;
import Colisionadores.ColisionadorEnemigo;
import Inteligencias.Inteligencia;
import PowerUps.*;
import Principal.Juego;

public abstract class Enemigo extends Entidad {
	protected Juego juego;
	
	public Enemigo(int velocidad,int x,int y) {
		super(velocidad,x,y);
		juego=null;
	}
	//METODOS PROVISORIOS
	
	public Juego getJuego() {
		return juego;
	}
	
	public void setJuego(Juego j) {
		juego=j;
	}
	
	public void golpearObstaculo(Obstaculo o) {
		
	}
	
	public void golpearJugador(Jugador j) {
	
	}
	
	public void serDetenido(Inteligencia i) {
		ColisionadorEnemigo col= new ColisionadorEnemigo(this);
		col.cambiarInteligencia(i);
	}
	
	public Arma getArma() {
		return null;
	}
	
	public void destruir() {
		GeneradorPowerUp generador = new GeneradorPowerUp(this.juego);
		PowerUp p = generador.getPowerUpAleatorio();
		if(p!=null) {
			p.getPos().setLocation(this.pos.x, this.pos.y);
			juego.addEntidad(p);
		}
		
	}
	
}
