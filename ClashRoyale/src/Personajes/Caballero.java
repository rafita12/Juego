package Personajes;

/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 * @param dano   daño de la unidad
 */

public class Caballero extends Jugadores.Personajes {
	private int dano = 70;

	public Caballero(String nombre, int dano) {
		super(nombre);
		this.dano = dano;
	}

	public int dano(int dano) {
		return dano;

	}
}