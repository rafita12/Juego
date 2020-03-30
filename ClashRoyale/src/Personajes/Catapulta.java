package Personajes;

/**
 * @author Francisco Javier Frances Pardo 
 * Constructor con 1 parametro
 * @param dano daño de la unidad
 */

public class Catapulta extends Jugadores.Personajes {
	private int dano;

	public Catapulta(String nombre) {
		super(nombre);
		this.dano = 75;
	}

	public Catapulta(String nombre, int dano) {
		super(nombre);
		this.dano = dano;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

}
