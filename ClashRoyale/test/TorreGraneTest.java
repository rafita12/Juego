import static org.junit.Assert.*;

import org.junit.Test;

import arena.TorrePequena;


public class TorreGraneTest {

	@Test
	public void TorreGtest() {
		TorrePequena torreG = new TorrePequena(1000, 500);
		assertEquals(1000, torreG.getVida());
		assertEquals(500, torreG.getDefensa());
	}

}
