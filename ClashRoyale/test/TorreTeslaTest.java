import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Arqueros;

class TorreTeslaTest {

	@Test
	public void TorreTesla_Test() {
		Arqueros arquero = new Arqueros("Torre Tesla", 50);
		assertEquals(50, arquero.getCura());
	}

}
