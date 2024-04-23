package tema11.packMoodle1;

public class Asignatura {
	static Integer ultimoCodigo = 0;
	Integer codigo;
	String nombre;

	public Asignatura(String nombre) {
		if (codigo < 0) {
			System.out.println("Ese código no es correcto");
		} else {
			this.codigo = ultimoCodigo++;
			this.nombre = nombre;
		}
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo > ultimoCodigo) {
			this.codigo = codigo;
			ultimoCodigo = codigo;
		} else {
			System.out.println("El nuevo código debe ser mayor que el último código asignado.");
		}
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

}
