package co.uniquindio.edu.instaCompra.model;

public class Administrador {
	
	private String estudios;
	private Sede sede;

	
	public void inicializarAdministrador() {
		Administrador administrador= new Administrador();
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}


	

	
	

}
