package ejercicio3;

public class instPolideportivo {
	
	private instDeportiva instdeportiva; 
	private instEdificio instedificio;
	
	public instPolideportivo() {
		
	}

	public instPolideportivo(instDeportiva instdeportiva, instEdificio instedificio) {
		super();
		this.instdeportiva = instdeportiva;
		this.instedificio = instedificio;
	}

	public instDeportiva getInstdeportiva() {
		return instdeportiva;
	}

	public void setInstdeportiva(instDeportiva instdeportiva) {
		this.instdeportiva = instdeportiva;
	}

	public instEdificio getInstedificio() {
		return instedificio;
	}

	public void setInstedificio(instEdificio instedificio) {
		this.instedificio = instedificio;
	}
	
	
	
}
