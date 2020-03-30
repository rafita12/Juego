import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Bombardero;

class BombarderoTest {

	@Test
	public void Bombardero_Test() {
		Bombardero bombardero = new Bombardero("Bombardero", 30);
		assertEquals(30, bombardero.getDano());
	}

}
