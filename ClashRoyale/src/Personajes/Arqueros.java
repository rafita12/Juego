/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 * @param dano   da�o de la unidad
 */


package Personajes;

public class Arqueros extends Jugadores.Personajes {
	private int dano = 50;
	
	public Arqueros(String nombre, int dano) {
		super(nombre);
		this.dano=dano;
	}


	public int dano(int dano) {
		return dano;
		

	}
}



