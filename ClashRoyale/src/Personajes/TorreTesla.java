/**
 *@author Francisco Javier Frances Pardo
 *Constructor con 1 parametro
 *@param cura   cura de la unidad hacia la torre
 */

package Personajes;

public class TorreTesla extends Jugadores.Personajes {

	private int cura;

	public TorreTesla(String nombre) {
		super(nombre);
		this.cura = 50;

	}
	
	public TorreTesla(String nombre, int cura) {
		super(nombre);
		this.cura=cura;
	}

	public int getDano() {
		return cura;
	}

	public void setDano(int cura) {
		this.cura = cura;
	}

	
}

