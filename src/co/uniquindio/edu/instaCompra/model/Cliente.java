package co.uniquindio.edu.instaCompra.model;

public class Cliente {
	
	private String ciudad;
	private String departamento;
	
	public Cliente(String ciudad, String departamento) {
		super();
		this.ciudad = ciudad;
		this.departamento = departamento;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Cliente [ciudad=" + ciudad + ", departamento=" + departamento + "]";
	}
	
	

}
