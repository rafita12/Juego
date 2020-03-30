/**
 * @author Francisco Javier Frances Pardo
 * Constructor con 1 parametro
 * @param dano daño de la unidad
 */

package Personajes;

public class Princesa  extends Jugadores.Personajes {
	private int cura;

	public Princesa(String nombre) {
		super(nombre);
		this.cura = 150;
	}

	public int cura(int cura) {
		return cura;
	}
}