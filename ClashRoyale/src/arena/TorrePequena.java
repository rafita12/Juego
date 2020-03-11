package arena;

public class TorrePequena {

	private int vida;
	private char tamano[][];

	public TorrePequena(int vida, int tamano) {
		
		this.vida = vida;
		this.tamano = new char[tamano][tamano];
	}

	public void implementarTorrePequena() {

	
	 for (int col = 0; col < tamano[0].length * 2 + 2; col++)
         System.out.print("-");
     System.out.println();
     for (int fil = 0; fil < tamano.length; fil++) {
         System.out.print("|");
         for (int col = 0; col < tamano[fil].length; col++)
                     System.out.print("  ");
                 
         System.out.println("|");
         }
         for (int col = 0; col < tamano[0].length * 2 + 2; col++)
             System.out.print("-");
         System.out.println();
	}
	
	
	public int getVida() {
		return vida;
	}



	public void setVida(int vida) {
		this.vida = vida;
	}



	public void consulta() {
		System.out.println();
	}
}

