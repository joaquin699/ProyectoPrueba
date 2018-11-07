package Armas;

import Disparos.Disparo;
import Disparos.DisparoRapido;
import Entidades.*;

public class ArmaRapida extends Arma {

	public ArmaRapida(Jugador j) {
		super(j);
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
