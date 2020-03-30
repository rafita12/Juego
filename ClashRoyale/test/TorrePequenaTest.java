/**
 *@author Rafael Mart�n Berenguer
 *
 *Pruebas de la clase Torre peque�a
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

import arena.TorrePequena;
import Personajes.Arqueros;


public class TorrePequenaTest {

	@Test
	public void TorrePtest() {
		TorrePequena torreP = new TorrePequena(500, 250);
		assertEquals(500, torreP.getVida());
		assertEquals(250, torreP.getDefensa());
	}

}
