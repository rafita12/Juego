/**
 *@author Rafael Martín Berenguer
 */

package Jugadores;

/**
 *La clase Jugadores tiene como herencia a todos los jugadores que van
 *a tener todos ellos un nombre.
 *
 */


	public class Personajes {

		private String nombre;
		
		public Personajes(String nombre){
		
			this.nombre = nombre;
	}
		
		public String pruebaPers(){
			
			return this.nombre;
	}
		
		/**
		 *El metodo mostrar va a mostrar cada uno de los nombres de los
		 *personajes elegidos por el jugador en consola.
		 * @return 
		 *
		 */
		
	public void mostrar(){
		System.out.println(nombre);
	}

}
