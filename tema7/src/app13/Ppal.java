package app13;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colores paleta = new Colores();
		paleta.aniaadeColor("rosa");
		paleta.aniaadeColor("blanco");
		paleta.aniaadeColor("salmón");
		paleta.aniaadeColor("amarillo");
		paleta.aniaadeColor("gris");
		paleta.aniaadeColor("naranja");
		System.out.println(paleta.toString());
		paleta.muestraColores(6);
	}

}
