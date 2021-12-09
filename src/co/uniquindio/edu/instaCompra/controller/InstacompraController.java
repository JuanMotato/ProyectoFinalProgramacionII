package co.uniquindio.edu.instaCompra.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.uniquindio.edu.instaCompra.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InstacompraController {
	
	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> tblListaVenta;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableColumn<?, ?> colCategoria;

    @FXML
    private TextField txtDocumento;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TableColumn<?, ?> colStock;

    @FXML
    private TableColumn<?, ?> tblProductoMasVendido;

    @FXML
    private TextField txtNombre;

    @FXML
    private TableColumn<?, ?> colDocumento;

    @FXML
    private TableColumn<?, ?> tblClientesMayoresCompras;

    @FXML
    private Button btnAgregarProducto;

    @FXML
    private TableColumn<?, ?> colPrecio;

    @FXML
    private TableColumn<?, ?> colCorreo;

    @FXML
    private TableView<?> tblListaProductos;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TableColumn<?, ?> tblSede;

    @FXML
    private TextField txtAdministracionRangoSede;

    @FXML
    private ComboBox<?> cbxVentaSede;

    @FXML
    private TextField txtAdministracionRangoProducto;

    @FXML
    private TextField txtNombres;

    @FXML
    private Button btnAgregarCliente;

    @FXML
    private Button btnActualizarProducto;

    @FXML
    private TableView<?> tblVentas;

    @FXML
    private TableView<?> tblListaClientes;

    @FXML
    private Button btnRealizarVenta;

    @FXML
    private TextField txtCategoria;

    @FXML
    private TableColumn<?, ?> colCodigo;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtStock;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private ComboBox<?> cbxSede;

    @FXML
    private TextField txtCodigo;

    @FXML
    private ComboBox<?> cbxCliente;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtVentaProducto;

    @FXML
    private TableColumn<?, ?> colApellido;

    @FXML
    private TableColumn<?, ?> tblSedesProductosDisponibles;

    @FXML
    private Button btnEliminarProducto;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private TextField txtAdministracionCodigoProducto;

    @FXML
    private TableColumn<?, ?> colTelefono;

    @FXML
    private Button btnBuscar;

    @FXML
    private TableColumn<?, ?> colSede;
    
    public InstacompraController() {

	}

    @FXML
    void agregarCllienteEvent(ActionEvent event) {

    }

    @FXML
    void actualizarClienteEvent(ActionEvent event) {

    }

    @FXML
    void eliminarClienteEvent(ActionEvent event) {

    }

    @FXML
    void agregarProductoEvent(ActionEvent event) {

    }

    @FXML
    void actualizarProductoEvent(ActionEvent event) {

    }

    @FXML
    void eliminarProductoEvent(ActionEvent event) {

    }

    @FXML
    void realizarVentaEvent(ActionEvent event) {

    }

    @FXML
    void buscarProductoEvent(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert tblListaVenta != null : "fx:id=\"tblListaVenta\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert colNombre != null : "fx:id=\"colNombre\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert colCategoria != null : "fx:id=\"colCategoria\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtDocumento != null : "fx:id=\"txtDocumento\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert colStock != null : "fx:id=\"colStock\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert tblProductoMasVendido != null : "fx:id=\"tblProductoMasVendido\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert colDocumento != null : "fx:id=\"colDocumento\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert tblClientesMayoresCompras != null : "fx:id=\"tblClientesMayoresCompras\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert btnAgregarProducto != null : "fx:id=\"btnAgregarProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert colPrecio != null : "fx:id=\"colPrecio\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert colCorreo != null : "fx:id=\"colCorreo\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert tblListaProductos != null : "fx:id=\"tblListaProductos\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtTelefono != null : "fx:id=\"txtTelefono\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert tblSede != null : "fx:id=\"tblSede\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtAdministracionRangoSede != null : "fx:id=\"txtAdministracionRangoSede\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert cbxVentaSede != null : "fx:id=\"cbxVentaSede\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtAdministracionRangoProducto != null : "fx:id=\"txtAdministracionRangoProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtNombres != null : "fx:id=\"txtNombres\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert btnAgregarCliente != null : "fx:id=\"btnAgregarCliente\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert btnActualizarProducto != null : "fx:id=\"btnActualizarProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert tblVentas != null : "fx:id=\"tblVentas\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert tblListaClientes != null : "fx:id=\"tblListaClientes\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert btnRealizarVenta != null : "fx:id=\"btnRealizarVenta\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtCategoria != null : "fx:id=\"txtCategoria\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert colCodigo != null : "fx:id=\"colCodigo\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtApellidos != null : "fx:id=\"txtApellidos\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtStock != null : "fx:id=\"txtStock\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert btnActualizarCliente != null : "fx:id=\"btnActualizarCliente\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert cbxSede != null : "fx:id=\"cbxSede\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert cbxCliente != null : "fx:id=\"cbxCliente\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtCorreo != null : "fx:id=\"txtCorreo\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtVentaProducto != null : "fx:id=\"txtVentaProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert colApellido != null : "fx:id=\"colApellido\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert tblSedesProductosDisponibles != null : "fx:id=\"tblSedesProductosDisponibles\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert btnEliminarProducto != null : "fx:id=\"btnEliminarProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert btnEliminarCliente != null : "fx:id=\"btnEliminarCliente\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert txtAdministracionCodigoProducto != null : "fx:id=\"txtAdministracionCodigoProducto\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert colTelefono != null : "fx:id=\"colTelefono\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert btnBuscar != null : "fx:id=\"btnBuscar\" was not injected: check your FXML file 'InstacompraView.fxml'.";
        assert colSede != null : "fx:id=\"colSede\" was not injected: check your FXML file 'InstacompraView.fxml'.";

    }
	
	
	
	public void setAplicacion (Aplicacion aplicacion) {

	}
	

}
