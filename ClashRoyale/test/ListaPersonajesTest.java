/**
 *@author Rafael Mart�n Berenguer
 *
 *Pruebas de la clase Lista Personajes
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

import Jugadores.ListaPersonajes;


public class ListaPersonajesTest {

	@Test
	public void ListaLlenaTest() {
		ListaPersonajes listaLlena = new ListaPersonajes(6);
		assertEquals( "No hay espacio para m�s de 6 personajes.", listaLlena.arrayCompleto());
	}
}


