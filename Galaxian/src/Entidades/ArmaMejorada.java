package Entidades;

public class ArmaMejorada extends Arma {
	
	public ArmaMejorada() {
		this.tiempoHastaProximoDisparoDisponible=0;
		this.tiempoParaDisparar=10;
	}
	
	public Disparo generarDisparo() {
		DisparoMejorado disp=null;
		if(tiempoHastaProximoDisparoDisponible<=0) {
			disp= new DisparoMejorado(5,0,0);
			tiempoHastaProximoDisparoDisponible= tiempoParaDisparar;
		}
		
		return disp;
	}
	
	public void actualizar() {
		tiempoHastaProximoDisparoDisponible--;
	}
}
