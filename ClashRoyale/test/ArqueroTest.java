import static org.junit.Assert.*;

import org.junit.Test;

import Personajes.Arqueros;


public class ArqueroTest {

	@Test
	public void empP1_Test() {
		Arqueros arquero = new Arqueros("Arquera", 50);
		assertEquals("Arquera", arquero.dano(50));
	}

}
