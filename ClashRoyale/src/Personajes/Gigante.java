package Personajes;

/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 *@param dano   daño de la unidad
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