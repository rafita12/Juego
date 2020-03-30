/**
 *@author Francisco Javier Frances Pardo
 *Pruebas de la clase Jugador
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Jugadores.Jugador;

class JugadorTest {

	@Test
	public void turnoJugadortest() {
		Jugador jg =new Jugador("Arqueros",1);
		assertEquals("Es el turno del Jugador 1",jg.turnoJugador());
	}

}
 