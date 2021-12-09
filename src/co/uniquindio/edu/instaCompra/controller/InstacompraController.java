package co.uniquindio.edu.instaCompra.controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import co.uniquindio.edu.instaCompra.Aplicacion;
import co.uniquindio.edu.instaCompra.model.Categoria;
import co.uniquindio.edu.instaCompra.model.Cliente;
import co.uniquindio.edu.instaCompra.model.Producto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InstacompraController {


	Aplicacion aplicacion;
	ObservableList<Cliente> listaClientesData = FXCollections.observableArrayList();
	
	ObservableList<Producto> listaProductosData = FXCollections.observableArrayList();

	Cliente clienteSeleccionado;
	Producto productoSeleccionado;

	@FXML
	private TableColumn<?, ?> tblListaVenta;

	@FXML
	private TableColumn<Cliente, String> colNombre1;
	
	@FXML
	private TableColumn<Producto, String> colNombre;
	
	@FXML
    private ComboBox<Categoria> cbxCategoriaProducto;

	@FXML
	private TableColumn<Producto, Categoria> colCategoria;

	@FXML
	private TextField txtDocumento;

	@FXML
	private TextField txtPrecio;

	@FXML
	private TableColumn<Producto, Integer> colStock;

	@FXML
	private TableColumn<?, ?> tblProductoMasVendido;

	@FXML
	private TextField txtNombre;

	@FXML
	private TableColumn<Cliente, String> colDocumento;

	@FXML
	private TableColumn<?, ?> tblClientesMayoresCompras;

	@FXML
	private Button btnAgregarProducto;

	@FXML
	private TableColumn<Producto, Double> colPrecio;

	@FXML
	private TableColumn<Cliente, String> colCorreo;

	@FXML
	private TableView<Producto> tblListaProductos;

	@FXML
	private TextField txtTelefono;

	@FXML
	private TextField txtAdministracionRangoSede;

	@FXML
	private ComboBox<?> cbxVentaSede;

	@FXML
	private TextField txtAdministracionRangoProducto;

	@FXML
	private TextField txtNombres;

	@FXML
	private TextField txtCiudad;

	@FXML
	private Button btnAgregarCliente;

	@FXML
	private TextField txtDepartamento;

	@FXML
	private Button btnActualizarProducto;

	@FXML
	private TableView<?> tblVentas;

	@FXML
	private TableView<Cliente> tblListaClientes;

	@FXML
	private Button btnRealizarVenta;

	@FXML
	private Button btnNuevoCliente;

	@FXML
	private TextField txtCategoria;

	@FXML
	private TableColumn<Producto, Integer> colCodigo;

	@FXML
	private TextField txtApellidos;

	@FXML
	private TextField txtStock;

	@FXML
	private Button btnActualizarCliente;

	@FXML
	private ComboBox<String> cbxSede;

	@FXML
	private TextField txtCodigo;

	@FXML
	private ComboBox<?> cbxCliente;

	@FXML
	private TextField txtCorreo;

	@FXML
	private TextField txtVentaProducto;

	@FXML
	private TableColumn<Cliente, String> colApellido;

	@FXML
	private TableColumn<?, ?> tblSedesProductosDisponibles;

	@FXML
	private Button btnEliminarProducto;

	@FXML
	private TableColumn<Cliente, String> colCiudad;

	@FXML
	private Button btnEliminarCliente;

	@FXML
	private TableColumn<Cliente, String> colDepartamento;

	@FXML
	private TextField txtAdministracionCodigoProducto;

	@FXML
	private TableColumn<Cliente, String> colTelefono;

	@FXML
	private Button btnBuscar;

	@FXML
	private TableColumn<Producto, String> colSede;

	public InstacompraController() {

	}

	@FXML
	void agregarCllienteEvent(ActionEvent event) {

		agregarCliente();

	}

	@FXML
	void actualizarClienteEvent(ActionEvent event) {

		actualizarCliente();
	}


	@FXML
	void eliminarClienteEvent(ActionEvent event) {

		eliminarCliente();
	}


	@FXML
	void nuevoClienteEvent(ActionEvent event) {

		nuevoCliente();

	}


	@FXML
	void agregarProductoEvent(ActionEvent event) {
		agregarProducto();
	}

	@FXML
	void actualizarProductoEvent(ActionEvent event) {

	}

	@FXML
	void eliminarProductoEvent(ActionEvent event) {     

		eliminarProducto();
		
	}


	@FXML
	void realizarVentaEvent(ActionEvent event) {

	}

	@FXML
	void buscarProductoEvent(ActionEvent event) {

	}

	@FXML
	void initialize() {

		//datos tabla cliente
		this.colDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
		this.colNombre1.setCellValueFactory(new PropertyValueFactory<>("nombres"));
		this.colApellido.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
		this.colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
		this.colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
		this.colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
		this.colDepartamento.setCellValueFactory(new PropertyValueFactory<>("departamento")); 

		tblListaClientes.getSelectionModel ().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {

			clienteSeleccionado = newSelection;
			mostrarInformacioncliente(clienteSeleccionado);  

		});
		
		
		//datos tabla producto
		this.colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		this.colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.colSede.setCellValueFactory(new PropertyValueFactory<>("sede"));
		this.colCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
		this.colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
		this.colStock.setCellValueFactory(new PropertyValueFactory<>("stock"));
		

		tblListaProductos.getSelectionModel ().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {

			productoSeleccionado = newSelection;
			mostrarInformacionProducto(productoSeleccionado); 
		
		});
		
		cbxCategoriaProducto.getItems().addAll(Categoria.TECNOLOGIA, Categoria.MOVIL, Categoria.TECNOLOGIA_COMPUTACIONAL, Categoria.MUSICA, Categoria.HOGAR, Categoria.EMRESARIALES);
		cbxSede.getItems().addAll("Armenia","Bogota","Pereira");
		

	}


	private void mostrarInformacioncliente(Cliente clienteSeleccionado) {

		if (clienteSeleccionado != null) { 
			txtNombres.setText(clienteSeleccionado.getNombres());
			txtDocumento.setText(clienteSeleccionado.getDocumento());
			txtApellidos.setText(clienteSeleccionado.getApellidos());
			txtCorreo.setText(clienteSeleccionado.getCorreo());
			txtTelefono.setText(clienteSeleccionado.getTelefono());
			txtDepartamento.setText(clienteSeleccionado.getDepartamento());
			txtCiudad.setText(clienteSeleccionado.getCiudad());
		}

	}
	
	private void mostrarInformacionProducto(Producto productoSeleccionado) {

		if (productoSeleccionado != null) { 
			txtCodigo.setText(Integer.toString(productoSeleccionado.getCodigo())); 
			txtNombre.setText(productoSeleccionado.getNombre());
			txtPrecio.setText(Double.toString(productoSeleccionado.getPrecio()));
			txtStock.setText(Integer.toString(productoSeleccionado.getStock()));
			cbxSede.setValue(productoSeleccionado.getSede());
			cbxCategoriaProducto.setValue(productoSeleccionado.getCategoria());
			
		}

	}



	public void setAplicacion (Aplicacion aplicacion) {

		this.aplicacion = aplicacion;
		tblListaClientes.getItems().clear();
		tblListaClientes.setItems(getListaClientesData());
		
		tblListaProductos.getItems().clear();
		tblListaProductos.setItems(getListaProductosData());


	}

	public ObservableList<Cliente> getListaClientesData(){

		listaClientesData.addAll(aplicacion.obtenerClientes());
		return listaClientesData;
	}
	
	public ObservableList<Producto> getListaProductosData(){

		listaProductosData.addAll(aplicacion.obtenerProductos());
		return listaProductosData;
	}


	private void nuevoCliente() {

		txtNombres.setText("Ingrese el nombre(s)");
		txtDocumento.setText("Ingrese el documento");
		txtApellidos.setText("Ingrese el apellido(s)");
		txtCorreo.setText("Ingrese el correo");
		txtTelefono.setText("Ingrese el telefono");
		txtDepartamento.setText("Ingrese el departamento");
		txtCiudad.setText("Ingrese la ciudad");

	}
	
	private void nuevoProducto() {

		txtNombres.setText("Ingrese el nombre(s)");
		txtDocumento.setText("Ingrese el documento");
		txtApellidos.setText("Ingrese el apellido(s)");
		txtCorreo.setText("Ingrese el correo");
		txtTelefono.setText("Ingrese el telefono");
		txtDepartamento.setText("Ingrese el departamento");
		txtCiudad.setText("Ingrese la ciudad");

	}


	private void agregarCliente() {

		//Capturar datos de interfaz
		String nombre = txtNombres.getText();
		String documento = txtDocumento.getText();
		String apellidos = txtApellidos.getText();
		String correo = txtCorreo.getText();
		String telefono = txtTelefono.getText();
		String departamento = txtDepartamento.getText();
		String ciudad = txtCiudad.getText();


		if (datosValidos(nombre, documento, apellidos, correo, telefono, departamento, ciudad) == true) {

			Cliente cliente = null;

			cliente = aplicacion.crearCliente(nombre, documento, apellidos, correo, telefono, departamento, ciudad);

			if (cliente != null) {

				listaClientesData.add(cliente);
				limpiarCamposTexto();
				mostrarMensaje("Notificacion cliente", "Cliente registrado", "El cliente se ha registrado con exito", AlertType.INFORMATION);

			}else {
				mostrarMensaje("Notificacion cliente", "Cliente NO registrado", "El cliente ya se encuentra registrado", AlertType.ERROR);
			}

		}
		
	}
	
	private void agregarProducto() {

		//Capturar datos de interfaz
		int codigo = Integer.parseInt(txtCodigo.getText());
		String sede = cbxSede.getValue();
		Categoria categoria = (Categoria) cbxCategoriaProducto.getValue();
		Double precio = Double.parseDouble(txtPrecio.getText());
		int stock = Integer.parseInt(txtStock.getText());
		String nombre = txtNombre.getText();
		


		if (datosValidosProducto(codigo, sede, categoria , precio, stock, nombre) == true) {

			Producto producto = null;

			producto = aplicacion.crearProducto(codigo, sede, categoria, precio, stock, nombre);

			if (producto != null) {

				listaProductosData.addAll(producto);
				limpiarCamposTexto();
				mostrarMensaje("Notificacion producto", "Producto registrado", "El producto se ha registrado con exito", AlertType.INFORMATION);

			}else {
				mostrarMensaje("Notificacion producto", "Producto NO registrado", "El producto ya se encuentra registrado", AlertType.ERROR);
			}

		}
		//Validar datos

		//Almacenar datos

	}

	private void limpiarCamposTexto() {

		txtNombres.setText("");
		txtDocumento.setText("");
		txtApellidos.setText("");
		txtCorreo.setText("");
		txtTelefono.setText("");
		txtDepartamento.setText("");
		txtCiudad.setText("");
	}
	
	private void limpiarCamposTextoPro() {

		txtNombres.setText("");
		txtDocumento.setText("");
		txtApellidos.setText("");
		txtCorreo.setText("");
		txtTelefono.setText("");
		txtDepartamento.setText("");
		txtCiudad.setText("");
	}

	private void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {
		Alert alerta = new Alert(alertType);
		alerta.setTitle(titulo);
		alerta.setHeaderText(header);
		alerta.setContentText(contenido);
		alerta.showAndWait();

	}

	//datos validos para cliente
	private boolean datosValidos(String nombre, String documento, String apellidos, String correo, String telefono,
			String departamento, String ciudad) {

		String mensaje = "";

		if (nombre == null || nombre.equals("")) {
			mensaje += "El nombre es invalido \n";
		}

		if (documento == null || documento.equals("")) {
			mensaje += "El documento es invalido \n";
		}
		if (apellidos == null || apellidos.equals("")) {
			mensaje += "El apellidos es invalido \n";
		}
		if (correo == null || correo.equals("")) {
			mensaje += "El correo es invalido \n";
		}
		if (telefono == null || telefono.equals("")) {
			mensaje += "El telefono es invalido \n";
		}
		if (departamento == null || departamento.equals("")) {
			mensaje += "El departamento es invalido \n";
		}
		if (ciudad == null || ciudad.equals("")) {
			mensaje += "El ciudad es invalido \n";
		}


		if (mensaje.equals("")) {
			return true;
		}else {
			mostrarMensaje("Notificacion cliente","Datos invalidos",mensaje, AlertType.WARNING);
			return false;
		}

	}
	
	
	//datos validos para producto
	private boolean datosValidosProducto(int codigo, String sede, Object categoria, Double precio,  int stock, String nombre) {

		String mensaje = "";

		if (codigo == 0 ) {
			mensaje += "El codigo es invalido \n";
		}

//		if (sede == null || sede.equals("")) {
//			mensaje += "la sede es invalido \n";
//		}
		if (categoria == null || categoria.equals("")) {
			mensaje += "la categoria es invalido \n";
		}
		if (precio == null || precio.equals("")) {
			mensaje += "El precio es invalido \n";
		}
		if (stock == 0) {
			mensaje += "El stock es invalido \n";
		}
		if (nombre == null || nombre.equals("")) {
			mensaje += "El nombre es invalido \n";
		}
	
		if (mensaje.equals("")) {
			return true;
		}else {
			mostrarMensaje("Notificacion producto","Datos invalidos",mensaje, AlertType.WARNING);
			return false;
		}

	}

	private void eliminarCliente() {

		boolean banderaClienteEliminado = false;

		if (mostrarMensajeConfirmacion("¿Estas seguro de eliminar el cliente?") == true) {

			if (clienteSeleccionado != null) {

				banderaClienteEliminado = aplicacion.eliminarCliente(clienteSeleccionado.getDocumento());

				if (banderaClienteEliminado == true) {

					listaClientesData.remove(clienteSeleccionado);
					tblListaClientes.getSelectionModel().clearSelection();
					limpiarCamposTexto();
					mostrarMensaje("Notificacion cliente","Eliminacion","El cliente fue eliminado con exito", AlertType.WARNING);

				}else {
					mostrarMensaje("Notificacion cliente", "Cliente NO registrado", "El cliente no se puede eliminar", AlertType.ERROR);
				}
			}else {
				mostrarMensaje("Notificacion cliente", "Cliente NO seleccionado", "Debe seleccionar un cliente", AlertType.ERROR);
			}

		}

	}
	
	
	private void eliminarProducto() {
		
		boolean banderaProductoEliminado = false;
		
		if (mostrarMensajeConfirmacion("¿Estas seguro de eliminar el producto?") == true) {

			if (productoSeleccionado != null) {

				banderaProductoEliminado = aplicacion.eliminarProducto(productoSeleccionado.getCodigo());

				if (banderaProductoEliminado == true) {

					listaProductosData.remove(productoSeleccionado);
					tblListaClientes.getSelectionModel().clearSelection();
					limpiarCamposTexto();
					mostrarMensaje("Notificacion producto","Eliminacion","El producto fue eliminado con exito", AlertType.WARNING);

				}else {
					mostrarMensaje("Notificacion producto", "producto NO registrado", "El producto no se puede eliminar", AlertType.ERROR);
				}
			}else {
				mostrarMensaje("Notificacion producto", "producto NO seleccionado", "Debe seleccionar un producto", AlertType.ERROR);
			}

		}
	}

	private boolean mostrarMensajeConfirmacion(String mensaje) {

		Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
		alerta.setHeaderText(null);
		alerta.setTitle("Confirmacion");
		alerta.setContentText(mensaje);

		Optional<ButtonType> acction = alerta.showAndWait();

		if (acction.get() == ButtonType.OK) {
			return true;
		}else {
			return false;
		}


	}

	private void actualizarCliente() {

		String nombre = txtNombres.getText();
		String documento = txtDocumento.getText();
		String apellidos = txtApellidos.getText();
		String correo = txtCorreo.getText();
		String telefono = txtTelefono.getText();
		String departamento = txtDepartamento.getText();
		String ciudad = txtCiudad.getText();

		boolean banderaClienteActuallizado = false;

		if (clienteSeleccionado != null) {

			if (datosValidos(nombre, documento, apellidos, correo, telefono, departamento, ciudad) == true) {
				
				banderaClienteActuallizado = aplicacion.actializarCliente(clienteSeleccionado.getDocumento(), nombre, apellidos, documento, ciudad, departamento, correo, telefono);

				if (banderaClienteActuallizado == true) {

					tblListaClientes.refresh();
					
					mostrarMensaje("Notificacion cliente","Actualizacion","El cliente fue actualizado con exito", AlertType.WARNING);

				}else {
					mostrarMensaje("Notificacion cliente","Actualizacion","El NO cliente fue actualizado con exito", AlertType.WARNING);
				}
			}

			else {
				mostrarMensaje("Notificacion cliente", "Cliente NO registrado", "El cliente no se puede eliminar", AlertType.ERROR);
			}
		}

	}


	//	assert tblListaVenta != null : "fx:id=\"tblListaVenta\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert colNombre != null : "fx:id=\"colNombre\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert colCategoria != null : "fx:id=\"colCategoria\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtDocumento != null : "fx:id=\"txtDocumento\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert colStock != null : "fx:id=\"colStock\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert tblProductoMasVendido != null : "fx:id=\"tblProductoMasVendido\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert colDocumento != null : "fx:id=\"colDocumento\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert tblClientesMayoresCompras != null : "fx:id=\"tblClientesMayoresCompras\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert btnAgregarProducto != null : "fx:id=\"btnAgregarProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert colPrecio != null : "fx:id=\"colPrecio\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert colCorreo != null : "fx:id=\"colCorreo\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert tblListaProductos != null : "fx:id=\"tblListaProductos\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtTelefono != null : "fx:id=\"txtTelefono\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert tblSede != null : "fx:id=\"tblSede\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtAdministracionRangoSede != null : "fx:id=\"txtAdministracionRangoSede\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert cbxVentaSede != null : "fx:id=\"cbxVentaSede\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtAdministracionRangoProducto != null : "fx:id=\"txtAdministracionRangoProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtNombres != null : "fx:id=\"txtNombres\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert btnAgregarCliente != null : "fx:id=\"btnAgregarCliente\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert btnActualizarProducto != null : "fx:id=\"btnActualizarProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert tblVentas != null : "fx:id=\"tblVentas\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert tblListaClientes != null : "fx:id=\"tblListaClientes\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert btnRealizarVenta != null : "fx:id=\"btnRealizarVenta\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtCategoria != null : "fx:id=\"txtCategoria\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert colCodigo != null : "fx:id=\"colCodigo\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtApellidos != null : "fx:id=\"txtApellidos\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtStock != null : "fx:id=\"txtStock\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert btnActualizarCliente != null : "fx:id=\"btnActualizarCliente\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert cbxSede != null : "fx:id=\"cbxSede\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert cbxCliente != null : "fx:id=\"cbxCliente\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtCorreo != null : "fx:id=\"txtCorreo\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtVentaProducto != null : "fx:id=\"txtVentaProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert colApellido != null : "fx:id=\"colApellido\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert tblSedesProductosDisponibles != null : "fx:id=\"tblSedesProductosDisponibles\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert btnEliminarProducto != null : "fx:id=\"btnEliminarProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert btnEliminarCliente != null : "fx:id=\"btnEliminarCliente\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert txtAdministracionCodigoProducto != null : "fx:id=\"txtAdministracionCodigoProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert colTelefono != null : "fx:id=\"colTelefono\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert btnBuscar != null : "fx:id=\"btnBuscar\" was not injected: check your FXML file 'InstacompraView.fxml'.";
	//    assert colSede != null : "fx:id=\"colSede\" was not injected: check your FXML file 'InstacompraView.fxml'.";



}
