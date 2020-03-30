/**
 *@author Rafael Martín Berenguer
 */

package arena;

public class TorreGrande {

	private int vida;
	private int defensa;

	public TorreGrande() {
		this.vida = 1000;
		this.defensa = 500;
		
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
