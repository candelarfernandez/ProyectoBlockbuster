package ar.edu.unlam.pb2;

public class Videojuego extends Producto implements Alquilable{
	private TipoVideojuego tipo;
	private Double precioAlquiler;

	public Videojuego(Integer codigo, String descripcion, TipoVideojuego tipo) {
		super(codigo, descripcion);
		// TODO Auto-generated constructor stub
		this.tipo=tipo;
		this.precioAlquiler=0.0;
	}

	public TipoVideojuego getTipo() {
		return tipo;
	}

	public void setTipo(TipoVideojuego tipo) {
		this.tipo = tipo;
	}

	@Override
	public void setPrecioAlquiler(Double pRECIO_ALQUILER) {
		precioAlquiler= pRECIO_ALQUILER;
		
	}

	@Override
	public Double getPrecioAlquiler() {
		// TODO Auto-generated method stub
		return this.precioAlquiler;
	}

	

}
