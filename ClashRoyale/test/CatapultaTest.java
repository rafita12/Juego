import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Catapulta;

/**
 *@author Francisco Javier Frances Pardo
 *Prueba del daño de este personaje
 */


class CatapultaTest {

	@Test
	public void Catapulta_test() {
		Catapulta catapulta = new Catapulta("Catapulta", 75);
		assertEquals(75, catapulta.getDano());
	}

}
