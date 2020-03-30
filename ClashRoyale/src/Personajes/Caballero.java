package Personajes;

/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 * @param dano   daño de la unidad
 */

public class Caballero extends Jugadores.Personajes {
	private int dano;

	public Caballero(String nombre) {
		super(nombre);
		this.dano = 70;
	}

	public int dano(int dano) {
		return dano;

	}
}