/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 *@param dano   daño de la unidad
 *@param cura   cura de la torre
 */

package Personajes;

public class Mago extends Jugadores.Personajes {
	private int dano;
	private int cura;

	public Mago(String nombre) {
		super(nombre);
		this.dano = 55;
		this.cura = 100;
	}

	public int dano(int dano) {
		return dano;
	}

	public int cura(int cura) {
		return cura;
	}

}
