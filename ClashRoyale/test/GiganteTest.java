import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Gigante;

class GiganteTest {

	@Test
	public void Gigante_test() {
		Gigante gigante = new Gigante("Gigante", 100);
		assertEquals(100, gigante.getDano());
	}

}
