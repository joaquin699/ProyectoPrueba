package Principal;

public class TiempoJugador extends Thread {
	private Juego elJuego;
		
		TiempoJugador(Juego j){
			this.elJuego= j;
		}
		
		public void run() {
			while(true) {
				try {
					Thread.sleep(30);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				elJuego.moverJugador();
				elJuego.Update();
			}
		}
}
