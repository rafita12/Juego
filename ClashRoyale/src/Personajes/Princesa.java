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

	
	public Princesa(String nombre, int cura) {
		super(nombre);
		this.cura=cura;
	}

	public int getCura() {
		return cura;
	}

	public void setCura(int cura) {
		this.cura = cura;
	}

	
}

