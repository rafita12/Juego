/**
 *@author Rafael Martín Berenguer
 */

package arena;

public class PruebaTabla {

	public static void main(String[] args) {
		
		int nTurno = 1;
		
		
		Tablero t=new Tablero(30);
		
		
		TorreGrande tG1=new TorreGrande();
		TorrePequena tPI1=new TorrePequena();
		TorrePequena tPD1=new TorrePequena();
		
		
		TorreGrande tG2=new TorreGrande();
		TorrePequena tPI2=new TorrePequena();
		TorrePequena tPD2=new TorrePequena();
		for (int i = 1; i <= nTurno; i++) {
			
			System.out.println("Turno número " + i);
			System.out.println();
			System.out.println("Torre Grande jugador 1: ");
			tG1.consultaVida();
			System.out.println("----------------");
			System.out.println("Torre Pequeña izquierda jugador 1: ");
			tPI1.consultaVida();
			System.out.println("----------------");
			System.out.println("Torre Pequeña derecha jugador 1: ");
			tPD1.consultaVida();
			System.out.println("----------------");
			System.out.println("Torre Grande jugador 2: ");
			tG2.consultaVida();
			System.out.println("----------------");
			System.out.println("Torre Pequeña izquierda jugador 2: ");
			tPI2.consultaVida();
			System.out.println("----------------");
			System.out.println("Torre Pequeña derecha jugador 2: ");
			tPD2.consultaVida();
			System.out.println("----------------");
			
			
		}
		t.verTablero();
		
		
	}


}
