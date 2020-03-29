package arena;

public class PruebaTabla {

	public static void main(String[] args) {
		TorreGrande tg1=new TorreGrande(800,3);
		TorrePequena tp1=new TorrePequena(400,1);
		TorrePequena tp2=new TorrePequena(400,1);
		Tablero t=new Tablero(20);
		TorreGrande tg2=new TorreGrande(800,3);
		TorrePequena tp3=new TorrePequena(400,1);
		TorrePequena tp4=new TorrePequena(400,1);
		
		
		tg1.implementarTorreGrande();
		tp1.implementarTorrePequena();;
		tp2.implementarTorrePequena();
		t.verTablero();
		tg2.implementarTorreGrande();
		tp3.implementarTorrePequena();
		tp4.implementarTorrePequena();
	}


}
