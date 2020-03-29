package Personajes;

/**
 *
 * @author Fran
 *
 */
public class Catapulta  extends Jugadores.Personajes {
	int dano = 75;

	public Catapulta(String nombre, int dano) {
		super(nombre);
		this.dano = dano;
	}

	public int dano(int dano) {
		return dano;

	}

}
