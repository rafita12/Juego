import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.TorreInfernal;

class TorreInfernalTest {

	@Test
	public void TorreInfernal_Test() {
		TorreInfernal torreinfernal = new TorreInfernal("Torre Tesla", 75);
		assertEquals(75, torreinfernal.getCura());
	}

}
