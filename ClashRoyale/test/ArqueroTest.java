import static org.junit.Assert.*;

import org.junit.Test;

import Personajes.Arqueros;


public class ArqueroTest {

	@Test
	public void arquero_test() {
		Arqueros arquero = new Arqueros("Arquera", 50);
		assertEquals(50, arquero.dano(50));
	}

}
