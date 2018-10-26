package Principal;

public class TiempoDisparo extends Thread  {
	private Juego elJuego;
	private boolean seguir;
	
	public TiempoDisparo(Juego j){
		this.elJuego= j;
		seguir=true;
	}
	
	public void run() {
		while(seguir) {
			try {
				Thread.sleep(25);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.moverDisparo();
			elJuego.eliminarDisparos();
			elJuego.agregarDisparos();
			
			if(elJuego.cambiandoNivel()) {
				esperar();
			}
			seguir= elJuego.continuarJuego();
		}
		elJuego.terminarJuego();
	}
	
	private void esperar() {
		while(elJuego.cambiandoNivel()) {
			//Me quedo esperando hasta que se termine de cambiar el nivel de juego
		}
	}
}
