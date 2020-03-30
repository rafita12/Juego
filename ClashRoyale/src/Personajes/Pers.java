/**
 * @author Francisco Javier Frances Pardo
 * Constructor con 3 parametros
 * @param danoPersonaje daño de la unidad
 * @param cura vida que le suma a la torre
 * @param listaPersonajes array con los nombres de los personajes
 */
package Personajes;

public class Pers {

	private int dano;
	private int cura;
	private String[] listaPersonajes = new String[] { "Arqueros", "Bola de Fuego", "Bombardero", "Caballero", "Catapulta",
			"Gigante", "Mago", "Princesa", "Principe", "Torre Infernal", "Torre Tesla" };
	
	/**
	 *El metodo atacar restara vida a la torre del otro jugador.
	 * @param danoPersonaje daño del personaje
	 */
	
	public int atacar() {
		return dano;
	}
	
	/**
	 *El metodo defender sumara vida a la torre propia.
	 * @param cura daño del personaje
	 */
	
	public int defender() {
		return cura;
	}
	
	
}
