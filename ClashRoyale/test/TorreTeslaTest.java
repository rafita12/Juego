import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Arqueros;
import Personajes.TorreTesla;

class TorreTeslaTest {

	@Test
	public void TorreTesla_Test() {
		TorreTesla torretesla = new TorreTesla("Torre Tesla", 50);
		assertEquals(50, torretesla.getCura());
	}

}
