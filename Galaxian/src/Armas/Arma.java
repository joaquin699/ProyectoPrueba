package Armas;

import Disparos.Disparo;
import Entidades.*;

public abstract class Arma {
	protected int tiempoParaDisparar;
	protected long tiempoHastaProximoDisparoDisponible;
	protected Entidad propietario;
	
	public Arma(Entidad e) {
		propietario=e;
	}
	
	public abstract Disparo generarDisparo();
	
	public void actualizar() {
		
	}
}
