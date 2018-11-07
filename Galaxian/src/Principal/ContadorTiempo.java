package Principal;

public class ContadorTiempo extends Thread{
	private Juego elJuego;
	private boolean seguir;
	
	ContadorTiempo(Juego j){
		this.elJuego= j;
		seguir=true;
	}
	
	public void run() {
		boolean cambiarNivel=false;
		while(seguir) {
			try {
				Thread.sleep(70);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.mover();
			elJuego.detectarColisiones();
			elJuego.accionarDisparos();
			elJuego.agregarDisparos();
			elJuego.agregarEntidades();
			elJuego.eliminarEntidades();

			//elJuego.manage();
			elJuego.actualizarLabels();
			
			if(elJuego.jugadorVivo() && (elJuego.nivelActual()<=elJuego.maxNiveles())) {
				cambiarNivel= !elJuego.hayEnemigos();
			}
		
			if(cambiarNivel) {
				elJuego.cambiarNivel();
				cambiarNivel=false;
			}
			
			seguir= elJuego.continuarJuego();
			//System.out.println(elJuego.getListaEntidades().size());
		}
		elJuego.terminarJuego();
	}
}
