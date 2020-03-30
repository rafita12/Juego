import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Personajes.Princesa;

/**
 *@author Francisco Javier Frances Pardo
 *Prueba de la cura de este personaje
 */


class PrincesaTest {

	@Test
	public void Princesa_test() {
		Princesa princesa = new Princesa("Princesa", 150);
		assertEquals(150, princesa.getCura());
	}

}
