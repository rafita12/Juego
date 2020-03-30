/**
 *@author Rafael Martín Berenguer
 */

package arena;

public class Tablero {
	
	  private char [][] tablero ;
	  private int col ;
	  private int fil ;
	  private int filTorre;
	  

	  public Tablero(int tamano){
	        
	        this.tablero=new char [tamano][tamano];
	        this.col=0;
	        this.fil=0;
	        this.filTorre=1;
	    }
	  
	  /**
		 *El metodo verTablero va a mostrar por pantalla 
		 *el tablero al completo(todos sus alrededores) y su 
		 *interior en el que nos vamos a encontrar con cada todo
		 *y el rio de separacion de campos.
		 *
		 *Cada dibujo tiene su comentario antes de ser manipulado.
		 *
		 */
		
	    
	    public void verTablero() {
	        
	    	System.out.println();
	    	System.out.println();
	    	
	        for (int col = 0; col < tablero[0].length * 2 + 2; col++)
	            System.out.print("-");
	        System.out.println();
	        
	        for (int fil = 0; fil < tablero.length; fil++) {
	            System.out.print("|");
	            for (int col = 0; col < tablero[fil].length; col++)
	            	
	            	//Torre grande superior.
	            	
	            	
	            	if (col>10 && col<19 && fil==filTorre) {
						System.out.print("--");
					}
	            	else if (fil == (filTorre+1) && col == 11) {
	            		System.out.print("| ");
					}else if (fil == (filTorre+1) && col == 18) {
	            		System.out.print(" |");
					}else if (fil == (filTorre+2) && col == 11) {
	            		System.out.print("| ");
					}else if (fil == (filTorre+2) && col == 18) {
	            		System.out.print(" |");
					}else if (fil == (filTorre+3) && col == 11) {
	            		System.out.print("| ");
					}else if (fil == (filTorre+3) && col == 18) {
	            		System.out.print(" |");
					}else if (fil == (filTorre+4) && col == 11) {
	            		System.out.print("| ");
					}else if (fil == (filTorre+4) && col == 18) {
	            		System.out.print(" |");
					}else if(col>10 && col<19 && fil==(filTorre+5)) {
						System.out.print("--");
					
					//Torre grande inferior.
						
					}else if(col>10 && col<19 && fil==(filTorre+27)) {
						System.out.print("--");
					}else if (fil == (filTorre+26) && col == 11) {
		            		System.out.print("| ");
						}else if (fil == (filTorre+26) && col == 18) {
		            		System.out.print(" |");
						}else if (fil == (filTorre+25) && col == 11) {
		            		System.out.print("| ");
						}else if (fil == (filTorre+25) && col == 18) {
		            		System.out.print(" |");
						}else if (fil == (filTorre+24) && col == 11) {
		            		System.out.print("| ");
						}else if (fil == (filTorre+24) && col == 18) {
		            		System.out.print(" |");
						}else if (fil == (filTorre+23) && col == 11) {
		            		System.out.print("| ");
						}else if (fil == (filTorre+23) && col == 18) {
		            		System.out.print(" |");
						}else if(col>10 && col<19 && fil==(filTorre+22)) {
							System.out.print("--");
							
						//Rio.
							
						}else if(col>4 && col<25 && fil==(filTorre+13)) {
							System.out.print("--");
						}else if(col>4 && col<25 && fil==(filTorre+14)) {
							System.out.print("--");
						}else if(col>26 && col<30 && fil==(filTorre+13)) {
							System.out.print("--");
						}else if(col>26 && col<30 && fil==(filTorre+14)) {
							System.out.print("--");
						}else if(col>-1 && col<3 && fil==(filTorre+13)) {
							System.out.print("--");
						}else if(col>-1 && col<3 && fil==(filTorre+14)) {
							System.out.print("--");
							
						//Puente derecho.
							
						}else if (fil == (filTorre+13) && col == 25) {
		            		System.out.print("| ");
						}else if (fil == (filTorre+14) && col == 25) {
		            		System.out.print("| ");
						}else if (fil == (filTorre+13) && col == 26) {
		            		System.out.print(" |");
						}else if (fil == (filTorre+14) && col == 26) {
		            		System.out.print(" |");
		            		
		            	//Puente izquierdo.
		            		
						}else if (fil == (filTorre+13) && col == 4) {
		            		System.out.print(" |");
						}else if (fil == (filTorre+14) && col == 4) {
		            		System.out.print(" |");
						}else if (fil == (filTorre+13) && col == 3) {
		            		System.out.print("| ");
						}else if (fil == (filTorre+14) && col == 3) {
		            		System.out.print("| ");
							
						//Torre pequequeña superior izquierda.
							
						}else if(col>2 && col<6 && fil==(filTorre+3)) {
							System.out.print("--");
						}else if (fil == (filTorre+4) && col == 3) {
			            		System.out.print("| ");
							}else if (fil == (filTorre+4) && col == 5) {
			            		System.out.print(" |");
							}else if (fil == (filTorre+5) && col == 3) {
			            		System.out.print("| ");
							}else if (fil == (filTorre+5) && col == 5) {
			            		System.out.print(" |");
							}else if(col>2 && col<6 && fil==(filTorre+6)) {
								System.out.print("--");
			            		
			            //Torre pequequeña superior derecha.
								
							}else if(col>23 && col<27 && fil==(filTorre+3)) {
								System.out.print("--");
							}else if (fil == (filTorre+4) && col == 24) {
				            		System.out.print("| ");
							}else if (fil == (filTorre+4) && col == 26) {
				            		System.out.print(" |");
							}else if (fil == (filTorre+5) && col == 24) {
				            		System.out.print("| ");
							}else if (fil == (filTorre+5) && col == 26) {
				            		System.out.print(" |");
							}else if(col>23 && col<27 && fil==(filTorre+6)) {
									System.out.print("--");
				            	
									
							//Torre pequequeña inferior izquierda.
									
							}else if(col>2 && col<6 && fil==(filTorre+24)) {
								System.out.print("--");
							}else if (fil == (filTorre+23) && col == 3) {
				            		System.out.print("| ");
								}else if (fil == (filTorre+23) && col == 5) {
				            		System.out.print(" |");
								}else if (fil == (filTorre+22) && col == 3) {
				            		System.out.print("| ");
								}else if (fil == (filTorre+22) && col == 5) {
				            		System.out.print(" |");
								}else if(col>2 && col<6 && fil==(filTorre+21)) {
									System.out.print("--");
				            		
				            //Torre pequequeña inferior derecha.
									
								}else if(col>23 && col<27 && fil==(filTorre+24)) {
									System.out.print("--");
								}else if (fil == (filTorre+23) && col == 24) {
					            		System.out.print("| ");
								}else if (fil == (filTorre+23) && col == 26) {
					            		System.out.print(" |");
								}else if (fil == (filTorre+22) && col == 24) {
					            		System.out.print("| ");
								}else if (fil == (filTorre+22) && col == 26) {
					            		System.out.print(" |");
								}else if(col>23 && col<27 && fil==(filTorre+21)) {
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


