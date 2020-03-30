/**
 *@author Rafael Martín Berenguer
 */

package arena;

public class TorrePequena {

	private int vida;
	private int defensa;

	public TorrePequena() {
		this.vida = 500;
		this.defensa = 250;
	}
	
	//Metodo constructor para las pruebas
	
	public TorrePequena(int vida, int defensa) {
		this.vida = 500;
		this.defensa = 250;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	/**
	 *El metodo consultaVida va a mostrar la vida y la defensa que tiene la torre.
	 *
	 */
	
	public void consultaVida(){
	
		System.out.println();
		System.out.println("Vida de la torre: " + this.vida);
		System.out.println("Defensa de la torre: " + this.defensa);
	
	}
	
	
}

