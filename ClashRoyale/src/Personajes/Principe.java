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

	public Principe(String nombre, int dano) {
		super(nombre);
		this.dano=dano;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	
}

