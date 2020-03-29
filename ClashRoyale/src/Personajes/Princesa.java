package Personajes;

/**
 * @author Francisco Javier Frances Pardo
 * Constructor con 1 parametro
 * @param dano daño de la unidad
 */

public class Princesa {
	private int cura = 150;

	public Princesa(int cura) {
		this.cura = cura;
	}

	public int cura(int cura) {
		return cura;
	}
}