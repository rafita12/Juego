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

	
	public Gigante(String nombre, int dano) {
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

