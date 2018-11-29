package Entidades;

import java.util.Random;

import javax.swing.ImageIcon;

import Armas.*;
import Colisionadores.Colision;
import Colisionadores.ColisionadorEnemigo;
import Disparos.DisparoEnemigo;
import Inteligencias.InteligenciaEnemigoConArma;

public class PrimerBoss extends Enemigo {
	
	private static PrimerBoss primerBoss;
	private ArmaBoss arma;
	
	private PrimerBoss(int velocidad,int x, int y) {
		super(velocidad,x,y);
		
		this.vida= 500;
		this.vidaInicial=vida;
		this.puntaje=1000;
		
		arma= new ArmaBoss(this);
		
		inicializarArregloImg();
		this.setInteligencia(new InteligenciaEnemigoConArma(this));
		
	}

	public static PrimerBoss getPrimerBoss(int velo,int x,int y) {
		if(primerBoss==null) {
			primerBoss= new PrimerBoss(velo,x,y);
			return primerBoss;
		}
		else {
			return null;
		}
		

	}
	
	private void inicializarArregloImg() {
		this.imagen[0]= new ImageIcon(this.getClass().getResource("/img/boss.png"));
	}
	public void mover() {
		this.inteligencia.mover();
	}
	
	public void serColisionado(Colision col) {
		col.afectarEnemigo(this);
	}
	
	public void colisionar(Entidad e) {
		ColisionadorEnemigo col= new ColisionadorEnemigo(this);
		e.serColisionado(col);
	}
	
	public ArmaBoss getArmaBoss() {
		return arma;
	}
	
	
	public void disparar() {
		inteligencia.disparar();
	}
}

