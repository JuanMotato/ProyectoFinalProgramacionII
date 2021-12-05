package co.uniquindio.edu.instaCompra.model;

public class Producto {
	
	private int codigo;
	private String sede;
	

	public Producto(int codigo, String sede) {
		super();
		this.codigo = codigo;
		this.sede = sede;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", sede=" + sede + "]";
	}
	
	
	

}
