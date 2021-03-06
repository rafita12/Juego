/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 2 parametro
 *@param listaPersonajes Array con los nombres de los personajes
 *@param nPersonajes Numero de personajes
 */

package Jugadores;


public class Jugador {
	
	private Personajes [] listaPersonajes;
	private int turno;	
	
	
	public Jugador() {
		this.listaPersonajes = new Personajes[11];
		this.turno=(int)(Math.random()*1+1);
	}
	
	//Metodo constructor para las pruebas
	
	public Jugador(int turno) {
		this.turno=turno;
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
	
	
	public int turnoJugador() {
		
		if (turno == 1) {


		} else if (turno == 2) {


		}

		return turno;

	}

}
