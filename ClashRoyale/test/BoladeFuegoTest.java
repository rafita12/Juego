import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.BolaDeFuego;

class BoladeFuegoTest {

		@Test
		public void BolaFuego_test() {
			BolaDeFuego boladefuego = new BolaDeFuego("Bola de Fuego", 75);
			assertEquals(75, boladefuego.getDano());
		}

	}
