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
		this.listaPersonajes = new Personajes[11];
		this.nPersonajes = 0;
	}

		
		public void elegir(Personajes p) {
			if (this.nPersonajes == 100)
				System.out.println("No hay memoria para más productos.");
			else 
				this.listaPersonajes[nPersonajes++]=p;
	}
		
		
	public void muestraLista() {
		for(int i=0; i < this.nPersonajes; i++) {
			this.listaPersonajes[i].mostrar();
		}
	}

}
