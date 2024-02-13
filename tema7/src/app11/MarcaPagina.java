package app11;

public class MarcaPagina {
	private Integer pagina;

	public MarcaPagina() {
	}

	public MarcaPagina(Integer pagina) {
		this.pagina = pagina;
	}

	public Integer getPagina() {
		return pagina;
	}

	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}

	public void aumentaPagina() {
		setPagina(pagina + 1);
	}

	public void infoPagina() {
		getPagina();
	}

	public void empezarLibro() {
		setPagina(0);
	}

	@Override
	public String toString() {
		return "Va por la página " + pagina;
	}

}
