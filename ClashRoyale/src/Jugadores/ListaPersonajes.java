package Jugadores;

import Personajes.Personajes;

public class ListaPersonajes {
	
	public private Personajes [] listaPersonajes;
	private int nPersonajes;

	public ListaPersonajes() {
		this.listaPersonajes = new Personajes[11];
		this.nPersonajes = 0;
	}

	
	public void eliminaPersonaje(Personajes pj) {

		int inx, i;
		inx = buscaPersonajes(pj);

		if (inx == -1) {
			this.nPersonajes--;
		}
		nPersonajes--;
		for (i = inx; i < nPersonajes; i++) {
			listaPersonajes[i] = listaPersonajes[i + 1];
		}
		listaPersonajes[i] = null;
	}

	public int buscaPersonajes(Personajes pj) {

		int inx = -1;
		boolean enc = false;
		for (int i = 0; !enc && i < listaPersonajes.length; i++) {
			System.out.println("Introduce el nombre del personaje que deseas elegir para tu equipo: " + listaPersonajes);
			Scanner nj = new Scanner(System.in);

			if (listaPersonajes[i].equals(pj)) {
				enc = true;
				inx = i;
			}
		}
		return inx;
	}

}
