package tema8.r45;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piano piano = new Piano();
		piano.add(Nota.DO);
		piano.interpretar();

		Campana campana = new Campana();
		campana.add(Nota.RE);
		campana.interpretar();

	}

}
