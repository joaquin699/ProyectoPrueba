package Entidades;

public class ArmaBasicaJugador extends Arma {
	
	
	public ArmaBasicaJugador() {
		this.tiempoHastaProximoDisparoDisponible=0;
		this.tiempoParaDisparar=10;
	}
	
	public Disparo generarDisparo() {
		DisparoJugador disp=null;
		if(tiempoHastaProximoDisparoDisponible<=0) {
			disp= new DisparoJugador(5,0,0);
			tiempoHastaProximoDisparoDisponible= tiempoParaDisparar;
		}
		return disp;
	}
	
	public void actualizar() {
		tiempoHastaProximoDisparoDisponible--;
	}
	
	
}
