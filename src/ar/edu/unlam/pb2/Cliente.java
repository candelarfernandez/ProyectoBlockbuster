package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	private Integer codigo;
	private String apellido;
	private String nombre;
	private Integer edad;
	private Set<Producto> productos;
	private Set<Producto> productosAlquilados;
	public Cliente(Integer codigo, String apellido, String nombre, Integer edad) {
		super();
		this.codigo = codigo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.productos= new HashSet<>();
		this.productosAlquilados= new HashSet<>();
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	public Set<Producto> getProductosAlquilados() {
		return productosAlquilados;
	}
	public void setProductosAlquilados(Set<Producto> productosAlquilados) {
		this.productosAlquilados = productosAlquilados;
	}
	

}
