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
		Jugador jg =new Jugador("Bombardero",1);
		assertEquals(1,jg.turnoJugador());
	}

}
 