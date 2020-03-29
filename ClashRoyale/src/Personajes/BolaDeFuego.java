package Personajes;
/**
 *@author Fran
 *Constructor con 1 parametro
 *@param dano   daño de la unidad
 */
public class BolaDeFuego extends Jugadores.Personajes{
	int dano=75;
	
	public  BolaDeFuego(String nombre, int dano) {
		super(nombre);
		this.dano=dano;
	}

	public int dano(int dano) {
		return dano;
		
	}
}
