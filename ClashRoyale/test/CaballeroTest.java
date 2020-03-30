import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Caballero;

/**
 *@author Francisco Javier Frances Pardo
 *Prueba del da�o de este personaje
 */


class CaballeroTest {

	@Test
	public void Caballero_test() {
		Caballero caballero = new Caballero("Caballero", 70);
		assertEquals(70, caballero.getDano());
	}

}
