package Entidades;

public abstract class Arma {
	protected int tiempoParaDisparar;
	protected long tiempoHastaProximoDisparoDisponible;
	
	public abstract Disparo generarDisparo();
	
	public void actualizar() {
		
	}
}
