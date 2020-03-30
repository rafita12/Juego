import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Mago;

class MagoTest {

	@Test
	public void Mago_test() {
		Mago mago = new Mago("Mago", 55,100);
		assertEquals(55, mago.getDano(),mago.getCura());
	}

}
