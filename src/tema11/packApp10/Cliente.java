package tema11.packApp10;

import java.io.Serializable;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	static Integer id;
	Integer contId = 0;
	String nombre, telf;

	public Cliente(String nombre, String telf) {
		contId++;
		id = contId;
		this.nombre = nombre;
		this.telf = telf;
	}

	public static Integer getId() {
		return id;
	}

	public static void setId(Integer id) {
		Cliente.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	@Override
	public String toString() {
		return "Cliente [ID= " + id + ", nombre=" + nombre + ", telf=" + telf + "]";
	}

}
