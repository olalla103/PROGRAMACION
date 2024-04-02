package packR9;

import java.io.Serializable;
import java.util.Arrays;

public class TablaRegistros implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Registros[] tabla = new Registros[0];

	public void alta(Registros registro) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = registro;
	}

	public String mostrarListado() {
		return Arrays.toString(tabla);
	}
}
