/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 *@param dano   daño de la unidad
 */

package Personajes;

public class Principe  extends Jugadores.Personajes {
	private int dano;

	public Principe(String nombre) {
		super(nombre);
		this.dano = 80;

	}

	public int dano(int dano) {
		return dano;

	}
}