import static org.junit.Assert.*;

import org.junit.Test;

import Jugadores.ListaPersonajes;


public class ListaPersonajesTest {

	@Test
	public void ListaLlenaTest() {
		ListaPersonajes listaLlena = new ListaPersonajes(6);
		assertEquals("Error", listaLlena.elegir(5));
	}
}


