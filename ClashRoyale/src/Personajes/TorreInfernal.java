/**
 * @author Francisco Javier Frances Pardo 
 * Constructor con 1 parametro
 * @param dano daño de la unidad
 */

package Personajes;

public class TorreInfernal  extends Jugadores.Personajes {

	private int cura;

	public TorreInfernal(String nombre) {
		super(nombre);
		this.cura = 75;
	}

	public int cura(int cura) {
		return cura;
	}
}
