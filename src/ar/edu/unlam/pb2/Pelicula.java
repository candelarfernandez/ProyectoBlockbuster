package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Pelicula extends Producto implements Vendible, Alquilable{

	private TipoGenero genero;
	private Integer anio;
	private String director;
	private Set<String> actores;
	private Double precioVenta;
	private Double precioAlquiler;
	private TipoClasificacion clasificacion;
	
	
	public Pelicula(Integer codigo, String descripcion, TipoGenero genero, Integer anio, String director) {
		super(codigo, descripcion);
		// TODO Auto-generated constructor stub
		this.genero=genero;
		this.anio=anio;
		this.director=director;
		this.actores=new HashSet<>();
		this.precioVenta=0.0;
		this.precioAlquiler=0.0;
		this.clasificacion=TipoClasificacion.APTA;

	}

	public TipoGenero getGenero() {
		return genero;
	}

	public void setGenero(TipoGenero genero) {
		this.genero = genero;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}


	public Set<String> getActores() {
		return actores;
	}

	public void setActores(Set<String> actores) {
		this.actores = actores;
	}


	public TipoClasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(TipoClasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public void agregarActor(String actor) {
		this.actores.add(actor);
		
	}

	public Boolean actua(String actor) {
		for (String string : actores) {
			if(string.equals(actor)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void setPrecioVenta(Double pRECIO_VENTA) {
		this.precioVenta=pRECIO_VENTA;
	}

	@Override
	public Double getPrecioVenta() {
		return this.precioVenta;
	}

	@Override
	public void setPrecioAlquiler(Double pRECIO_ALQUILER) {
		this.precioAlquiler=pRECIO_ALQUILER;
		
	}

	@Override
	public Double getPrecioAlquiler() {
		// TODO Auto-generated method stub
		return this.precioAlquiler;
	}



}
