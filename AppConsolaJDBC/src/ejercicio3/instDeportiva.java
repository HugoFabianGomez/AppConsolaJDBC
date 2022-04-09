package ejercicio3;

public class instDeportiva implements Instalacion {
	
	private int tipoDeInstalacion;
	
	public instDeportiva() {
		
	}
	
	
	public instDeportiva(int tipoDeInstalacion) {
		super();
		this.setTipoDeInstalacion(tipoDeInstalacion);
	}


	//Metodo Get	

	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}


	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}



}
