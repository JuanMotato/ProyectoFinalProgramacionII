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


	}

}
