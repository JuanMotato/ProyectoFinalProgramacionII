package co.uniquindio.edu.instaCompra;

import java.io.IOException;
import java.util.ArrayList;

import co.uniquindio.edu.instaCompra.controller.InstacompraController;
import co.uniquindio.edu.instaCompra.model.Categoria;
import co.uniquindio.edu.instaCompra.model.Cliente;
import co.uniquindio.edu.instaCompra.model.Producto;
import co.uniquindio.edu.instaCompra.model.TiendaElectronica;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Aplicacion extends Application{
	
	private Stage primaryStage;
	
	TiendaElectronica tiendaElectronica = new TiendaElectronica();  
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("InstaCompra");    
		mostrarVentanaPrincipal();
	}
	
	private void mostrarVentanaPrincipal() {
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("view/InstacompraView.fxml"));
			
			AnchorPane rootLayout = (AnchorPane)loader.load();
			
			InstacompraController instacompraController = loader.getController();
			instacompraController.setAplicacion(this);
			
			Scene scene = new Scene(rootLayout); 
			primaryStage.setScene(scene);
			primaryStage.show();	
		} catch (IOException e) {
			// TODO: handle exception 
			e.printStackTrace();
		}
	}
	
	public static void main(String [] args) {
		launch(args);
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public void setPrimaryStage ( Stage primaryStage) {
		
		this.primaryStage = primaryStage;
	}
	
	// Cliente CRUD
	public ArrayList<Cliente>obtenerClientes(){
		return tiendaElectronica.getListaCliente();
	}

	public Cliente crearCliente(String ciudad, String departamento, int documento, String nombres,String correo, String direccion, String fechaNacimiento) {
		
		Cliente cliente = null;
		cliente = tiendaElectronica.crearCliente(ciudad,  departamento,  documento,  nombres, correo,  direccion,  fechaNacimiento);
		
		
		return cliente;
	}

	public boolean eliminarCliente(int documento) {
		
		return tiendaElectronica.eliminarCliente(documento);
	}

	public boolean actializarCliente(int documentoActual, String ciudad, String departamento, int documento, String nombres,String correo, String direccion, String fechaNacimiento) {
		
		return tiendaElectronica.actualizarCliente( documentoActual,  ciudad,  departamento,  documento,  nombres, correo,  direccion,  fechaNacimiento);
	}
	
	//CRUD Producto
	
	public ArrayList<Producto>obtenerProductos(){
		return tiendaElectronica.getListProductos();
	}

	public Producto crearProducto(int codigo, String sede, Categoria categoria, double precio, int stock, String nombre) {
		
		Producto producto = null;
		producto = tiendaElectronica.crearProducto(codigo, sede, categoria, precio, stock, nombre);
		
		
		return producto;
	}

	public boolean eliminarProducto(int codigo) {
		
		return tiendaElectronica.eliminarProducto(codigo);
		
	}

	public boolean actializarProducto(int codigoActual, int codigo, String sede, Categoria categoria, Double precio, int stock,
			String nombre) {
		
		return tiendaElectronica.actualizarProducto(codigoActual,codigo, sede, categoria, precio, stock, nombre);

	}

	public Producto verificarExistenciaProducto(int idBuscar) {

		boolean existeProducto = false;
		Producto producto = null;

		existeProducto= tiendaElectronica.validarProducto(idBuscar);

		if(existeProducto){

			producto=tiendaElectronica.buscarProducto(idBuscar);

			return producto;
		}else{
			return producto;
		}

	}

}
