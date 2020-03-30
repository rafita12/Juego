/**
 *@author Rafael Martín Berenguer
 */

package Jugadores;

import java.util.Scanner;

import Personajes.Pers;

public class ListaPersonajes {
	
	private Personajes [] listaPersonajes;
	private int nPersonajes;

	public ListaPersonajes() {
		this.listaPersonajes = new Personajes[6];
		this.nPersonajes = 0;
	}
	
	
	/**
	 *El metodo elegir elige de la clase Personajes aquellos
	 *personajes definidos en las clases, corrigiendo el si se pone mas 
	 *de 6 personajes.
	 *
	 */

		
		public void elegir(Personajes p) {
			if (this.nPersonajes == 6)
				System.out.println("No hay espacio para más de 6 personajes.");
			else 
				this.listaPersonajes[nPersonajes++]=p;
	}
		
		/**
		 *El metodo muestraLista muestra por consola
		 *una lista de todos aquellos personajes elegidos
		 *por los jugadores
		 *
		 */
		
		
	public void muestraLista() {
		for(int i=0; i < this.nPersonajes; i++) {
			this.listaPersonajes[i].mostrar();
		}
	}

}
