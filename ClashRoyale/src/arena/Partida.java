/**
 *@author Rafael Martín Berenguer
 */

package arena;

import Jugadores.ListaPersonajes;
import Jugadores.Personajes;
import Personajes.Arqueros;
import Personajes.BolaDeFuego;
import Personajes.Caballero;
import Personajes.Catapulta;
import Personajes.Gigante;
import Personajes.Mago;
import Personajes.Princesa;
import Personajes.TorreInfernal;

public class Partida {

	public static void main(String[] args) {
		
		
		ListaPersonajes lp1=new ListaPersonajes();
		ListaPersonajes lp2=new ListaPersonajes();
		
		System.out.println("Personajes del jugador 1: ");
		System.out.println();
		lp1.elegir(new Arqueros("Arquera"));
		lp1.elegir(new BolaDeFuego("Bola de Fuego"));
		lp1.elegir(new Gigante("Gigante"));
		lp1.elegir(new Mago("Mago"));
		lp1.elegir(new Caballero("Caballero"));
		lp1.elegir(new Princesa("Princesa"));
		lp1.muestraLista();
		System.out.println("---------------");
		System.out.println("Personajes del jugador 2: ");
		System.out.println();
		lp2.elegir(new Arqueros("Arquera"));
		lp2.elegir(new BolaDeFuego("Bola de Fuego"));
		lp2.elegir(new Gigante("Gigante"));
		lp2.elegir(new Caballero("Caballero"));
		lp2.elegir(new TorreInfernal("Torre Infernal"));
		lp2.elegir(new Catapulta("Catapulta"));
		lp2.muestraLista();
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		
		
		
		//Escrito por pantalla
		
		int nTurno = 1;
		
		
		Tablero t=new Tablero(30);
		
		
		TorreGrande tG1=new TorreGrande();
		TorrePequena tPI1=new TorrePequena();
		TorrePequena tPD1=new TorrePequena();
		
		
		TorreGrande tG2=new TorreGrande();
		TorrePequena tPI2=new TorrePequena();
		TorrePequena tPD2=new TorrePequena();
		for (int i = 1; i <= nTurno; i++) {
			
			System.out.println("Turno número " + i);
			System.out.println();
			System.out.println("Torre Grande jugador 1: ");
			tG1.consultaVida();
			System.out.println("----------------");
			System.out.println("Torre Pequeña izquierda jugador 1: ");
			tPI1.consultaVida();
			System.out.println("----------------");
			System.out.println("Torre Pequeña derecha jugador 1: ");
			tPD1.consultaVida();
			System.out.println("----------------");
			System.out.println("Torre Grande jugador 2: ");
			tG2.consultaVida();
			System.out.println("----------------");
			System.out.println("Torre Pequeña izquierda jugador 2: ");
			tPI2.consultaVida();
			System.out.println("----------------");
			System.out.println("Torre Pequeña derecha jugador 2: ");
			tPD2.consultaVida();
			System.out.println("----------------");
			
			
		}
		t.verTablero();
		
		
	}


}
