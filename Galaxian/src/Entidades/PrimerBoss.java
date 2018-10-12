package Entidades;

import javax.swing.ImageIcon;

import Colisionadores.Colision;
import Colisionadores.ColisionadorEnemigo;
import Inteligencias.InteligenciaEnemigo;

public class PrimerBoss extends Enemigo {
	
	private static int primerBoss;
	
	private PrimerBoss(int velocidad,int x, int y) {
		super(velocidad,x,y);
		this.vida= 100;
		
		inicializarArregloImg();
		this.setPuntaje(7);
		this.setInteligencia(new InteligenciaEnemigo(this));
	}
	
	public static PrimerBoss getPrimerBoss(int velo,int x,int y) {
		PrimerBoss primer =null;
		if(primerBoss==0) {
			primer= new PrimerBoss(velo,x,y);
			primerBoss++;
		}
		return primer;

	}
	
	private void inicializarArregloImg() {
		this.imagen[0]= new ImageIcon(this.getClass().getResource("/img/boss.png"));
	}
	public void mover() {
		this.inteligencia.mover();
	}
	
	//METODOS PROVISORIOS
	public void serColisionado(Colision col) {
		col.afectarEnemigo(this);
	}
	
	public void colisionar(Entidad e) {
		ColisionadorEnemigo col= new ColisionadorEnemigo(this);
		e.serColisionado(col);
	}
}

