package Entidades;

public class EscudoKamikaze extends Escudo {

	
	public EscudoKamikaze(Jugador j) {
		super(j);
		j.cambiarGrafico(1);
		j.setImagenActual(1);
	}

	@Override
	public void recibirDa�o(int da�o) {
		j.setVida(j.getVida()-da�o);
	}
	
	public void recibirDa�oKamikaze(int da�o) {
		j.setEscudo(new EscudoNormal(j));
	}
	
}
