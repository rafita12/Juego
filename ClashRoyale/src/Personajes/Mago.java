package Personajes;

/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 *@param dano   daño de la unidad
 *@param cura   cura de la torre
 */
public class Mago extends Jugadores.Personajes {
	private int dano = 55;
	private int cura = 100;

	public Mago(String nombre, int dano, int cura) {
		super(nombre);
		this.dano = dano;
		this.cura = cura;
	}

	public int dano(int dano) {
		return dano;
	}

	public int cura(int cura) {
		return cura;
	}

}
