import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.TorreInfernal;

/**
 *@author Francisco Javier Frances Pardo
 *Prueba de la cura este personaje
 */


class TorreInfernalTest {

	@Test
	public void TorreInfernal_Test() {
		TorreInfernal torreinfernal = new TorreInfernal("Torre Infernal", 75);
		assertEquals(75, torreinfernal.getCura());
	}

}
