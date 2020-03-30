package Personajes;
/**
 *@author Fran
 *Constructor con 1 parametro
 *@param dano   daño de la unidad
 */
public class BolaDeFuego extends Jugadores.Personajes{
	int dano;
	
	public  BolaDeFuego(String nombre) {
		super(nombre);
		this.dano=75;
	}

	public int dano(int dano) {
		return dano;
		
	}
}
