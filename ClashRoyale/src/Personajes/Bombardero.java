/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 *@param dano   daño de la unidad
 */

package Personajes;

public class Bombardero extends Jugadores.Personajes{

	private int dano;

	public  Bombardero(String nombre) {
		super(nombre);
		this.dano=30;
	}

	public int dano(int dano) {
		return dano;
		
	}
}
