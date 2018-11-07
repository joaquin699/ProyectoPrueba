package Entidades;

import java.util.Random;

import PowerUps.*;
import Principal.Juego;

public class GeneradorPowerUp {
	
	private Random r;
	private Juego juego;
	private int cantidadPowerUpTiempo;
	
	public GeneradorPowerUp(Juego j) {
		r= new Random();
		this.juego=j;
		cantidadPowerUpTiempo=0;
	}
	
	public PowerUp getPowerUpAleatorio() {
		int num = r.nextInt(4);
		PowerUp p;
		switch(num) {
		case 0:
			p=getPowerUpRandom();
			break;
		default:
			p=null;
		}
		return p;
	}
	
	private PowerUp getPowerUpRandom() {
		int num=r.nextInt(6);
		PowerUp p=null;
		switch(num) {
		case 0:
			p=new PowerUpEscudo(7,0,0);
			break;
		case 1:
			p=new PowerUpArmaRapida(7,0,0);
			break;
		case 2:
			p=new PowerUpArmaMejorada(7,0,0);
			break;
		case 3:
			p= new PowerUpMisil(7,0,0);
			break;
		case 4:
			if(cantidadPowerUpTiempo==0) {
				p=new PowerUpTiempo(7,0,0);
				cantidadPowerUpTiempo=1;
			}
			break;
		case 5:
			p=new PowerUpVida(7,0,0);
			break;
		}
		p.setJuego(juego);
		return p;
	}
}
