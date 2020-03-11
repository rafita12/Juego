package arena;

public class PruebaTabla {

	public static void main(String[] args) {
		
		Tablero t=new Tablero(15);
		TorreGrande tg=new TorreGrande(800,3);
		TorrePequena tp1=new TorrePequena(400,1);
		TorrePequena tp2=new TorrePequena(400,1);
		t.verTablero();
		tg.implementarTorreGrande();
		tp1.implementarTorrePequena();
		tp2.implementarTorrePequena();
	}


}
