package co.uniquindio.edu.instaCompra.model;

public class Producto {
	
	private int codigo;
	private String nombre;
	private String sede;
	private Categoria categoria;
	private double precio;
	private int stock;
	
	public Producto(int codigo, String sede, Categoria categoria, double precio, int stock, String nombre) {
		super();
		this.codigo = codigo;
		this.sede = sede;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.nombre = nombre;
	}
	
	
	
	public Producto() {
		
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", sede=" + sede + ", categoria=" + categoria
				+ ", precio=" + precio + ", stock=" + stock + "]";
	}

}
