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

		Cliente cliente1 = new Cliente ("Circacia", "Quindio", "1515151", "Motato", "Juan","motato@correo", "31515451");
		Cliente cliente2 = new Cliente ("Calarca", "Quindio", "515815", "Osorio", "Jhon","Jhon@correo", "14241724");

		getListaCliente().add(cliente1);
		getListaCliente().add(cliente2);
		
		Producto producto1 = new Producto(1214, "Armenia", Categoria.TECNOLOGIA, 50000, 4, "Mause");
		Producto producto2 = new Producto(1215, "Pereira", Categoria.MOVIL, 600000, 4, "Tablet");
		
		getListProductos().add(producto1);
		getListProductos().add(producto2);

	}

	public Cliente crearCliente(String nombre, String documento, String apellidos, String correo, String telefono,
			String departamento, String ciudad) {
		
		Cliente cliente = null;
		
		
		cliente = obtenerCliente(documento);
		
		
		if (cliente == null) {
		
			cliente = new Cliente();
			
			cliente.setNombres(nombre);
			cliente.setDocumento(documento);
			cliente.setApellidos(apellidos);
			cliente.setCorreo(correo);
			cliente.setTelefono(telefono);
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
			
			//producto.setNombres(nombre);

			
			getListProductos().add(producto);
			return producto;
			
		}else {
			return null;
		}

		
	}

	private Cliente obtenerCliente(String documento) {
		
		for (Cliente cliente : listaCliente) {
			
			if (cliente.getDocumento().equals(documento)) {
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

	public  boolean eliminarCliente(String documento) {
		
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
	public boolean actualizarCliente(String documentoActual, String nombre, String apellidos, String documento, String ciudad, String departamento, String correo, String telefono) {
		
		Cliente cliente = null;
		cliente = obtenerCliente(documentoActual);
		
		if (cliente  != null) {
			
			cliente.setNombres(nombre);
			cliente.setDocumento(documento);
			cliente.setApellidos(apellidos);
			cliente.setCorreo(correo);
			cliente.setTelefono(telefono);
			cliente.setDepartamento(departamento);
			cliente.setCiudad(ciudad);
			
			return true;
		}else {
			return false;
		}
	}

}
