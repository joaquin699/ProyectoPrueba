package Principal;

public class ContadorTiempo extends Thread{
	private Juego elJuego;
	
	ContadorTiempo(Juego j){
		this.elJuego= j;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.mover();
			elJuego.detectarColisiones();
			elJuego.eliminarEntidades();
			elJuego.manage();
			elJuego.actualizarLabels();
		}
	}
}
