package arena;

public class Tablero {
	
	  private char [][] tablero ;

	    public Tablero(int Tamaño){
	        
	        this.tablero=new char [Tamaño][Tamaño];
	    }
	    
	    public void verTablero() {
	        
	        for (int col = 0; col < tablero[0].length * 2 + 2; col++)
	            System.out.print("-");
	        System.out.println();
	        for (int fil = 0; fil < tablero.length; fil++) {
	            System.out.print("|");
	            for (int col = 0; col < tablero[fil].length; col++)
	                        System.out.print("  ");
	                    
	            System.out.println("|");
	            }
	            for (int col = 0; col < tablero[0].length * 2 + 2; col++)
	                System.out.print("-");
	            System.out.println();

	}
	    
	}



