/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 *@param dano   daño de la unidad
 */

package Personajes;

public class Gigante extends Jugadores.Personajes {
	
	private int dano;

	public Gigante(String nombre) {
		super(nombre);
		this.dano = 100;
	}

	public int dano(int dano) {
		return dano;

	}
}