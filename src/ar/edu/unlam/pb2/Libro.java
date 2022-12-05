package ar.edu.unlam.pb2;

public class Libro extends Producto implements Vendible{
	private String autor;
	private String editorial;
	private Double precioVenta;

	public Libro(Integer codigo, String descripcion, String autor, String editorial) {
		super(codigo, descripcion);
		// TODO Auto-generated constructor stub
		this.autor=autor;
		this.editorial=editorial;
		this.precioVenta=0.0;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	

	@Override
	public void setPrecioVenta(Double pRECIO_VENTA) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.precioVenta;
	}

}
