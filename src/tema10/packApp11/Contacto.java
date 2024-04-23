package tema10.packApp11;

public class Contacto {
	String nombre, telefono;

	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " Teléfono: " + telefono + "\n";
	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
