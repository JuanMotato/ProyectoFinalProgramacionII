package co.uniquindio.edu.instaCompra;

import java.io.IOException;
import java.util.ArrayList;

import co.uniquindio.edu.instaCompra.controller.InstacompraController;
import co.uniquindio.edu.instaCompra.model.Cliente;
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
	
	public ArrayList<Cliente>obtenerClientes(){
		return tiendaElectronica.getListaCliente();
	}

	public Cliente crearCliente(String nombre, String documento, String apellidos, String correo, String telefono,
			String departamento, String ciudad) {
		
		Cliente cliente = null;
		cliente = tiendaElectronica.crearCliente(nombre, documento, apellidos, correo, telefono, departamento, ciudad);
		
		
		return cliente;
	}

	public boolean eliminarCliente(String documento) {
		
		return tiendaElectronica.eliminarCliente(documento);
	}

	public boolean actializarCliente(String documentoActual, String nombre, String apellidos, String documento,
			String ciudad, String departamento, String correo, String telefono) {
		
		return tiendaElectronica.actualizarCliente(documentoActual, nombre, apellidos, documento, ciudad, departamento, correo, telefono);
	}

}
