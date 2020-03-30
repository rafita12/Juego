import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Caballero;

class CaballeroTest {

	@Test
	public void Caballero_test() {
		Caballero caballero = new Caballero("Caballero", 70);
		assertEquals(70, caballero.getDano());
	}

}
