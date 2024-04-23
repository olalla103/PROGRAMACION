package tema4.packAplicacion;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora1 = 1, minutos1 = 35, hora2 = 2, minuto2 = 56;
		System.out.println("La diferencia de minutos que hay entre las horas introducidas es: "
				+ diferenciaMin(hora1, hora2, minutos1, minuto2));

	}

	public static int diferenciaMin(int hora1, int hora2, int minuto1, int minuto2) {
		int totalH, totalM, res;

		if (hora1 > hora2) {
			totalH = hora1 - hora2;
		} else {
			totalH = hora2 - hora1;
		}

		if (minuto1 > minuto2) {
			totalM = minuto1 - minuto2;
		} else {
			totalM = minuto2 - minuto1;
		}
		res = totalH * 60 + totalM;
		return res;
	}

}
