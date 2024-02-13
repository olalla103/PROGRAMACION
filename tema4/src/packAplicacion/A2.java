package packAplicacion;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 3, y1 = 2, x2 = 5, y2 = 6;

		System.out.println(distancia(x1, y1, x2, y2));

	}

	public static double distancia(double x1, double y1, double x2, double y2) {
		double dis;

		dis = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

		return dis;
	}
}
