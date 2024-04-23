package tema9.app1112;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaString nueva = new ListaString();
		nueva.aniadir("Hola");
		nueva.aniadir("me");
		nueva.aniadir("llamo");
		nueva.aniadir("Olalla");
		System.out.println(nueva.toString());

		ListaString nueva2 = new ListaString();
		nueva2.aniadir("Hola");
		nueva2.aniadir("me");
		nueva2.aniadir("llamo");
		nueva2.aniadir("Olalla");
		System.out.println(nueva2.equals(nueva));

	}

}
