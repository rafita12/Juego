import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Principe;

class PrincipeTest {

	@Test
	public void Principe_test() {
		Principe principe = new Principe("Principe", 80);
		assertEquals(80, principe.getDano());
	}

}
