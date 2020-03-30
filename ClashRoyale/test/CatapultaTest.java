import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Catapulta;

class CatapultaTest {

	@Test
	public void Catapulta_test() {
		Catapulta catapulta = new Catapulta("Catapulta", 75);
		assertEquals(75, catapulta.getDano());
	}

}
