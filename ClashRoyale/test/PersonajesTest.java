/**
 *@author Rafael Martín Berenguer
 *
 *Pruebas de la clase Personajes
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

import Jugadores.Personajes;


public class PersonajesTest {

	@Test
	public void PersoTest() {
		Personajes pers = new Personajes("Arquera");
		String expected = "Arquera";
		assertEquals("Devuelve Arquera", expected, pers.pruebaPers());
	}

	}


