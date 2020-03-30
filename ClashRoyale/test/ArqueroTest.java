import static org.junit.Assert.*;

import org.junit.Test;

import Personajes.Arqueros;

/**
 *@author Rafael Berenguer Martin
 *Prueba del daño de este personaje
 */

public class ArqueroTest {

	@Test
	public void Arquero_Test() {
		Arqueros arquero = new Arqueros("Arquera", 50);
		assertEquals(50, arquero.getDano());
	}

}
