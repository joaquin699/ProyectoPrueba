package Entidades;

import javax.swing.ImageIcon;

import Colisionadores.Colision;
import Colisionadores.ColisionadorDisparo;
import Colisionadores.ColisionadorDisparoEnemigo;
import Inteligencias.InteligenciaDisparo;
import Inteligencias.InteligenciaDisparoEnemigo;

public class DisparoEnemigo extends Entidad {
	int damage;
	
	public DisparoEnemigo(int velocidad,int x,int y) {
		super(velocidad,x,y);
		
		damage=30;
		
		vida= 10;
		
		this.setInteligencia(new InteligenciaDisparoEnemigo(this));
		inicializarArregloImg();
	}
	
	private void inicializarArregloImg() {
		this.imagen[0]= new ImageIcon(this.getClass().getResource("/img/disparoBasico.png"));
	}
	
	public void mover() {
		this.inteligencia.mover();
	}
	
	//METODOS PROVISORIOS
	public void colisionar(Entidad e) {
		Colision col= new ColisionadorDisparoEnemigo(this);
		e.serColisionado(col);
	}
	
	public void serColisionado(Colision col) {
	}
	
	public void golpearEnemigo(Enemigo e) {
		e.quitarVida(damage);
		this.vida=-1;
	}
	
	public void golpearEntidad(Entidad e) {
		e.quitarVida(damage);
		this.vida=-1;
	}
	
	public int getDamage() {
		return damage;
	}
}
