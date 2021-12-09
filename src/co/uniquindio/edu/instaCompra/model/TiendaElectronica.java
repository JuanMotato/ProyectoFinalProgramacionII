package co.uniquindio.edu.instaCompra.model;

import java.util.ArrayList;

public class TiendaElectronica {

	ArrayList <Cliente> listaCliente;
	ArrayList <Producto> listProductos;
	ArrayList <Sede> listSedes;
	ArrayList <Administrador> listAdministrador;
	ArrayList <Venta> listaVentas;

	/**
	 * @param listaCliente
	 * @param listProductos
	 * @param listSedes
	 * @param listAdministrador
	 */
	public TiendaElectronica(Sede sede, Administrador administradorNacional, Administrador administradorLocal,
			ArrayList<Cliente> listaCliente, ArrayList<Producto> listProductos, ArrayList<Sede> listSedes,
			ArrayList<Administrador> listAdministrador) {
		super();

		this.listaCliente = listaCliente;
		this.listProductos = listProductos;
		this.listSedes = listSedes;
		this.listAdministrador = listAdministrador;

		
	}
	
	public TiendaElectronica() {
		listaCliente = new ArrayList<Cliente>();
		listProductos = new ArrayList<Producto>();
		listSedes = new ArrayList<Sede>();
		listAdministrador = new ArrayList<Administrador>();
		
		inicializarDatos();
	}

	public ArrayList<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(ArrayList<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public ArrayList<Producto> getListProductos() {
		return listProductos;
	}

	public void setListProductos(ArrayList<Producto> listProductos) {
		this.listProductos = listProductos;
	}

	public ArrayList<Sede> getListSedes() {
		return listSedes;
	}

	public void setListSedes(ArrayList<Sede> listSedes) {
		this.listSedes = listSedes;
	}

	public ArrayList<Administrador> getListAdministrador() {
		return listAdministrador;
	}

	public void setListAdministrador(ArrayList<Administrador> listAdministrador) {
		this.listAdministrador = listAdministrador;
	}

	public ArrayList<Venta> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(ArrayList<Venta> listaVentas) {
		this.listaVentas = listaVentas;
	}

	private void inicializarDatos() {
		/**
		 * Datos inicializados de Cliente
		 * */

		Cliente cliente1 = new Cliente ("Circacia", "Quindio", 1515151, "Juan","motato@correo", "E Porvenir", "19-01-2001");
		Cliente cliente2 = new Cliente ("Calarca", "Quindio", 515815,"Jhon", "Jhon@correo", "San Jose", "06-10-2000");

		getListaCliente().add(cliente1);
		getListaCliente().add(cliente2);
		
		Producto producto1 = new Producto(1214, "Armenia", Categoria.TECNOLOGIA, 50000, 4, "Mause");
		Producto producto2 = new Producto(1215, "Pereira", Categoria.MOVIL, 600000, 4, "Tablet");
		
		getListProductos().add(producto1);
		getListProductos().add(producto2);

	}

	public Cliente crearCliente(String ciudad, String departamento, int documento, String nombres,String correo, String direccion, String fechaNacimiento) {
		
		Cliente cliente = null;
		
		
		cliente = obtenerCliente(documento);
		
		
		if (cliente == null) {
		
			cliente = new Cliente();
			
			cliente.setNombres(nombres);
			cliente.setDocumento(documento);
			cliente.setDireccion(direccion);
			cliente.setCorreo(correo);
			cliente.setFecchaNacimiento(fechaNacimiento);;
			cliente.setDepartamento(departamento);
			cliente.setCiudad(ciudad);
			
			getListaCliente().add(cliente);
			return cliente;
			
		}else {
			return null;
		}

		
	}
	
	public Producto crearProducto(int codigo, String sede,Categoria categoria, double precio, int stock, String nombre) {
		
		Producto producto = null;
		
		
		producto = obtenerProducto(codigo);
		
		
		if (producto == null) {
		
			producto = new Producto();
			
			producto.setCodigo(codigo);
			producto.setSede(sede);
			producto.setCategoria(categoria);
			producto.setPrecio(precio);
			producto.setStock(stock);
			producto.setNombre(nombre);

			
			getListProductos().add(producto);
			return producto;
			
		}else {
			return null;
		}

		
	}

	private Cliente obtenerCliente(int documento) {
		
		for (Cliente cliente : listaCliente) {
			
			if (cliente.getDocumento()==documento) {
				return cliente;
			}
			
		}
		
		return null;
	}
	
	private Producto obtenerProducto(int codigo) {
		
		for (Producto producto : listProductos) {
			
			if (producto.getCodigo()==codigo) {
				return producto;
			}
			
		}
		
		return null;
	}

	public  boolean eliminarCliente(int documento) {
		
		Cliente cliente = null;
		cliente = obtenerCliente(documento);
		
		if (cliente  != null) {
			getListaCliente().remove(cliente);
			return true;
		}else {
			return false;
		}
		
	}

	//metodo actuallizar cliente
	public boolean actualizarCliente(int documentoActual, String ciudad, String departamento, int documento, String nombres,String correo, String direccion, String fechaNacimiento) {
		
		Cliente cliente = null;
		cliente = obtenerCliente(documentoActual);
		
		if (cliente  != null && documentoActual==documento ) {
			
			cliente.setNombres(nombres);
			cliente.setDocumento(documento);
			cliente.setDireccion(direccion);;
			cliente.setCorreo(correo);
			cliente.setFecchaNacimiento(fechaNacimiento);
			cliente.setDepartamento(departamento);
			cliente.setCiudad(ciudad);
			
			return true;
		}else {
			return false;
		}
	}

	public boolean eliminarProducto(int codigo) {
		
		Producto producto = null;
		producto = obtenerProducto(codigo);
		
		if (producto  != null) {
			getListProductos().remove(producto);
			return true;
		}else {
			return false;
		}
	}

	public boolean actualizarProducto(int codigoActual, int codigo, String sede, Categoria categoria, Double precio, int stock, String nombre) {

		Producto producto = null;
		producto = obtenerProducto(codigoActual);
		
		if (producto  != null && codigoActual == codigo) {

			producto.setCodigo(codigo);
			producto.setSede(sede);
			producto.setCategoria(categoria);
			producto.setPrecio(precio);
			producto.setStock(stock);
			producto.setNombre(nombre);

			return true;
		}else {
			return false;
		}
	}
	
	public boolean validarProducto(int id) {

		int idProduct=0;
		boolean existe=false;

		Producto productoAux;

		for(int i=0; i<listProductos.size(); i++){

			productoAux=listProductos.get(i);
			idProduct=productoAux.getCodigo();

			if(idProduct==id){

				existe=true;

				return existe;
			}
		}
		return existe;
	}
	
	public Producto buscarProducto(int codigoBuscar) {

		Producto produAux = null;
		int  idProductoB = 0;


		for (int i=0; i<listProductos.size(); i++){

			produAux=listProductos.get(i);

			if(produAux!=null){

				idProductoB=produAux.getCodigo();
				if(idProductoB==codigoBuscar){
					break;
				}
			}
		}
		return produAux;
	}
	

}
