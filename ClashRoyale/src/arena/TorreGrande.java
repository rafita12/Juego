package arena;

public class TorreGrande {

	private int vida;
	private char TorreGrande[][];

	public TorreGrande(int vida, int tamano) {
		this.vida = vida;
		this.TorreGrande = new char[tamano][tamano];
	}

	public void implementarTorreGrande() {

	
	 for (int col = 0; col < TorreGrande[0].length * 2 + 2; col++)
         System.out.print("-");
     System.out.println();
     for (int fil = 0; fil < TorreGrande.length; fil++) {
         System.out.print("|");
         for (int col = 0; col < TorreGrande[fil].length; col++)
                     System.out.print("  ");
                 
         System.out.println("|");
         }
         for (int col = 0; col < TorreGrande[0].length * 2 + 2; col++)
             System.out.print("-");
         System.out.println();
	}
	
	
}
