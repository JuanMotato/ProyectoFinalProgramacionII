package co.uniquindio.edu.instaCompra.model;

public class Cliente {
	
	private String ciudad;
	private String departamento;
	private String documento;
	private String nombres;
	private String apellidos;
	private String correo;
	private String telefono;
	
	
	
	public Cliente(String ciudad, String departamento, String documento, String apellidos, String nombres,String correo, String telefono) {
		super();
		this.ciudad = ciudad;
		this.departamento = departamento;
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.telefono = telefono;
	}
	
	public Cliente() {
		
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
	

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [ciudad=" + ciudad + ", departamento=" + departamento + ", documento=" + documento
				+ ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo + ", telefono=" + telefono
				+ "]";
	}

}
