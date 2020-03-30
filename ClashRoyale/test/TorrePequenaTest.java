/**
 *@author Rafael Martín Berenguer
 *
 *Pruebas de la clase Torre pequeña
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

import arena.TorrePequena;



public class TorrePequenaTest {

	@Test
	public void TorrePtest() {
		TorrePequena torreP = new TorrePequena(500, 250);
		assertEquals(500, torreP.getVida());
		assertEquals(250, torreP.getDefensa());
	}

}
