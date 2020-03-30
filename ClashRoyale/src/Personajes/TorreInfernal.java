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

	public TorreInfernal(String nombre, int cura) {
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

