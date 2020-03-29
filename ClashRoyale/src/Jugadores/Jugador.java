/**
 *@author Francisco Javier Frances Pardo
 *
 *
 */

package Jugadores;

import java.util.Scanner;

import Personajes.Pers;

public class Jugador {
	private Pers [] listaPersonajes;
	private int nPersonajes;

	public Jugador() {
		this.listaPersonajes = new Pers[11];
		this.nPersonajes = 0;
	}

	
	
	
	/**
	 *El metodo eliminaPersonaje elimina al personaje seleccionado del array
	 * 
	 *
	 */

	public void eliminaPersonaje(Pers pj) {

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

	
	/**
	 *El metodo buscaPersonajes busca al personaje en el array para ser borrado posteriormente
	 * 
	 *
	 */
	
	public int buscaPersonajes(Pers pj) {

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

	/**
	 *El metodo turnoJugador asigna el turno a los jugadores
	 * 
	 *
	 */
	
	public void turnoJugador() {
		int turno = (int)(Math.random()*1+1);		
		
		if (turno == 1) {
			System.out.println("Es el turno del Jugador 1");
			turno++;
		} else if (turno == 2) {
			System.out.println("Es el turno del jugador 2");
			turno--;
		}

	}

}
