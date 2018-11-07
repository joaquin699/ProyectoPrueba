package Entidades;

import java.util.Random;

import Colisionadores.ColisionadorEnemigo;
import Inteligencias.Inteligencia;
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
		//Random r = new Random();
		this.vida=-1;
		juego.getGui().remove(grafico);
		PowerUp p = new PowerUpEscudo(7,pos.x,pos.y);
		p.setJuego(juego);
		
	 	
		//SE LLAMA MUCHAS VECES
		System.out.println("Se elimino 1 enemigo");
		//juego.addEntidad(p);
	}
	
}
