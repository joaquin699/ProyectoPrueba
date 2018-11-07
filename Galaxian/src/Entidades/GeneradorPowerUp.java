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
		int num = r.nextInt(6);
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
		PowerUp p=new PowerUpEscudo(12,0,0);
		int num=r.nextInt(5);
		switch(num) {
		case 0:
			p=new PowerUpEscudo(12,0,0);
			break;
		case 1:
			p=new PowerUpArmaRapida(12,0,0);
			break;
		case 2:
			p=new PowerUpArmaMejorada(12,0,0);
			break;
		case 3:
			p= new PowerUpMisil(12,0,0);
			break;
		case 4:
			if(cantidadPowerUpTiempo==0) {
				p=new PowerUpTiempo(12,0,0);
				cantidadPowerUpTiempo=1;
			}
			break;
		case 5:
			p=new PowerUpVida(12,0,0);
			break;
		}
		p.setJuego(juego);
		return p;
	}
}
