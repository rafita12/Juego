import static org.junit.Assert.*;

import org.junit.Test;

import arena.TorreGrande;


public class TorreGrandeTest {

	@Test
	public void TorreGtest() {
		TorreGrande torreG = new TorreGrande(1000, 500);
		assertEquals(1000, torreG.getVida());
		assertEquals(500, torreG.getDefensa());
	}

}
