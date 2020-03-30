/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 2 parametro
 *@param listaPersonajes Array con los nombres de los personajes
 *@param nPersonajes Numero de personajes
 */

package Jugadores;

import java.util.Scanner;

import Personajes.Pers;

public class Jugador {
	private Pers [] listaPersonajes;
	private int turno = (int)(Math.random()*1+1);	
	public Jugador() {
		this.listaPersonajes = new Pers[11];
		this.turno=0;
	}

	
	/**
	 *El metodo buscaPersonajes busca al personaje en el array para ser borrado posteriormente
	 *@return
	 *         <ul>
	 *         <li>true: Encuentra el personaje </li>
	 *         <li>false: No encuentra el personaje </li>
	 *         </ul> 
	 *
	 */
	
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
	

	/**
	 *El metodo turnoJugador asigna el turno a los jugadores
	 *@return
	 *         <ul>
	 *         <li>1: es el turno del jugador 1 </li>
	 *         <li>2: es el turno del jugador 2 </li>
	 *         </ul>
	 *
	 */
	
	
	public void turnoJugador() {
	
		if (turno == 1) {
			System.out.println("Es el turno del Jugador 1");
			turno++;
		} else if (turno == 2) {
			System.out.println("Es el turno del jugador 2");
			turno--;
		}

	}

}
