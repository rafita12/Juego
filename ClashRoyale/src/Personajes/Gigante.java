package Personajes;

/**
 *
 * @author Francisco Javier Francés Pardo
 *
 */

public class Gigante extends Jugadores.Personajes {
	private int dano = 100;

	public Gigante(String nombre, int dano) {
		super(nombre);
		this.dano = dano;
	}

	public int dano(int dano) {
		return dano;

	}
}