package Entidades;

public class ArmaRapida extends Arma {

	public ArmaRapida() {
		this.tiempoHastaProximoDisparoDisponible=0;
		this.tiempoParaDisparar=5;
	}
	
	public Disparo generarDisparo() {
		DisparoRapido disp=null;
		if(tiempoHastaProximoDisparoDisponible<=0) {
			disp= new DisparoRapido(5,0,0);
			tiempoHastaProximoDisparoDisponible= tiempoParaDisparar;
		}
		return disp;
	}
	
	public void actualizar() {
		tiempoHastaProximoDisparoDisponible--;
	}
	
	
}
