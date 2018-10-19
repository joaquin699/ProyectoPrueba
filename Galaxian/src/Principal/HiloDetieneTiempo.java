package Principal;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import Entidades.Entidad;
import Inteligencias.Inteligencia;
import Inteligencias.InteligenciaObstaculo;

public class HiloDetieneTiempo extends Thread {
	
	private Juego elJuego;
	
	public HiloDetieneTiempo(Juego j){
		this.elJuego= j;
	}
	
	public void run() {
		LinkedList<Entidad> listaEntidades = elJuego.getListaEntidades();

		Map<Entidad,Inteligencia>mapeo= new HashMap<Entidad ,Inteligencia>();
		
		for(Entidad e: listaEntidades) {
			mapeo.put(e, e.getInteligencia());
			e.serDetenido(new InteligenciaObstaculo());
		}
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		for(Entidad e: listaEntidades) {
			e.serDetenido(mapeo.get(e));
		}		
	}
}
