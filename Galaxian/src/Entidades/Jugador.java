package Entidades;

import javax.swing.ImageIcon;

import Colisionadores.*;

public class Jugador extends Entidad {
	
	private Arma arma;
	private boolean escudo;
	
	public Jugador(int x, int y) {
		super(10,x,y);
		
		this.vida=100;
		
		arma= new ArmaBasicaJugador();
		
		inicializarArregloImg();
		
		escudo=false;
	}
	
	private void inicializarArregloImg() {
		this.imagen[0]= new ImageIcon(this.getClass().getResource("/img/playerShip1_blue.png"));
		this.imagen[1]= new ImageIcon(this.getClass().getResource("/img/naveEscudo.png"));
	}
	
	public Disparo crearDisparo() {
		Disparo disp;
		disp = arma.generarDisparo();
		if(disp!=null) {
			disp.getPos().setLocation((int)pos.getX()+(this.getGrafico().getWidth()/2 -1), (int)pos.getY()-12);
		}
		
		return disp;
	}
	
	public void sumarVida(int v) {
		this.vida+=v;
	}
	
	public void activarEscudo() {
		this.cambiarGrafico(1);
		this.imagenActual=1;
		escudo=true;
	}
	
	public void desactivarEscudo() {
		this.cambiarGrafico(0);
		this.imagenActual=0;
		escudo=false;
	}
	
	public boolean tieneEscudo() {
		return escudo;
	}
	
	public void colisionar(Entidad e) {
		ColisionadorJugador col= new ColisionadorJugador(this);
		e.serColisionado(col);
	}
	
	public void serColisionado(Colision col) {
		col.afectarJugador(this);
	}
	
	 public void actualizar(){
	        arma.actualizar();
	 }
	 
	 public void setArma(Arma a) {
		 this.arma=a;
	 }
	
}
