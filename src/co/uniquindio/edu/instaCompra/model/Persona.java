package co.uniquindio.edu.instaCompra.model;

public class Persona {
	
	private int documento;
	private String nombres;
	private String fecchaNacimiento;
	private String correo;
	private String direccion;
	
	public Persona(int documento, String nombres, String fecchaNacimiento, String correo, String direccion) {
		
		this.documento = documento;
		this.nombres = nombres;
		this.fecchaNacimiento = fecchaNacimiento;
		this.correo = correo;
		this.direccion = direccion;
	}
	
	public Persona() {
		

	}
	
	
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getFecchaNacimiento() {
		return fecchaNacimiento;
	}
	public void setFecchaNacimiento(String fecchaNacimiento) {
		this.fecchaNacimiento = fecchaNacimiento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
