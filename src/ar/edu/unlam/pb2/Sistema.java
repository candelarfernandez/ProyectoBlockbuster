package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Sistema {

	private String nombre;
	private Set<Producto> productos;

	public Sistema(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.productos= new HashSet<>();
	}

	public void agregarProducto(Producto nuevoProducto) throws YaExisteProducto {
		this.productos.add(nuevoProducto);
	}
	public Producto buscarProducto(Producto nuevoProducto) throws YaExisteProducto {
		for (Producto producto : productos) {
			if(productos.contains(nuevoProducto)) {
				return nuevoProducto;
			}
		}throw new YaExisteProducto();
	}

	public Boolean vender(Producto nuevoProducto, Cliente nuevoCliente) throws YaExisteProducto, ElProductoEstaVendido {
		if(this.productos.contains(nuevoProducto)) {
			if(nuevoProducto.getEstadoActual()==Estado.VENDIDO || nuevoProducto.getEstadoActual()==Estado.ALQUILADO) {
				throw new ElProductoEstaVendido();
			}
			nuevoCliente.getProductos().add(nuevoProducto);
			nuevoProducto.setTipoEstado(Estado.VENDIDO);
			return true;
		}
		
		return false;
	}

	public Boolean alquilar(Producto nuevoProducto, Cliente nuevoCliente) throws NoSePuedeAlquilar {
		if(this.productos.contains(nuevoProducto)) {{
			if(nuevoCliente.getEdad()<18 && ((Pelicula) nuevoProducto).getClasificacion()==TipoClasificacion.M18) {
				throw new NoSePuedeAlquilar();
			}
		}
			nuevoCliente.getProductosAlquilados().add(nuevoProducto);
			nuevoProducto.setTipoEstado(Estado.ALQUILADO);
			return true;
		}
		return false;
	}

	public Boolean devolver(Producto nuevoProducto, Cliente nuevoCliente) throws NoSePuedeAlquilar {
		if(alquilar(nuevoProducto, nuevoCliente) == true) {
			nuevoCliente.getProductosAlquilados().remove(nuevoProducto);
			nuevoProducto.setTipoEstado(Estado.DISPONIBLE);
			return true;
		}
		return false;
	}

}
