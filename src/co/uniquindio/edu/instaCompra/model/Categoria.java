package co.uniquindio.edu.instaCompra.model;

public enum Categoria {

	TECNOLOGIA(0),MOVIL(1),TECNOLOGIA_COMPUTACIONAL(2), MUSICA(3),HOGAR(4),EMRESARIALES(5);

	private int numCategoria;
	
	Categoria(int numCategoria) {
		this.numCategoria = numCategoria;
	}
	
	public int getNumCategoria() {
		return numCategoria;
	}


}
