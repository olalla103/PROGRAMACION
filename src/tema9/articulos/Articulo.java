package tema9.articulos;

public class Articulo implements Comparable<Object> {
	static Integer cont = 0;
	Integer codigo = 0;
	String descripcion;
	Double precioCompra, precioVenta;
	Integer stock;

	public Articulo(String descripcion, Double precioCompra, Double precioVenta, Integer stock) {
		codigo = cont++;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	// GETTERS AND SETTERS
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Integer getCont() {
		return cont;

	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Articulo Código: " + codigo + " Descripcion: " + descripcion + " Precio de compra: " + precioCompra
				+ " Precio de venta: " + precioVenta + " Stock: " + stock + "\n";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.getCodigo() - ((Articulo) o).getCodigo();
	}

}
