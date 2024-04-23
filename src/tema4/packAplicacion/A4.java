package tema4.packAplicacion;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias = 2, horas = 1, minutos = 35;
		System.out.println("El total de segundos es: " + calculaSegundos(dias, horas, minutos));

	}

	public static int calculaSegundos(int dias, int horas, int minutos) {
		int total = 0, sD, sH, sM;

		sD = (dias * 24) * 60 * 60;
		sH = horas * 60 * 60;
		sM = minutos * 60;
		total = sD + sH + sM;

		return total;

	}

}
