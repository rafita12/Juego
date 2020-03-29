package Personajes;

/**
 *
 * @author Fran
 *
 */
public class Mago extends Jugadores.Personajes {
	private int dano = 55;
	private int cura = 100;

	public Mago(String nombre, int dano, int cura) {
		super(nombre);
		this.dano = dano;
		this.cura = cura;
	}

	public int dano(int dano) {
		return dano;
	}

	public int cura(int cura) {
		return cura;
	}

}
