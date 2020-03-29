/**
 *@author Rafael Martín Berenguer
 */

package Jugadores;

import java.util.Scanner;

import Personajes.Pers;

public class ListaPersonajes {
	
	private Pers [] listaPersonajes;
	private int nPersonajes;

	public ListaPersonajes() {
		this.listaPersonajes = new Pers[11];
		this.nPersonajes = 0;
	}

	
	public void elegir(Personajes personaje){
		
		int inx, i;
		inx = buscaPersonajes(personaje);

		if (inx == -1) {
			this.nPersonajes--;
		}
		nPersonajes--;
		for (i = inx; i < nPersonajes; i++) {
			listaPersonajes[i] = listaPersonajes[i + 1];
		}
		
	}


	public int buscaPersonajes(Personajes personaje) {

		int inx = -1;
		boolean enc = false;
		for (int i = 0; !enc && i < listaPersonajes.length; i++) {
			System.out.println("Introduce el nombre del personaje que deseas elegir para tu equipo: " + listaPersonajes);
			Scanner nj = new Scanner(System.in);

			if (listaPersonajes[i].equals(personaje)) {
				enc = true;
				inx = i;
			}
		}
		return inx;
	}

}
