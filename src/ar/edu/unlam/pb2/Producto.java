package ar.edu.unlam.pb2;

public class Producto {
	private Integer codigo;
	private String descripcion;
	private Estado tipoEstado;
	public Producto(Integer codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.tipoEstado=Estado.DISPONIBLE;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Estado getEstadoActual() {
		
		return this.tipoEstado;
	}
	
	public Estado getTipoEstado() {
		return tipoEstado;
	}
	public void setTipoEstado(Estado tipo) {
		this.tipoEstado = tipo;
	}
	
	

}
