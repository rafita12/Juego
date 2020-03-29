package arena;

public class Tablero {
	
	  private char [][] tablero ;
	  private int col ;
	  private int fil ;
	  

	  public Tablero(int tamano){
	        
	        this.tablero=new char [tamano][tamano];
	        this.col=0;
	        this.fil=0;
	    }
	    
	    public void verTablero() {
	        
	        for (int col = 0; col < tablero[0].length * 2 + 2; col++)
	            System.out.print("-");
	        System.out.println();
	        
	        for (int fil = 0; fil < tablero.length; fil++) {
	            System.out.print("|");
	            for (int col = 0; col < tablero[fil].length; col++)
	            	if (col>6 && col<12 && fil==1) {
						System.out.print("--");
					}
	            	else if (fil == 2 && col == 7) {
	            		System.out.print("| ");
					}else if (fil == 2 && col == 11) {
	            		System.out.print(" |");
					}else if (fil == 3 && col == 7) {
	            		System.out.print("| ");
					}else if (fil == 3 && col == 11) {
	            		System.out.print(" |");
					}else if (fil == 4 && col == 7) {
	            		System.out.print("| ");
					}else if (fil == 4 && col == 11) {
	            		System.out.print(" |");
					}else if(col>6 && col<12 && fil==5) {
						System.out.print("--");
					}else
						System.out.print("  ");
	            
	            
	                    
	            System.out.println("|");
	            }
	            for (int col = 0; col < tablero[0].length * 2 + 2; col++)
	                System.out.print("-");
	            System.out.println();
	            

	}
	
	}


