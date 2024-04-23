package tema7.resuelta7;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "cuyo nombre no quiero acordarme";
		int longitud = 200;
//28
		Texto t1 = new Texto(txt, longitud);
		t1.insertarPpio("En un lugar de la Mancha");
		t1.insertarFinal("ella y su grupo amiga paresen las bra");
		t1.cuentaVocales();
	}

}
