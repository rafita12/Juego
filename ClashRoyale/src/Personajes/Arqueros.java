/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 * @param dano   daño de la unidad
 */


package Personajes;

public class Arqueros extends Jugadores.Personajes {
	private int dano;
	
	public Arqueros(String nombre) {
		super(nombre);
		this.dano=50;
	}


	public int dano(int dano) {
		return dano;
		

	}
}



