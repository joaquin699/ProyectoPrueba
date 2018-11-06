package Entidades;

public class ArmaMisil extends Arma {
	
	public ArmaMisil() {
		this.tiempoHastaProximoDisparoDisponible=0;
		this.tiempoParaDisparar=35;
	}
	
	public Disparo generarDisparo() {
		DisparoMisil disp=null;
		if(tiempoHastaProximoDisparoDisponible<=0) {
			disp= new DisparoMisil(5,0,0);
			tiempoHastaProximoDisparoDisponible= tiempoParaDisparar;
		}
		
		return disp;
	}
	
	public void actualizar() {
		tiempoHastaProximoDisparoDisponible--;
	}
}
