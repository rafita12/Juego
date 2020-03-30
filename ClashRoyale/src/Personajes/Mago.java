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

	
	public Mago(String nombre, int dano, int cura) {
		super(nombre);
		this.dano=dano;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getCura() {
		return cura;
	}

	public void setCura(int cura) {
		this.cura = cura;
	}

	
}

