/**
 *@author Rafael Martín Berenguer
 */

package Jugadores;

public class Principal {

	public static void main(String[] args) {
		
		ListaPersonajes lp = new ListaPersonajes();
		
		lp.elegir(new Personajes("Arquera"));
		lp.elegir(new Personajes("Bola de Fuego"));
		lp.elegir(new Personajes("Gigante"));
		

	}

}
