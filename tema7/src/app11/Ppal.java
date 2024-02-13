package app11;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcaPagina pagina = new MarcaPagina(10);
		System.out.println(pagina.toString());
		for (int i = 0; i < 10; i++) {
			pagina.aumentaPagina();
		}
		pagina.infoPagina();
		System.out.println(pagina.toString());

	}

}
