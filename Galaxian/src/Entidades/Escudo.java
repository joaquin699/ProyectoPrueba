package Entidades;

public abstract class Escudo {
	protected Jugador j;
	
	public Escudo(Jugador j) {
		this.j=j;
	}
	
	public abstract void recibirDa�o(int da�o); 
	
	public void recibirDa�oKamikaze(int da�o) {
		j.setVida(j.getVida()-da�o);
	}
		
}
