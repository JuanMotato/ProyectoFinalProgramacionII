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

	ObservableList<Producto> listaProductosDataAdministracion = FXCollections.observableArrayList();

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
	private TextField txtFechaNacimiento;

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
	private TextField txtDireccion;

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
	private TableColumn<Producto, String> tblSedesProductosDisponibles;

	@FXML
	private TableColumn<Producto, Integer> colCodigoProductoAdministracion;

	@FXML
	private TableColumn<Producto, Categoria> colCategoriaProductoAdministracion;

	@FXML
	private TableColumn<Producto, String> colNombreProductoAdministracion;

	@FXML
	private TableColumn<Producto, Integer> colStockProductoAdministracion;

	@FXML
	private TableColumn<Producto, String> colSedeProductoAdministracion;

	@FXML
	private TableColumn<Producto, Double> colPrecioProductoAdministracion;

	@FXML
	private TableView<Producto> tblBusquedaProducto;

	@FXML
	private Button btnEliminarProducto;

	@FXML
	private Button btnNuevoProducto;

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
	
	@FXML
    private TableColumn<?, ?> colCodigoProductoVenta;
	
	@FXML
    private TableColumn<?, ?> colNombreProductoVenta;

	@FXML
	private TableColumn<?, ?> colStockProductoVenta;
	
	@FXML
	private TableColumn<?, ?> colPrecioProductoVenta;
	
	@FXML
	private TextField txtCantidadProducto;
	
	@FXML
	private TableColumn<?, ?> colTotalVenta;

	@FXML
	private TableColumn<?, ?> colCodigoVenta;

	@FXML
	private TableColumn<?, ?> colCantidadVenta;

	@FXML
	private TableColumn<?, ?> colPrecioUnitarioVenta;

	@FXML
	private TableColumn<?, ?> colSedeVenta;

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
		actualizarProducto();
	}

	@FXML
	void nuevoProductoEvent(ActionEvent event) {

		nuevoProducto();
	}

	@FXML
	void eliminarProductoEvent(ActionEvent event) {     

		eliminarProducto();

	}

	@FXML
	void buscarProductoEvent(ActionEvent event) {

		buscarCodigoProducto();

	}

	@FXML
	void realizarVentaEvent(ActionEvent event) {

	}

	@FXML
	void actualizarVentaEvent(ActionEvent event) {

	}

	@FXML
	void eliminarVentaEvent(ActionEvent event) {

	}

	@FXML
	void initialize() {

		//datos tabla cliente
		this.colDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
		this.colNombre1.setCellValueFactory(new PropertyValueFactory<>("nombres"));
		this.colApellido.setCellValueFactory(new PropertyValueFactory<>("direccion"));
		this.colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
		this.colTelefono.setCellValueFactory(new PropertyValueFactory<>("fecchaNacimiento"));
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

		//datos tabla producto
		this.colCodigoProductoAdministracion.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		this.colNombreProductoAdministracion.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.colSedeProductoAdministracion.setCellValueFactory(new PropertyValueFactory<>("sede"));
		this.colCategoriaProductoAdministracion.setCellValueFactory(new PropertyValueFactory<>("categoria"));
		this.colPrecioProductoAdministracion.setCellValueFactory(new PropertyValueFactory<>("precio"));
		this.colStockProductoAdministracion.setCellValueFactory(new PropertyValueFactory<>("stock"));

	}


	private void mostrarInformacioncliente(Cliente clienteSeleccionado) {

		if (clienteSeleccionado != null) { 
			txtNombres.setText(clienteSeleccionado.getNombres());
			txtDocumento.setText(Integer.toString(clienteSeleccionado.getDocumento()));
			txtDireccion.setText(clienteSeleccionado.getDireccion());
			txtCorreo.setText(clienteSeleccionado.getCorreo());
			txtFechaNacimiento.setText(clienteSeleccionado.getFecchaNacimiento());
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

		txtNombres.setPromptText("Ingrese el nombre(s)");
		txtDocumento.setPromptText("Ingrese el documento");
		txtDireccion.setPromptText("Ingrese el apellido(s)");
		txtCorreo.setPromptText("Ingrese el correo");
		txtFechaNacimiento.setPromptText("Ingrese el telefono");
		txtDepartamento.setPromptText("Ingrese el departamento");
		txtCiudad.setPromptText("Ingrese la ciudad");

	}

	private void nuevoProducto() {

		txtCodigo.setPromptText("Ingrese el nuevo codigo"); 
		txtNombre.setPromptText("Ingrese el nuevo nombre");
		txtPrecio.setPromptText("0.0");
		txtStock.setPromptText("0");


	}


	private void agregarCliente() {

		//Capturar datos de interfaz
		String nombre = "";
		int documento = 0;
		String direccion = "";
		String correo = "";
		String fechaNacimiento = "";
		String departamento = "";
		String ciudad = "";
		
		try { 
			 nombre = txtNombres.getText();
			 documento = Integer.parseInt(txtDocumento.getText());
			 direccion = txtDireccion.getText();
			 correo = txtCorreo.getText();
			 fechaNacimiento = txtFechaNacimiento.getText();
			 departamento = txtDepartamento.getText();
			 ciudad = txtCiudad.getText();
			} catch (NumberFormatException e) {
				// ... } if (s != null) { ... }
		}


		if (datosValidos( ciudad,  departamento,  documento,  nombre, correo,  direccion,  fechaNacimiento) == true) {

			Cliente cliente = null;

			cliente = aplicacion.crearCliente( ciudad,  departamento,  documento,  nombre, correo,  direccion,  fechaNacimiento);

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
		int codigo = 0;
		String sede = "";
		Categoria categoria = null ;
		Double precio = 0.0;
		int stock = 0;
		String nombre = "";
		try { 
			 codigo = Integer.parseInt(txtCodigo.getText());
			 sede = cbxSede.getValue();
			 categoria = (Categoria) cbxCategoriaProducto.getValue();
			 precio = Double.parseDouble(txtPrecio.getText());
			 stock = Integer.parseInt(txtStock.getText());
			 nombre = txtNombre.getText();
			} catch (NumberFormatException e) {
				// ... } if (s != null) { ... }
		}

		if (datosValidosProducto(codigo, sede, categoria , precio, stock, nombre) == true) {

			Producto producto = null;

			producto = aplicacion.crearProducto(codigo, sede, categoria, precio, stock, nombre);

			if (producto != null) {

				listaProductosData.addAll(producto);
				limpiarCamposTextoPro();
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
		txtDireccion.setText("");
		txtCorreo.setText("");
		txtFechaNacimiento.setText("");
		txtDepartamento.setText("");
		txtCiudad.setText("");
	}

	private void limpiarCamposTextoPro() {

		txtCodigo.setText(""); 
		txtNombre.setText("");
		txtPrecio.setText("");
		txtStock.setText("");
	}

	private void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {
		Alert alerta = new Alert(alertType);
		alerta.setTitle(titulo);
		alerta.setHeaderText(header);
		alerta.setContentText(contenido);
		alerta.showAndWait();

	}

	//datos validos para cliente
	private boolean datosValidos(String ciudad, String departamento, int documento, String nombres,String correo, String direccion, String fechaNacimiento) {

		String mensaje = "";

		if (nombres == null || nombres.equals("")) {
			mensaje += "El nombre es invalido \n";
		}

		if (documento == 0 ) {
			mensaje += "El documento es invalido \n";
		}
		if (direccion == null || direccion.equals("")) {
			mensaje += "La direccion es invalido \n";
		}
		if (correo == null || correo.equals("")) {
			mensaje += "El correo es invalido \n";
		}
		if (fechaNacimiento == null || fechaNacimiento.equals("")) {
			mensaje += "La fechaNacimiento es invalido \n";
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
		System.out.println(codigo);
		
		if (codigo == 0 ) {
			mensaje += "El codigo es invalido \n";
		}

		if (sede == null || sede.equals("")) {
			mensaje += "la sede es invalido \n";
		}
		if (categoria == null) {
			mensaje += "la categoria es invalido \n";
		}
		if (precio == 0.0 || precio == null) {
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
		int  documento = Integer.parseInt(txtDocumento.getText());
		String direccion = txtDireccion.getText();
		String correo = txtCorreo.getText();
		String fechaNacimiento = txtFechaNacimiento.getText();
		String departamento = txtDepartamento.getText();
		String ciudad = txtCiudad.getText();

		boolean banderaClienteActuallizado = false;

		if (clienteSeleccionado != null) {

			if (datosValidos( ciudad,  departamento,  documento,  nombre, correo,  direccion,  fechaNacimiento) == true) {

				banderaClienteActuallizado = aplicacion.actializarCliente(clienteSeleccionado.getDocumento(),  ciudad,  departamento,  documento,  nombre, correo,  direccion,  fechaNacimiento);

				if (banderaClienteActuallizado == true) {

					tblListaClientes.getSelectionModel().select(null);;
					limpiarCamposTexto();
					nuevoCliente();
					tblListaClientes.refresh();

					mostrarMensaje("Notificacion cliente","Actualizacion","El cliente fue actualizado con exito", AlertType.WARNING);

				}else {
					mostrarMensaje("Notificacion cliente","Actualizacion","El Ya esta registrado", AlertType.WARNING);
				}
			}

			else {
				mostrarMensaje("Notificacion cliente", "Cliente NO registrado", "El cliente no se puede eliminar", AlertType.ERROR);
			}
		}

	}


	private void actualizarProducto() {

		int codigo = Integer.parseInt(txtCodigo.getText());
		String sede = cbxSede.getValue();
		Categoria categoria = (Categoria) cbxCategoriaProducto.getValue();
		Double precio = Double.parseDouble(txtPrecio.getText());
		int stock = Integer.parseInt(txtStock.getText());
		String nombre = txtNombre.getText();

		boolean banderaProductoActuallizado = false;

		if (productoSeleccionado != null) {

			if (datosValidosProducto(codigo, sede, categoria, precio, stock, nombre) == true) {

				banderaProductoActuallizado = aplicacion.actializarProducto(productoSeleccionado.getCodigo(), codigo, sede, categoria, precio, stock, nombre);

				if (banderaProductoActuallizado == true) {
					
					limpiarCamposTextoPro();
					nuevoProducto();
					tblListaProductos.getSelectionModel().select(null);
					tblListaProductos.refresh();

					mostrarMensaje("Notificacion producto","Actualizacion","El producto fue actualizado con exito", AlertType.WARNING);

				}else {
					mostrarMensaje("Notificacion producto","Actualizacion","El producto NO fue actualizado con exito", AlertType.WARNING);
				}
			}

			else {
				mostrarMensaje("Notificacion producto", "Producto NO registrado", "El producto no se puede eliminar", AlertType.ERROR);
			}
		}

	}	

	private void buscarCodigoProducto() {

		tblBusquedaProducto.getItems().clear();
		int codigoBuscar = Integer.parseInt(txtAdministracionCodigoProducto.getText());

		Producto producto = null;

		producto=aplicacion.verificarExistenciaProducto(codigoBuscar);

		if (producto!= null){

			listaProductosDataAdministracion.add(producto);
			tblBusquedaProducto.setItems(listaProductosDataAdministracion);	 	 
		} 

	}



}
