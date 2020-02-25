package Jugadores;

import java.util.Scanner;

public class Jugador {
	Scanner sc =new Scanner(System.in);
	private boolean turno;
	private int tiempoTurno;
	
	public void usaPersonaje() {
		int array[]=new int[6];
		for(int i=0;i<6;i++) {
			System.out.println("Elija un personaje");
			array[i]=sc.nextInt();
		}
	}
	
	
	
}
