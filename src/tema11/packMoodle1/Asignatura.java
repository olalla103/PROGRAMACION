package tema11.packMoodle1;

public class Asignatura {
	Integer codigo;
	String nombre;

	public Asignatura(String nombre,Integer codigo) {
		if (codigo < 0) {
			System.out.println("Ese código no es correcto");
		} else {
			this.codigo = codigo;
			this.nombre = nombre;
		}
	}


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}



	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

}
