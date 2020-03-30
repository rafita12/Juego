import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Arqueros;

class BoladeFuegoTest {

		@Test
		public void BolaFuego_test() {
			Arqueros arquero = new Arqueros("Bola de Fuego", 75);
			assertEquals(75, arquero.getDano());
		}

	}
