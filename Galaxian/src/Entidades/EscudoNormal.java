package Entidades;

public class EscudoNormal extends Escudo{

	public EscudoNormal(Jugador j) {
		super(j);
		j.cambiarGrafico(0);
		j.setImagenActual(0);
	}

	public void recibirDa�o(int da�o) {
		j.setVida(j.getVida()-da�o);
	}

}
