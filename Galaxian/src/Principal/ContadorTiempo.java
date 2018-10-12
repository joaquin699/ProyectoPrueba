package Principal;

public class ContadorTiempo extends Thread{
	private Juego elJuego;
	public ContadorTiempo(Juego j){
		this.elJuego= j;
	}
	
	public void run() {
		while(true) {
			//elJuego.accionarDisparos();

			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.mover();
			elJuego.detectarColisiones();
			elJuego.eliminarEntidades();
			///////ESTA LINEA TIRA ERROR//////////
			elJuego.accionarDisparos();
			////////////////////////////////////			
			elJuego.manage();
			elJuego.actualizarLabels();
			
			
		}
	}
}
