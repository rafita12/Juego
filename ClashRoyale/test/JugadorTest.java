/**
 *@author Francisco Javier Frances Pardo
 *Pruebas de la clase Jugador
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Jugadores.Jugador;

class JugadorTest {

	
	
	
	/**
	 *Prueba de la salida con valor 1  
	 */
	@Test
	public void turnoJugadortest1() {
		Jugador jg =new Jugador(1);
		assertEquals(1,jg.turnoJugador());
	}

	/**
	 *Prueba de la salida con valor 2  
	 */
	@Test
	public void turnoJugadortest2() {
		Jugador jg =new Jugador(2);
		assertEquals(2,jg.turnoJugador());
	}
}
 